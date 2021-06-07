package Arithmetic;

import java.util.Scanner;

interface calculation
{
	void input();
	void operations();
}

public class Arithmetic implements calculation
{
	float a,b,sum,sub,mul,div;
	Scanner sc=new Scanner(System.in);
	
    public void input()
    {
	    	System.out.println("Enter two numbers: ");
	    	a=sc.nextFloat();
	    	b=sc.nextFloat();
    }
    public void operations()
	{
		sum=a+b;
		System.out.println("Sum: "+sum);
		sub=a-b;
		System.out.println("Difference: "+sub);
		mul=a*b;
		System.out.println("Product: "+mul);
		if(b==0)
		{
			System.out.println("Division is not possible");
		}
		else
			System.out.println("Division result: "+(a/b));
		}

}
