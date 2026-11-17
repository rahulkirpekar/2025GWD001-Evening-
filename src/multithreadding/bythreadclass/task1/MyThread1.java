package multithreadding.bythreadclass.task1;

// 1. By extending Thread-class:-
//-----------------------------
public class MyThread1 extends Thread
{
	// Thread---Job Defined
	
	@Override
	public void run() 
	{
		System.out.println("Hello I am Thread, My Name is "+ Thread.currentThread().getName()+"---"+Thread.currentThread().getId());
	}
	
	public static void main(String[] args) 
	{
//		System.out.println("MyThread1 : main()---Hello World---"+Thread.currentThread().getName());
		
		MyThread1 t1 = new MyThread1();
		MyThread1 t2 = new MyThread1();
		MyThread1 t3 = new MyThread1();
		MyThread1 t4 = new MyThread1();
		MyThread1 t5 = new MyThread1();

		t1.setName("C");
		t2.setName("C++");
		t3.setName("CoreJava");
		t4.setName("Python");
		t5.setName("JS");

		
//		t1.start();
//		t1.start();

//		t1.run();
//		System.out.println("----1");
//		t2.run();
//		System.out.println("----2");
//		t3.run();
//		System.out.println("----3");
//		t4.run();
//		System.out.println("----4");
//		t5.run();
//		System.out.println("----5");

		
		t1.start();
		System.out.println("----1");
		t2.start();
		System.out.println("----2");
		t3.start();
		System.out.println("----3");
		t4.start();
		System.out.println("----4");
		t5.start();
		System.out.println("----5");
	}
}
