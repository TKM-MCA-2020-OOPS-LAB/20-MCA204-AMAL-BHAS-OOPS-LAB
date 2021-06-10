package MyProject;

import java.util.*;

class Neg_Exception extends Exception 
{
	public Neg_Exception(String s) 
	{
		super(s);
	}
}
public class CO4_Q4 
{
	
	public static void main(String[] args) 
	{
		
		int i;
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Count of numbers: ");
		int N=sc.nextInt();
		int[] intArray=new int[N];
		System.out.println("Enter the numbers: ");
		for(i=0;i<N;i++)
		{
			intArray[i]=sc.nextInt();
		}
		for(i=0;i<N;i++)
		{
		
			try
			{
				if (intArray[i]<0)
				{
					throw new Neg_Exception(+intArray[i]+"\tis a negative number");
				}
				else
				{
					sum=sum+intArray[i];
				}	
					
			}
			catch( Neg_Exception e)
			{
    			e.printStackTrace();
    			System.out.println("Enter a positive  number: ");
                   intArray[i]=sc.nextInt();
                   sum=sum+intArray[i];    
    		}
				
		}
		System.out.println("Average of N positive numbers:"+sum/N);
	}
}

