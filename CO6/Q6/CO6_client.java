package MyProject;
import java.io.*;
import java.net.*;
public class CO6_client 
{

	public static void main(String[] args) throws IOException
	{
		DatagramSocket c= new DatagramSocket();
		InetAddress add= InetAddress.getByName("localhost");
		String str ="Hello client";
		byte[] buf=str.getBytes();
		DatagramPacket p=new DatagramPacket(buf,buf.length,add,7744);
		c.send(p);
		c.close();
	}

}
