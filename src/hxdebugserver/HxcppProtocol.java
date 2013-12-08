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

    public Object readHaxeObject() throws IOException {

        // Reads the size of the object
        String sizeStr = readString(8);
        int size = Integer.parseInt(sizeStr);

        // Reads the serialized object
        String serialized = readString(size);

        // Decodes the serialized object
        return haxe.Unserializer.run(serialized);
    }

    public void writeHaxeObject(Object obj) throws IOException {
        String serialized = haxe.Serializer.run(obj);

        // Converts the length to string
        String objLength = Integer.toString(serialized.length());

        // Pads with zeroes if needed (needs to be at least 8 bytes)
        while (objLength.length() < 8) {
            objLength = "0" + objLength;
        }

        writeString(objLength);
        writeString(serialized);
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
