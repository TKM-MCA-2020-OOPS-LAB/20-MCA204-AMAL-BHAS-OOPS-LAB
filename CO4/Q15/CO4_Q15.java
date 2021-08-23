package MyProject;
import java.util.*;
public class CO4_Q15 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> linkset = new LinkedHashSet<Integer>(); 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
 	    int n=sc.nextInt();
 	   System.out.print("Enter the first "+n+" natural numbers: ");
 	    for(int i=1;i<=n;i++)
 	    {
 	    	
            int num=sc.nextInt();
            linkset.add(num);
 	    }
 	   System.out.println("\nLinkedHashSet: "+linkset);
 	   System.out.println("\nRemove 1: "+linkset.remove(1));
 	   System.out.println("\nSize of LinkedHashSet: "+linkset.size());
       System.out.println("\nChecking if 2 is present: "+linkset.contains(2));
       System.out.println("\nLinkedHashSet after removal: "+linkset);
       System.out.println("\nIterating the elements");
       Iterator itr = linkset.iterator();
       while(itr.hasNext())
       {
    	   System.out.println(itr.next());
       }
    
	}

}
