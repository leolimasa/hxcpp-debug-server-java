package hxdebugserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by leo on 12/1/13.
 */
public class HxcppServer {

    private int port;
    private String host;
    private Socket sock;
    private HxcppProtocol protocol = new HxcppProtocol();



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

        protocol.readObject();

        sock.close();
        System.out.println("Client disconnected.");
        listen();
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
}
