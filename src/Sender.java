
public class Sender {
	
	private static MACLayer m;
	//private  RF rf;
	
	public Sender()
	{
			m = ProcessStartup.getMACLayer();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sender s = new Sender();
		byte data[] = {1,2,3};
		m.send(data);
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