package MyProject;

import java.util.Scanner;

public class genStack 
{
	int stack[] = new int[5];
	int top=-1,i,j=1,item;
	Scanner sc = new Scanner(System.in);
	public void stackoperation()
	{
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		
		while(j<=5)
		{
			System.out.println("\nSelect your choice");
			System.out.println("***********************");
			System.out.println("\n1.PUSH \n 2.POP \n 3.EXIT");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1: if(top >=n-1)
	        {
			System.out.println("stack overflow");
	        }
	        else
	        {
	        System.out.println("enter the element: ");
	        item =sc.nextInt();
	        top=top+1;
	        stack[top]=item;
	        }
	        break;
	case 2 : if(top<0)
	         {
			 System.out.println("stack underflow");
	         }
	         else
	         {
	         stack[top]='\0';
	         top=top-1;
	         }
	         break;
	case 3 : break;
	default : System.out.println("\n Invalid choice");
	}
	if(top<0)
	{
	System.out.println("\n stack is empty");
	}
	else
	{
	System.out.println("\n stack is \n");
	for(int i=top;i>=0;i--)
	{
	System.out.println(stack[i]);
	}
	}
	 j++;
	}
	}
	
	public static void main(String[] args) 
	{
		genStack a =new genStack();
		a.stackoperation();
	}

}
