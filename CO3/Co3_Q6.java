package LabCycle3;

import java.util.*;
interface calculation
{
	void input();
	void area();
	void perimeter();
}
class Circle implements calculation
{
	float r;
	double ar,pr;
	Scanner sc1=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter the radius of the circle: ");
		r=sc1.nextFloat();
	}
	public void area()
	{
		ar=Math.PI*r*r;
		System.out.println("Area of the circle: "+ar);
	}
	public void perimeter()
	{
		pr=2*Math.PI*r;
		System.out.println("Perimeter of the circle: "+pr);
	}
}
	class Rectangle extends Circle implements calculation
	{
		int l,b,ar,pr;
		Scanner sc2=new Scanner(System.in);
		@Override
		public void input() 
		{
			System.out.println("Enter the length of the rectangle: ");
			l=sc2.nextInt();
			System.out.println("Enter the breadth of the rectangle: ");
			b=sc2.nextInt();
		}
		@Override
		public void area() 
		{
			ar=l*b;
			System.out.println("Area of the Rectangle: "+ar);
		}
		@Override
		public void perimeter() 
		{
			pr=2*(l+b);
			System.out.println("Perimeter of the Rectangle: "+pr);
		}
	}
public class Co3_Q6 
{

	public static void main(String[] args) 
	{
		Circle obj1=new Circle();
		Rectangle obj2=new Rectangle();
		Scanner sc3=new Scanner(System.in);
		System.out.println("Choose One: ");
		System.out.println("1.Circle:\n2.Rectangle: ");
		int ch=sc3.nextInt();
		switch(ch) 
		{
		case 1:
			obj1.input();
			obj1.area();
			obj1.perimeter();
			break;
			
		case 2:
			obj2.input();
			obj2.area();
			obj2.perimeter();
			break;
			
		 default:
			 System.out.println("Wrong Choice!!!");
		}
	 }

}


