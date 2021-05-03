import java.util.Scanner;
public class complex 
{
	int real;
	int imag;
	public void display()
	{
		System.out.println("\n complex no is:"+real +"+"+"i"+imag);
			
	}
	public void displaysum(int realsum,int imagsum)
	{
		System.out.println("\n sum of 2 complex numbers is:"+realsum+"+"+"i"+imagsum);
	}

	public static void main(String[] args) 
	{
		int realsum;
		int imagsum;
		complex obj1=new complex();
		System.out.println("Enter the real and imaginary part of 1st complex no:");
		Scanner a=new Scanner(System.in);
		obj1.real=a.nextInt();
		obj1.imag=a.nextInt();
		obj1.display();
		complex obj2=new complex();
		Scanner b=new Scanner(System.in);
		System.out.println("Enter the real and imaginary part of 2nd complex no:");
		obj2.real=b.nextInt();
		obj2.imag=b.nextInt();
		obj2.display();
		
		realsum=obj1.real+obj2.real;
		imagsum=obj1.imag+obj2.imag;
		obj1.displaysum(realsum,imagsum);

	}

}
