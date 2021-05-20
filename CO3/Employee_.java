package MyProject;

import java.util.Scanner;

public class Employee_ 
{
	int Empid;
	String Name;
	double Salary;
	String Address;
	Scanner em=new Scanner(System.in);

	public Employee_() 
	{
		System.out.println("Enter Employee id: ");
		Empid=em.nextInt();
		System.out.println("Enter Name: ");
		Name=em.next();
		System.out.println("Enter Salary: ");
		Salary=em.nextDouble();
		System.out.println("Enter Address: ");
		Address=em.next();
	}
}

	 class Teacher extends Employee_
	{
		String department;
		String subject;
		Scanner te=new Scanner(System.in);
		
		public Teacher()
		{
			System.out.println("Enter department: ");
			department=te.next();
			System.out.println("Enter Subject: ");
			subject=te.next();
		}
		
		public void display()
		{
			System.out.println("********Employee Details********");
			System.out.println("Employee id: "+Empid);
			System.out.println("Name: "+Name);
			System.out.println("Salary: "+Salary);
			System.out.println("Address: "+Address);
			System.out.println("Department: "+department);
			System.out.println("Subject: "+subject);
		}
	


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter number of employees: ");
		int n=sc.nextInt();
		Teacher e[]=new Teacher[n];
		for(i=0;i<n;i++) 
		{
			e[i]=new Teacher();
			
	
			
		}
		
		for(i=0;i<n;i++) 
		{
			e[i].display();
		}
		
		

	}
	}


