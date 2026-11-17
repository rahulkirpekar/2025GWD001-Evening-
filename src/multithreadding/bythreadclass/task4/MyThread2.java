package multithreadding.bythreadclass.task4;

public class MyThread2 extends Thread
{
	Prime resource = null;
	int start,end;
	public MyThread2(Prime resource,int start,int end) 
	{
		this.resource = resource;
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() 
	{
		resource.isPrime(start,end);
	}
}
