package MyProject;

import java.util.Scanner;

public class Employee 
{
	int eNo;
	String eName;
	float eSalary;
	public void getinfo()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee id: ");
		eNo=sc.nextInt();
		System.out.println("Enter name: ");
		eName=sc.next();
		System.out.println("Enter salary: ");
		eSalary=sc.nextFloat();
	}
	public void display()
	{
		System.out.println("Employee id: "+ eNo);
		System.out.println("Employee name: "+ eName);
		System.out.println("Employee salary: "+ eSalary);
	}
	

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		int i;
		System.out.println("Enter number of employees: ");
		int n=sc1.nextInt();
		Employee e[]=new Employee[n];
		for(i=0;i<n;i++) 
		{
			e[i]=new Employee();
			e[i].getinfo();
		}
		System.out.println("Employee details are:\n\n");
		for(i=0;i<n;i++) 
		{
			e[i].display();
		}
		System.out.println("Enter the Employee id to search: ");
		int id=sc1.nextInt();
		
		boolean temp=false;
	    for(i=0;i<n;i++) 
	    {
	    	if(id==e[i].eNo) 
		    {
	    		temp=true;
			    break;
		     }
	     }
	     if(temp==true) 
	     {
		     e[i].display();
	     }
	     else
		  System.out.println("Employee details are not found!!!");	
	}

}