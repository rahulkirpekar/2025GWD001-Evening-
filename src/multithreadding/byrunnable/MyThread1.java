package multithreadding.byrunnable;

// 2. By implementing Runnable Interface
public class MyThread1 implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("MyThread1 -- run() : " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) 
	{
		MyThread1 t1 = new MyThread1();
		MyThread1 t2 = new MyThread1();
		MyThread1 t3 = new MyThread1();
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		Thread thread3 = new Thread(t3);
		
		thread1.start();// thread1--thread---callstack---run()
		thread2.start();// thread1--thread---callstack---run()
		thread3.start();// thread1--thread---callstack---run()
		
	}
}
