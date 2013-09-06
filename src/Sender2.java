
public class Sender2 {
	
	private static MACLayer m;
	//private  RF rf;
	
	public Sender2()
	{
			m = ProcessStartup.getMACLayer();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sender s = new Sender();
		byte data[] = {2, 3, 4};
		int x = 0;
		m.send(data);
		System.out.println("ERE");
		System.exit(0);
		/*
		while(x < 2)
		{					
			if(!m.getRF().inUse())
			{
				m.send(data);
				x++;
				//System.out.println("Sent " + data);
				//m.notify();
			} 
		} */
	}
}