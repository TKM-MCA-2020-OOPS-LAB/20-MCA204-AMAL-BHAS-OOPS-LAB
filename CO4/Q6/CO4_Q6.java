package MyProject;

import java.util.*;
import java.lang.*;
import java.io.*;

class Fibonacci implements Runnable
{
	public void run()
	{
		int a=0,b=1,n=15;
		System.out.print("Fibonacci series:\n");
		for(int i=1;i<=n;i++) 
		{
		      System.out.print(a+",");
		      int c=a+b;
		      a=b;
		      b=c;
		}
	}
}
class Even implements Runnable
{
	public void run() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nEnter a number: ");
		int m= sc.nextInt();	
		System.out.print("Even numbers are: ");
		for(int i=1;i<=m;i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i+","); 
			}
	    }
			
     }  
}
public class CO4_Q6 
{

			public static void main(String[] args) throws InterruptedException 
			{
				Fibonacci at = new Fibonacci();
				Thread a=new Thread(at);
				Even bt = new Even();
				Thread b= new Thread(bt);
				a.start();
				a.sleep(200);
				b.start();
				b.sleep(200);
	        }

}
