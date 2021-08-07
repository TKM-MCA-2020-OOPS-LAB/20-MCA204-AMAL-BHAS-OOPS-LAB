package MyProject;
import java.util.*;
public class CO4_Q12 
{
	public static void main(String[] args) 
	{
		Stack<String> stack=new Stack<String>();
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.println("Enter the number of students: ");
		n=sc.nextInt();
		System.out.println("Enter name of "+n+" students: ");
		for(i=0;i<n;i++)
		{
			String student=sc.next();
			stack.push(student);
		}
		System.out.println("\nStack-> "+stack);
		System.out.println("\nremoved "+stack.pop());
		System.out.println("\nStack after removal-> "+stack);
	}
}
