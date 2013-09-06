import java.util.LinkedList;

public class ProcessStartup {
	
	static MACLayer m;
	static LinkedList<DatagramPacket> queue = new LinkedList<DatagramPacket>();
	
	public static MACLayer getMACLayer()
	{
		return m;
	}
	
	public static LinkedList<DatagramPacket> getQueue()
	{
		return queue;
	} 
	
	public ProcessStartup() {

	/*	

	Thread t1 = new CentralizedProcess(0) 
	{ 
		public void run() 
		{
			Listener.main(null);
		}
	};
	t1.start(); */


	Thread t2 = new CentralizedProcess(1) 
	{
		public void run() 
		{
			Sender.main(null);
		}
	}; 
	t2.start();

	Thread t3 = new CentralizedProcess(2) 
	{
		public void run() 
		{
			Sender.main(null);
		}
	};
	t3.start();

	Thread t4 = new CentralizedProcess(3)
	{
		public void run() 
		{
			Sender.main(null);
		}
	};
	t4.start();
	Thread t5 = new CentralizedProcess(3)
	{
		public void run() 
		{
			Sender.main(null);
		}
	};
	t5.start();
	Thread t6 = new CentralizedProcess(3)
	{
		public void run() 
		{
			Sender.main(null);
		}
	};
	/*
	t6.start();
	Thread t7 = new CentralizedProcess(3)
	{
		public void run() 
		{
			Sender.main(null);
		}
	};
	t7.start();
	Thread t8 = new CentralizedProcess(3)
	{
		public void run() 
		{
			Sender.main(null);
		}
	};
	t8.start();
	Thread t9 = new CentralizedProcess(3)
	{
		public void run() 
		{
			Sender.main(null);
		}
	};
	t9.start();
	Thread t10 = new CentralizedProcess(3)
	{
		public void run() 
		{
			Sender.main(null);
		}
	};
	t10.start();
	Thread t11 = new CentralizedProcess(3)
	{
		public void run() 
		{
			Sender.main(null);
		}
	};
	t11.start(); */
	}


	
	public static void main(String[] args) throws Exception
	{
		m = new MACLayer();
		new ProcessStartup();
	}
}