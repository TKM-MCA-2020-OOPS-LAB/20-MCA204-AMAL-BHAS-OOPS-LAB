package MyProject;
import java.io.*;
public class CO6_Q3 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileReader r= new FileReader("C:\\Users\\HP\\eclipse-workspace\\MyProject\\src\\MyProject\\file3.txt");
			BufferedReader br= new BufferedReader(r);           
			FileWriter w= new FileWriter("C:\\Users\\HP\\eclipse-workspace\\MyProject\\src\\MyProject\\file2.txt", true);
			String str;
			while ((str= br.readLine())!= null) 
			{ 
				w.write(str); 
				w.flush();
			}
			br.close();
			w.close();
            System.out.println("file copied");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
