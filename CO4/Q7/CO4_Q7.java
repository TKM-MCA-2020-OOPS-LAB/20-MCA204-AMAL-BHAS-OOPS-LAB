package MyProject;

import java.util.ArrayList;
import java.util.List;

class Producer implements Runnable
{
	List<Integer> list;
	
	public Producer(List<Integer> list)
	{
		this.list=list;
	}
	
	@Override
	public void run()
	{
		try 
		{
			synchronized(list)
			{
				while(true)
				{
					if(list.size()>0) 
					{
						System.out.println("shared list is full,waiting for the consumer to consume\n");
						list.wait();
					}
					else
						produce();
				}
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	private void produce() throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			Thread.sleep(1000);
			list.add(i);
			System.out.println("Producer produced the element: "+i);	
		}
		list.notify();
	}
}
class Consumer implements Runnable
{
	List<Integer> list;
	
	public Consumer(List<Integer> list)
	{
		this.list=list;
	}
	
	@Override
	public void run()
	{
		try 
		{
			while(true)
			{
				synchronized(list)
				{
					if(list.size()==0)
					{
						System.out.println("shared list is empty,waiting for the producer to produce\n");
						list.wait();
					}	
					else
						consume();
				}
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	private void consume() throws InterruptedException
	{
		while(!list.isEmpty())
		{
			Thread.sleep(2000);
			System.out.println("Consumed the element: "+list.remove(0));
		}
		list.notify();
	}
}
public class CO4_Q7 
{
	public static void main(String[] args) throws Exception
	{
		List<Integer> list = new ArrayList<Integer>();
	    Thread produce = new Thread(new Producer(list));
		Thread consume = new Thread(new Consumer(list));
		produce.start();
		consume.start();
	}

}
