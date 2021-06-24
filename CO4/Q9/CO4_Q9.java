package Course_Outcome4;

import java.util.*;

class BubbleSort
{
	int n,i,j,temp;
	Scanner sc = new Scanner(System.in);
	public void sort()
	{
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int ar[] = new int[n];
		for(i=0;i<n;i++)
		{
			ar[i] = sc.nextInt();
		}
		System.out.println("Array elements(before sorting): ");
		for(i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		for(i=1;i<n;i++)
			for(j=0;j<n-1;j++)
				if(ar[j]>ar[j+1])
				{
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
		System.out.println("\nSorted array is: ");
		for(i=0;i<n;i++)
			System.out.print(ar[i]+" ");
	}
}
public class CO4_Q9 
{
	public static void main(String[] args) 
	{
		BubbleSort a=new BubbleSort();
		a.sort();
	}

}
