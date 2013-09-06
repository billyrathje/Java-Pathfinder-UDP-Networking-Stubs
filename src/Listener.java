public class Listener {

	private static MACLayer m;
	
	public Listener()
	{
		m = ProcessStartup.getMACLayer();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Listener l = new Listener();
		byte[] r = null;
		while(r == null)
		{
			r = m.receive();
		} 
		System.out.println(r);
		m.getRF().exit();
		System.exit(0);
		
		/*
		while(true)
		{
			byte[] r = m.receive();
			break;
			//if(r != null)
				//System.out.println("Recieved: " + r);
		}*/
	} 

}
