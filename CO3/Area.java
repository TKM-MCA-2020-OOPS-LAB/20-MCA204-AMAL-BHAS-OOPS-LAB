package MyProject;

import java.util.Scanner;
public class Area
{
	int rect_area;
	int sqr_area;
	int trp_area;
    int area(int p,int q)
    { 
        rect_area=p*q;
    	System.out.println("Area of rectangle= "+rect_area);
		return rect_area;
    	
    }
    int area(int s)
    {   
    	sqr_area=s*s;
    	System.out.println("Area of square= "+sqr_area);
		return sqr_area;
    	
    }
   
    int area(int a,int b,int h)
    {
    	int trp_area=((a+b)*h)/2;
    	System.out.println("Area of trapezium= "+trp_area);
		return trp_area;
    	
    }
public static void main(String[] args) 
	{
	Area obj=new Area();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length and breadth of rectangle: ");
	int p=sc.nextInt();
	int q=sc.nextInt();
	System.out.println("Enter the side length of square: ");
	int s=sc.nextInt();
	System.out.println("Enter the length of parallel sides and height of trapezium: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int h=sc.nextInt();
	obj.area(p,q);
	obj.area(s);
	obj.area(a,b,h);

	}

}