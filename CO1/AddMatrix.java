import java.util.Scanner;

public class AddMatrix 
{

	public static void main(String[] args) 
	{
		int r,c,i,j;
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter the number of rows: ");
        r=in.nextInt(); 
        System.out.println("Enter the number columns: ");
        c=in.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        int sum[][]=new int[r][c];
        System.out.println("Enter the elements of first matrix: "); 
        for(i=0;i<r;i++)
           {  
           for(j=0;j<c;j++)
              { 
                a[i][j]=in.nextInt(); 
                System.out.println();
              }
           }
        System.out.println("Enter the elements of second matrix: ");  
        for(i= 0;i<r;i++)
           {   
           for(j=0;j<c;j++)
              {
               b[i][j]=in.nextInt(); 
               System.out.println();
              }
        }
        for(i=0;i<r;i++)
        for(j=0;j<c;j++)
        sum[i][j]=a[i][j]+b[i][j]; 
        System.out.println("Sum of matrices: ");  
        for(i=0;i<r;i++)
        { 
        for(j=0;j<c;j++)
        System.out.print(sum[i][j]+"\t");  
        System.out.println();
        }  	

	}

}
