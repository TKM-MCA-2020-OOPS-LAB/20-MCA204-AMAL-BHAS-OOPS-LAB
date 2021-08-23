package MyProject;
import java.util.*;
public class CO4_Q16 
{
	public static void main(String[] args) 
	{
			HashSet<Integer> set1= new HashSet<Integer>();
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter the number of elements in first hashset: ");
			int n=sc1.nextInt();
			System.out.println("Enter the "+n+" elements: ");
			for(int i=0;i<n;i++) 
			{
				int num=sc1.nextInt();
				set1.add(num);
			}
			
			
			HashSet<Integer> set2= new HashSet<Integer>();
			Scanner sc2=new Scanner(System.in);
			System.out.println("Enter the number of elements in second hashset: ");
			int m=sc2.nextInt();
			System.out.println("Enter the "+m+" elements: ");
			for(int i=0;i<m;i++) 
			{
				int num1=sc2.nextInt();
				set2.add(num1);
			}
			
			
			System.out.println("Set1: "+set1);
			System.out.println("Set2: "+set2);
			
			HashSet<Integer> union= new HashSet<Integer>(set1);
			union.addAll(set2);
			System.out.println("Union: "+union);
		
			HashSet<Integer> intersection= new HashSet<Integer>(set1);
			intersection.retainAll(set2);
			System.out.println("Intersection: "+intersection);
			
			HashSet<Integer> minus= new HashSet<Integer>(set1);
			minus.removeAll(set2);
			System.out.println("Difference: "+minus);
	}

}
