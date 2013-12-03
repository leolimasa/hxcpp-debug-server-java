package hxdebugserver;

import java.io.*;
import java.net.Socket;

/**
 * Created by leo on 12/1/13.
 */
public class HxcppProtocol {
    public InputStream in;
    public OutputStream out;

    private static String serverIdent = "Haxe debug server v1.0 ready and willing, sir!\n\n";
    private static String clientIdent = "Haxe debug client v1.0 coming at you!\n\n";

    public void readObject() throws IOException {

        // Reads the size of the object
        String sizeStr = readString(8);
        int size = Integer.parseInt(sizeStr);

        // Reads the serialized object
        String serialized = readString(size);
        System.out.println(serialized);

        // Decodes the serialized object
        Object obj = haxe.Unserializer.run(serialized);
        System.out.println("Decoded");
    }

    public void handshake() throws IOException {
        readString(clientIdent.length());
        writeString(serverIdent);
    }

    /**
     * Reads X number of bytes and returns a string with their ascii
     * @param bytes
     * @return
     */
    private String readString(int bytes) throws IOException {
        byte[] input = new byte[bytes];
        in.read(input, 0, bytes);
        System.out.println("<< " + new String(input));
        return new String(input);
    }

    private void writeString(String str) throws IOException {
        byte[] output = str.getBytes();
        out.write(output);
        System.out.println(">> " + str);
    }

}
