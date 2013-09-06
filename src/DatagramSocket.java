import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;

import gov.nasa.jpf.jvm.Verify;

public class DatagramSocket {
	
	private InetSocketAddress port;
	private int SO_TIMEOUT = 0;
	private boolean SO_REUSEADDR;
	private boolean SO_BROADCAST;
	
	public DatagramSocket()
	{
		this.port = new InetSocketAddress(8000);
		SO_REUSEADDR = false;
		SO_BROADCAST = true;
	}
	
	public DatagramSocket(InetSocketAddress port)
	{
		this.port = port;
		SO_REUSEADDR = false;
		SO_BROADCAST = true;
	}
	
	public void bind(InetSocketAddress inetSocketAddress)
	{
		this.port = inetSocketAddress;
	}
	
	public void setReuseAddress(boolean b)
	{
		SO_REUSEADDR = b;
	}
	
	public void setBroadcast(boolean on)
	{
		SO_BROADCAST = on;
	}
	
	public void setSoTimeout(int timeout) throws SocketException
	{
		SO_TIMEOUT = timeout;
	}
	
	public int getSoTimeout()
	{
		return SO_TIMEOUT;
	}
	
	public void send(DatagramPacket p) throws IOException
	{
		Thread.currentThread().interrupt();
		LinkedList<DatagramPacket> queue = ProcessStartup.getQueue();
		if(Verify.randomBool())
		//if(true)
		{
			// Queue has at least one element
			if(queue.size() > 1)
			{
			queue.add((Verify.random(queue.size())), p);
			//queue.add(p);
			}
			// Queue is currently empty
			else 
			{
				queue.add(p);
			}
		}
	}
	
	public synchronized void receive(DatagramPacket p) throws SocketTimeoutException, IOException
	{
		LinkedList<DatagramPacket> queue = ProcessStartup.getQueue();
		while(queue.size() == 0)
		{
			try {
				//this.wait(SO_TIMEOUT);
				Thread.sleep(SO_TIMEOUT);
				throw new SocketTimeoutException("Timeout");	// timeout
			}
			catch(InterruptedException e)
			{
				//System.err.println(e.getMessage());
				break;
			} 
		}
		if(queue.size() > 0)
		{
			p = queue.poll();

		}

	}

}
