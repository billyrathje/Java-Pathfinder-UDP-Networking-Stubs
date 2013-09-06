import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;


public class MACLayer {

	private RF_noclock rf = new RF_noclock(new PrintWriter(System.out), null);

	
	public void send(byte[] data)
	{
		rf.transmit(data);
	}
	
	public synchronized byte[] receive()
	{
		DatagramPacket p = new DatagramPacket(new byte[255], 0);
		if(rf.dataWaiting())
		{
			return rf.receive();
		}
		return null;
	}

	public RF_noclock getRF()
	{
		return rf;
	}
}
