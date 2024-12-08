package networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPclient {

	public static void main(String[] args) throws IOException{
		DatagramSocket socket = new DatagramSocket();
		// Send Request
		byte[] buff = new byte[256];
		InetAddress address = InetAddress.getByName("localhost");
		DatagramPacket packet = new DatagramPacket(buff, buff.length, address, 4445);
		socket.send(packet);
		// Get Response
		packet = new DatagramPacket(buff, buff.length);
		socket.receive(packet);
		// display response
		String received = new String(packet.getData());
		System.out.println(received.length());
		System.out.println("Response from server is " + received);
		socket.close();

	}

}
