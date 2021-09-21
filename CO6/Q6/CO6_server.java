package MyProject;
import java.io.*;
import java.net.*;
public class CO6_server 
{

	public static void main(String[] args) throws IOException 
	{
		DatagramSocket server=new DatagramSocket(7744);
		byte[] b=new byte[256];
		DatagramPacket pkt=new DatagramPacket(b,b.length);
		server.receive(pkt);
		String response =new String(pkt.getData());
		System.out.println(" Server : "+response);
		server.close();
	}

}
