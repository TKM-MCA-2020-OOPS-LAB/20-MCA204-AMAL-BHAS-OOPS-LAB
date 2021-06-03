package Course_Outcome4;

import java.util.*;

interface calculation
{
	void rectangle();
	void triangle();
	void square();
	void circle();
}
public class Area implements calculation 
{
	int x,y,b,h,a,r,rect_ar,sq_ar;
	double tri_ar,cir_ar;
	Scanner sc=new Scanner(System.in);
	public void rectangle()
	{
		System.out.println("Enter the length of Rectangle: ");
		x=sc.nextInt();
		System.out.println("Enter the breadth of Rectangle: ");
		y=sc.nextInt();
		rect_ar=x*y;
		System.out.println("Area of Rectangle: "+rect_ar);
		System.out.println("**********************************************\n");
	}
	public void triangle()
	{
		System.out.println("Enter the base length of Triangle: ");
		b=sc.nextInt();
		System.out.println("Enter the height of Triangle: ");
		h=sc.nextInt();
		tri_ar=((b*h)/2);
		System.out.println("Area of Triangle: "+tri_ar);
		System.out.println("**********************************************\n");
	}
	public void square()
	{
		System.out.println("Enter the side length of Square: ");
		a=sc.nextInt();
		sq_ar=a*a;
		System.out.println("Area of Square: "+sq_ar);
		System.out.println("**********************************************\n");
	}
	public void circle()
	{
		System.out.println("Enter the radius of Circle: ");
		r=sc.nextInt();
		cir_ar=Math.PI*r*r;
		System.out.println("Area of Circle: "+cir_ar);
		System.out.println("**********************************************");
	}
}

	
	

