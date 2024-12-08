package networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPserver {
    public static void main(String[] args) throws IOException {
    	byte[] buff = new byte[5];
    	// Create datagram socket
    	DatagramSocket socket = new DatagramSocket(4445);
    	// Receive request
    	DatagramPacket packet = new DatagramPacket(buff, buff.length);
    	socket.receive(packet);
    	InetAddress address = packet.getAddress();
    	int port = packet.getPort();
    	String s = "Hello Client, I am server shrestha";
    	buff = s.getBytes();
    	// Send the response to the client at address and port
    	packet = new DatagramPacket(buff, buff.length, address, port);
    	socket.send(packet);
    	socket.close();
    }
}
