package multithreadding.bythreadclass.task1;

public class MyThread2 extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 1; i <=3 ; i++) 
		{
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("I : " + i+" - "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) 
	{
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2();
		
		t1.setName("C Language");
		t2.setName("C++ Language");
		t3.setName("CoreJava Language");

		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
