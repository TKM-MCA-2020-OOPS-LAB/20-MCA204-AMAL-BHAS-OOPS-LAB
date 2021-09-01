package MyProject;
import java.util.*;
public class CO4_Q17 
{
	public static void main(String[] args) 
	{
		 Map<Integer,String> map=new HashMap<>();   
	        map.put(1,"Abhilash");
	        map.put(2,"Abhishek");
	        map.put(3,"Agna");
	        System.out.println("Initial Map:"+map);
	        
	        map.put((4),"Amal");
	        System.out.println("\nUpdated Map: "+map);
	 
	        map.remove(1);
	  
	        System.out.println("\nAfter removal: "+map);
	}
}
