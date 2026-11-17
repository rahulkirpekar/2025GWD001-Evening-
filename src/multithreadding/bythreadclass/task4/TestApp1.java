package multithreadding.bythreadclass.task4;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Prime resource = new Prime();
		
		MyThread1 t1 = new MyThread1(resource,1,200);
		MyThread2 t2 = new MyThread2(resource,201,400);
		MyThread3 t3 = new MyThread3(resource,401,600);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
