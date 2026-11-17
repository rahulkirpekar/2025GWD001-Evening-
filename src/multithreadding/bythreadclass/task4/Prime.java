package multithreadding.bythreadclass.task4;

public class Prime 
{
	// Threadsafe---synchronized
	public synchronized void isPrime(int start,int end) 
	{
		boolean flag = true;
		for (int i = start; i <= end; i++) 
		{
			flag = true;
			for (int j = 2; j <i ; j++) 
			{
				if(i%j == 0) 
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				try 
				{
					Thread.sleep(250);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"---"+i);
			}
		}
	}
}
