package MyProject;
import java.util.*;
import java.io.*; 

public class CO6_Q2 
{  
    public static void main(String args[]) throws IOException
    {    
         try
         {    
           File f= new File("C:\\Users\\HP\\eclipse-workspace\\MyProject\\src\\MyProject\\file3.txt");
           FileWriter w=new FileWriter(f,true);    
           w.write("Object Oriented Programming Lab"); 
           System.out.println("New data is added to the file");
           w.close();
               
          
           FileReader r= new FileReader(f);
	       BufferedReader br= new BufferedReader(r);
	          
	       String str;
	       System.out.println("Displaying the contents...");
	          while((str=br.readLine())!=null) 
	          {
	              System.out.println(str);
	          }
	          r.close();        
         }
         catch(Exception e)
         {
        	 System.out.println(e);
         }    
    
     }  
}