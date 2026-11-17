package multithreadding.bythreadclass.task5;

public class MyThread1 extends Thread
{
	@Override
	public void run() 
	{
		if (Thread.currentThread().isDaemon()) 
		{
			System.out.println("MyThread1 : run() Hi I am Daemon Thread");
		} 
		else 
		{
			for (int i = 1; i <= 10; i++) 
			{
				System.out.println(5+" * " + i +" = " + (5*i)  + Thread.currentThread().getName());
			}
		}
	}
	public static void main(String[] args) 
	{
		MyThread1 t1 = new MyThread1();
		MyThread1 t2 = new MyThread1();
		MyThread1 t3 = new MyThread1();
		
		// Daemon Thread - Service Provider Thread--->Normal Thread
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
	}
}