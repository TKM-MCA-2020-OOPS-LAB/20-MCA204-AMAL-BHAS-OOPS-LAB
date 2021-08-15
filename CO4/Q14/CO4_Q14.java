package MyProject;
import java.util.*;
public class CO4_Q14 
{
	public static void main(String[] args) 
	{
		Deque<Integer> deque = new ArrayDeque<Integer>();  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements: ");
 	    int num=sc.nextInt();
 	   System.out.print("Enter the elements: ");
 	    for(int i=1;i<=num;i++)
 	    {
        int n=sc.nextInt();
        deque.add(n);
 	    }
 	   System.out.println("Elements are: "+deque);
		for(int i =0;i<num;i++)
		{
				deque.pop();
	 	}
		System.out.println("\nAfter removal: "+deque);
	}
}
