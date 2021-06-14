package MyProject;

import java.io.*;
import java.lang.*;
import java.util.*;

class ThreadA extends Thread
{
	public void run()
	{
		System.out.println("Multiplication table of 5");
		System.out.println("*************************");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" x 5= "+(i*5));
		}
		System.out.println("---------------------------------------------------------------------");
	}
}
class ThreadB extends Thread
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a limit:  ");
		int N=sc.nextInt();
		System.out.println("First "+N+" Prime numbers are: ");
		int count=1,flag,i=2,j;
		 while(count<=N)
		 {
			  flag=0;
			  for(j=2;j<=i/2;j++)
			  {
				   if(i%j==0)
				   {
				    flag=1;
				    break;
				   }
			  }
			  if(flag==0)
			  {
				  System.out.println(i);
				   count++;
			  }
			  i++;
		 }
	}
}

public class CO4_Q5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ThreadA a=new ThreadA();
		ThreadB b=new ThreadB();
		a.start();
		a.sleep(200);
		b.start();
		b.sleep(200);
	}

}
