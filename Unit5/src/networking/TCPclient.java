package networking;
import java.io.*;
import java.net.*;

public class TCPclient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);

        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        DataInputStream in = new DataInputStream(socket.getInputStream());

        out.writeUTF("Hello from Client!"); // Send message
        System.out.println("Server: " + in.readUTF()); // Read response
        socket.close();
    }
}

