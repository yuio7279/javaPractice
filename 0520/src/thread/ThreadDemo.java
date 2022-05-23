package thread;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = new Thread(new MyRunnable());
		t.start();
		
		for (int i =0; i<5; i++)
		{
			System.out.println("¾È³ç. ");
			try {
				Thread.sleep(500);
				
			}catch (InterruptedException e) {
				
			}
		}
	}
}
	class MyRunnable implements Runnable {
		public void run() {
			for(int i=0; i<5; i++) 
			{
				System.out.println("Àß°¡");
			}
				try 
				{
					Thread.sleep(500);
				}
				catch(InterruptedException e) 
				{
				
				}
		}
	}

