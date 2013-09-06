public class DatagramPacket {
	
	private byte[] buf;
	private int length;
	private int offset;
	private InetAddress address;
	private int port;

	public DatagramPacket(byte[] buf, int length)
	{
		this.buf = buf;
		this.length = length;
	}
	public DatagramPacket(byte[] buf, int length, InetAddress address, int port)
	{
		this.buf = buf;
		this.length = length;
		this.address = address;
		this.port = port;
	}
	
	public byte[] getData() 
	{
		return buf;
	}
	public void setData(byte[] buf) 
	{
		this.buf = buf;
	}
	public int getLength() 
	{
		return length;
	}
	public void setLength(int length) 
	{
		this.length = length;
	}
	public int getOffset() 
	{
		return offset;
	}
	public void setOffset(int offset) 
	{
		this.offset = offset;
	}
	public InetAddress getAddress() 
	{
		return address;
	}
	public void setAddress(InetAddress bcastIP) 
	{
		this.address = bcastIP;
	}
	public int getPort() 
	{
		return port;
	}
	public void setPort(int port) 
	{
		this.port = port;
	}

}