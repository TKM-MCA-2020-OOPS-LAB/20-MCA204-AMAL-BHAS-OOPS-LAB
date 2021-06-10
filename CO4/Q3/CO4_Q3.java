package MyProject;

import java.util.Scanner;

class AuthenticationException extends Exception 
{
	public AuthenticationException(String s) 
	{
		super(s);
	}
}
public class CO4_Q3 
{
    	public static void main(String[] args) 
    	{
    		Scanner sc = new Scanner(System.in);
    		System.out.print("Enter username:");
    		String username = sc.nextLine();
    		System.out.print("Enter password:");
    		String password = sc.nextLine();

    		try 
    		{
    			if((username=="") || (password=="")) 
    				throw new AuthenticationException("Fields cannot be empty!!!");
    			else if(username.length()<5)
    				throw new AuthenticationException("Username must contain atleast 5 characters!!!");
    			else if(password.length()<7)
    				throw new AuthenticationException("Password must be atmost 7 characters!!!");
    			else
    				System.out.println("\nAuthentication Successful.....");
    			}	      
    		catch ( AuthenticationException A)
    		{
    			A.printStackTrace();
    		}
    	}
}
