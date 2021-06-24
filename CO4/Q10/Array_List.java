package MyProject;

import java.util.*;

public class Array_List 
{
	public static void main(String[] args) 
	{
		 ArrayList<String> obj = new ArrayList<String>();
	      obj.add("January");
	      obj.add("February");
	      obj.add("April");
	      obj.add("May");
	      obj.add(2,"March");

	      System.out.println("ArrayList after add operation:");
	      for(String month:obj)
	         System.out.println(month);

	      obj.remove("May");
	      obj.remove(3);
	     
	      System.out.println("\nArrayList after remove operation:");
	      for(String month:obj)
	         System.out.println(month);
	      
	      Collections.sort(obj);
	      
	      System.out.println("\nArrayList after sorting:");
	      for (String month: obj) 
	         System.out.println(month);

	      System.out.println("\nObject at index 2:"+obj.get(2));
	      
	      System.out.println("\nJuly is in the ArrayList :"+obj.contains("July"));
	      System.out.println("\nMarch is in the ArrayList :"+obj.contains("March"));
	      
	      System.out.println("\nSize of the ArrayList:"+obj.size());
	      
	      obj.clear();
	      
	      System.out.println("\nArrayList after clear method:"+obj);
	      
	}
}
