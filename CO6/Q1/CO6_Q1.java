package MyProject;
import java.io.File;
class CO6_Q1 
{
  public static void main(String[] args) 
  {
	  File f =new File("C:\\Users\\HP\\Desktop\\GIT\\20-MCA204-AMAL-BHAS-OOPS-LAB\\CO1");
	  //returns an array of all files
      String[] fileList = f.list();

      for(String str:fileList)
      {
    	  System.out.println(str); 
      }
  }
}