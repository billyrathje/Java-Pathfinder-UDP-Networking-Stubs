/**
 * Stub class for InetAddress
 * @author williamrathje
 *
 */

public class InetAddress {

	private String ip;
	private int port;
	
	public InetAddress(String ip, int port)
	{
		this.ip = ip;
		this.port = port;
	}
	public InetAddress(String ip)
	{
		this.ip = ip;
		this.port = 0;
	}
	
	public static InetAddress getByAddress(byte[] data) throws UnknownHostException
	{
		return new InetAddress(String.valueOf((int) data[0]) + String.valueOf((int) data[1]) +
				String.valueOf((int) data[2]) + String.valueOf((int) data[3]));
	}
	
	public String toString()
	{
		return ip;
	}
}