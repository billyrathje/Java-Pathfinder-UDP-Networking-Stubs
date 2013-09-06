/**
 * Stub class for InetSocketAddress
 * @author williamrathje
 *
 */
public class InetSocketAddress {

	InetAddress ip;
	int port;
	
	public InetSocketAddress(InetAddress ip, int port)
	{
		this.ip = ip;
		this.port = port;
	}
	public InetSocketAddress(int port)
	{
		ip = new InetAddress("0.0.0.0");
		this.port = port;
	}
}
