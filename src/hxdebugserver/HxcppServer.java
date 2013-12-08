package hxdebugserver;

import org.flashdevelop.cpp.debugger.Command;
import org.flashdevelop.cpp.debugger.Message;
import org.flashdevelop.cpp.debugger.StringList;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leo on 12/1/13.
 */
public class HxcppServer {

    private int port;
    private String host;
    private Socket sock;
    private HxcppProtocol protocol = new HxcppProtocol();

    private static final String THREAD_STOPPED = "ThreadStopped";


    public static void main(String[] args) {
        HxcppServer srv = new HxcppServer();
        srv.setPort(6972);

        try {
            srv.listen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listen() throws IOException {
        System.out.println("Listening on port " + port);
        ServerSocket server = new ServerSocket(port);
        sock = server.accept();

        protocol.in = sock.getInputStream();
        protocol.out = sock.getOutputStream();

        protocol.handshake();
        protocol.readHaxeObject();

        addBreakpont("auspitz/states/LevelSelectState.hx", 90);
        resume();

        checkResponse();

        sock.close();
        System.out.println("Client disconnected.");
        listen();
    }

    private void checkResponse() throws IOException {
        Object obj = null;
        while ((obj = protocol.readHaxeObject()) != null) {
            Message msg = (Message) obj;
            System.out.println("Received message " + msg.toString());

            if (messageMatchesName(msg.toString(), THREAD_STOPPED)) {

                getVariables();
                System.out.println("Thread stopped");
            }
        }
    }


    /**
     * Returns a list of strings with all the class names running in the
     * client application
     *
     * @return
     * @throws IOException
     */
    public List<String> getClasses() throws IOException {
        protocol.writeHaxeObject(Command.Classes);
        Message msg = (Message) protocol.readHaxeObject();


        // The only param should be an array with the classes
        StringList list = (StringList) msg.params.__get(0);

        ArrayList<String> result = new ArrayList<String>();
        flattenStringList(list, result);

        return result;
    }

    public void addBreakpont(String file, int line) throws IOException {
        protocol.writeHaxeObject(Command.AddFileLineBreakpoint(file, line));
        Message msg = (Message) protocol.readHaxeObject();
    }

    public void resume() throws IOException {
        protocol.writeHaxeObject(Command.Continue(1));
        Message msg = (Message) protocol.readHaxeObject();
    }

    public void getVariables() throws IOException {
        protocol.writeHaxeObject(Command.Variables(true));
        Message msg = (Message) protocol.readHaxeObject();

        ArrayList<String> variables = new ArrayList<String>();
        flattenStringList((StringList) msg.params.__get(0), variables);

        expression(variables.get(1));

        System.out.println("Hola");
    }

    public HxcppVariable expression(String expr) throws IOException {
        protocol.writeHaxeObject(Command.PrintExpression(true, expr));
        Message msg = (Message) protocol.readHaxeObject();

        HxcppVariable result = new HxcppVariable();
        result.setName((String) msg.params.__get(0));
        result.setType((String) msg.params.__get(1));
        result.setValue((String) msg.params.__get(2));

        System.out.println(result.getValue());

        return result;
    }


    public void getMem() throws IOException {
        protocol.writeHaxeObject(Command.Mem);
        Message msg = (Message) protocol.readHaxeObject();
        System.out.println("Hola");
    }

    public List<String> getFiles() throws IOException {
        protocol.writeHaxeObject(Command.Files);
        Message msg = (Message) protocol.readHaxeObject();

        // The only param should be an array with the classes
        StringList list = (StringList) msg.params.__get(0);

        ArrayList<String> result = new ArrayList<String>();
        flattenStringList(list, result);

        return result;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    private void flattenStringList(StringList list, ArrayList<String> result) {
        result.add((String) list.params.__get(0));
        if (list.params.length > 1) {
            flattenStringList((StringList) list.params.__get(1), result);
        }
    }

    private boolean messageMatchesName(String msg, String name) {
        String parsedName = msg.substring(0, name.length());
        return parsedName.equals(name);
    }
}
