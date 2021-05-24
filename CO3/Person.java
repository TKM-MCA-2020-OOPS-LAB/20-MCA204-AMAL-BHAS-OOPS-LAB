package MyProject;

import java.util.Scanner;

public class Person 
{
	String Name,Gender,Address;
	int Age;
	Scanner pe=new Scanner(System.in);
	
	public Person() 
	{
		System.out.println("Enter Name: ");
		Name=pe.next();
		System.out.println("Enter Gender: ");
		Gender=pe.next();
		System.out.println("Enter Address: ");
		Address=pe.next();
		System.out.println("Enter Age: ");
		Age=pe.nextInt();
	}
}
	class Employeee extends Person
	{
		int Empid;
		String Company_name,Qualification;
		double Salary;
		Scanner em=new Scanner(System.in);
		
		public Employeee()
		{
			System.out.println("Enter Employee id: ");
			Empid=em.nextInt();
			System.out.println("Enter Company Name: ");
			Company_name=em.next();
			System.out.println("Enter Qualification: ");
			Qualification=em.next();
			System.out.println("Enter Salary: ");
			Salary=em.nextDouble();
			
		}
	}
		class Teacher extends Employeee
		{
			String Subject,Department;
			int Teacherid;
			Scanner te=new Scanner(System.in);
			
			public Teacher()
			{
				System.out.println("Enter Subject: ");
				Subject=te.next();
				System.out.println("Enter Department: ");
				Department=te.next();
				System.out.println("Enter Teacher id: ");
				Teacherid=te.nextInt();
			}
		
			public void display()
			{
				System.out.println("********Details********");
				System.out.println("Name: "+Name);
				System.out.println("Gender: "+Gender);
				System.out.println("Address: "+Address);
				System.out.println("Age: "+Age);
				System.out.println("Employee id: "+Empid);
				System.out.println("Company Name: "+Company_name);
				System.out.println("Qualification: "+Qualification);
				System.out.println("Salary: "+Salary);
				System.out.println("Subject: "+Subject);
				System.out.println("Department: "+Department);
				System.out.println("Teacher id: "+Teacherid);
			}
				
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter number of persons: ");
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
