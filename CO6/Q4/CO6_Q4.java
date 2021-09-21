package MyProject;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CO6_Q4 
{
	public static void main(String[] args) throws IOException
	{
		 FileInputStream f1= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\MyProject\\src\\MyProject\\num.txt");
	     FileOutputStream f2 = new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\MyProject\\src\\MyProject\\even.txt");
	     FileOutputStream f3 = new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\MyProject\\src\\MyProject\\odd.txt");
	     System.out.println("Copied even numbers and odd numbers to separate files"); 
	     int i;
	     while((i=f1.read()) != -1)
	     {
	    	 if(i%2==0)
	    		 f2.write(i);
	         else
	        	 f3.write(i);
	     }
	     
	     f1.close();
	     f2.close();
	     f3.close();
	}
}
