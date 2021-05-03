import java.util.Scanner;
public class SymetricMatrix 
{

	public static void main(String[] args) 
	{
		 Scanner in=new Scanner(System.in);
	     System.out.println("Enter the number of rows: ");
	     int rows = in.nextInt();
	     System.out.println("Enter the nnumber of columns: ");
	     int cols = in.nextInt();
	     int matrix[][] = new int[rows][cols];
	     System.out.println("Enter the elements: ");
	     for (int i = 0; i < rows; i++)
	        {
	            for (int j = 0; j < cols; j++)
	            {
	                matrix[i][j] = in.nextInt();
	            }
	        }
	         
	        System.out.println("matrix is: ");
	        for (int i = 0; i < rows; i++)
	        {
	            for (int j = 0; j < cols; j++)
	            {
	                System.out.print(matrix[i][j]+"\t");
	            }
	             System.out.println();
	        } 
	        if(rows != cols)
	        {
	            System.out.println("The given matrix is not a square matrix.So it is not symmetric");
	        }
	        else
	        {
	            int x=0;
	             
	            for (int i = 0; i < rows; i++)
	            {
	                for (int j = 0; j < cols; j++)
	                {
	                    if(matrix[i][j]==matrix[j][i])
	                    {
	                        x=1;
	                    }
	                }
	            }
	             
	            if(x==1)
	            {
	                System.out.println("The given matrix is symmetric...");
	            }
	            else
	            {
	                System.out.println("The given matrix is not symmetric...");
	            }
	        }

	}

}
