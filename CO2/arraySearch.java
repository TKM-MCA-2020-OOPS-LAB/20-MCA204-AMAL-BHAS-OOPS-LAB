package MyProject;

import java.util.Scanner;
public class arraySearch
{
    public static void main(String[] args) 
    {
        int n,i,temp,flag=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.print("Enter the element you want to find: ");
        temp=s.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==temp)
            {
                flag=1;
                break;
            }
            else
            {
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.println("Element found at position:"+(i+1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}