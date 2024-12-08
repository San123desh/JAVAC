package networking;

import java.io.*;
import java.net.*;

public class TCPserver {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server is running...");
        
        Socket socket = server.accept(); // Wait for client
        System.out.println("Client connected!");

        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        String message = in.readUTF(); // Read message
        System.out.println("Client: " + message);

        out.writeUTF("Hello from Server!"); // Send response
        server.close();
    }
}
