package MyProject;
import java.util.*;
public class CO4_Q13 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
 	    int num=sc.nextInt();
 	   System.out.print("Enter the elements: ");
 	    for(int i=1;i<=num;i++)
 	    {
 	    	int n=sc.nextInt();
 	    	queue.add(n);
 	    }
 	    System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("Iterating the queue elements: ");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("After removal: ");  
		Iterator<Integer> itr2=queue.iterator();  
		while(itr2.hasNext())
		{  
			System.out.println(itr2.next());  
		}  
	}
}
