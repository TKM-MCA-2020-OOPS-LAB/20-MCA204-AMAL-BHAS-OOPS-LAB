package MyProject;

import java.util.Scanner;
public class stringSort
{
    public static void main(String[] args) 
    {
        int count;
        String temp;
        Scanner scan1=new Scanner(System.in);
        
         
        System.out.print("Enter number of strings: ");
        count=scan1.nextInt();
        
        
        String str[]=new String[count];
        Scanner scan2=new Scanner(System.in);
        
        
        System.out.println("Enter the Strings: ");
        for(int i=0;i<count;i++)
        {
            str[i]=scan2.nextLine();
        }
        scan1.close();
        scan2.close();
        
        
        for (int i=0;i<count;i++) 
        {
            for (int j=i+1;j<count;j++) 
            { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        
        
        System.out.print("Sorted strings are: \n");
        for (int i=0;i<count;i++) 
        {
            System.out.print(str[i]+"\n");
        }
    }
}