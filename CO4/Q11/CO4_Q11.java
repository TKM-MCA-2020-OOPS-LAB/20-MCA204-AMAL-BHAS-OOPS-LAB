package MyProject;
import java.util.*;
public class CO4_Q11 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list=new LinkedList<String>();
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		n=sc.nextInt();
		System.out.println("Enter name of "+n+" students: ");
		for(i=0;i<n;i++)
		{
			String student=sc.next();
			list.add(student);
		}
		for(i=0;i<n;i++)
		{	
			System.out.println("removed "+list.get(0));
			list.remove(0);	
		}
		System.out.println("\nLinked list after removal: "+list);
	}
}
