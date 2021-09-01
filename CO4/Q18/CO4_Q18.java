package MyProject;
import java.util.*;
public class CO4_Q18 
{
	public static void main(String[] args) 
	{
		Map<String,String> map=new HashMap<>();
	      map.put("1","Abhilash");
		  map.put("2","Abhishek");
		  map.put("3","Agna");
		  map.put("4","Amal");
	      
	      System.out.println("HashMap:"+map);
	      Map<String, String> treeMap = new TreeMap<>();
	      treeMap.putAll(map);
	      System.out.println("\nTreeMap:"+treeMap);
	}

}
