package MyProject;

import java.util.Scanner;

public class Publisher 
{
	String pub_name;
	Scanner pub=new Scanner(System.in);

	public Publisher() 
	{
		System.out.println("Enter Publisher: ");
		pub_name=pub.next();
	}
}
    class Book extends Publisher
    {
    	String author,title;
    	Scanner bo=new Scanner(System.in);
    	
    	public Book()
    	{
    		System.out.println("Enter Author: ");
    		author=bo.next();
    		System.out.println("Enter title of the Book: ");
    		title=bo.next();
    	}
    }
        class Literature extends Book
        {
        	int price,page;
        	Scanner lit=new Scanner(System.in);
        	
        	public Literature()
        	{
        		System.out.println("Enter Price: ");
        		price=lit.nextInt();
        		System.out.println("Enter the number of pages: ");
        		page=lit.nextInt();
        	}
        	void display()
        	{
        		System.out.println("********Literature Book Details********");
        		System.out.println("Publisher: "+pub_name);
        		System.out.println("Author: "+author);
        		System.out.println("Book Name: "+title);
        		System.out.println("Price: "+price);
        		System.out.println("Number of pages: "+page);
        		System.out.println("--------------------------------------------------------");
        	}
        }
        class Fiction extends Book
        {
        	int price,page;
        	Scanner fic=new Scanner(System.in);
        	
        	public Fiction()
        	{
        		System.out.println("Enter Price: ");
        		price=fic.nextInt();
        		System.out.println("Enter the number of pages: ");
        		page=fic.nextInt();
        	}
        	void display()
        	{
        		System.out.println("********Fiction Book Details********");
        		System.out.println("Publisher: "+pub_name);
        		System.out.println("Author: "+author);
        		System.out.println("Book Name: "+title);
        		System.out.println("Price: "+price);
        		System.out.println("Number of pages: "+page);
        		System.out.println("--------------------------------------------------------");
        	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the number of Literature books");
		int r=sc.nextInt();
		Literature l[]=new Literature[r];
		for(i=0;i<r;i++)
		{
			l[i]=new Literature();
		}
		System.out.println("Enter the number of Fiction books");
		int s=sc.nextInt();
		Fiction f[]=new Fiction[s];
		for(i=0;i<s;i++)
		{
			f[i]=new Fiction();
		}
		System.out.println("Enter your Choice:\n ");
		System.out.println("1)Literature");
		System.out.println("2)Fiction");
		int ch=sc.nextInt();
		i=0;
		while((i<r)||(i<s))
		{
		switch(ch)
		{
			case 1:
				l[i].display();
				break;
				
			case 2:
				f[i].display();
				break;
				
			default:
				System.out.println("Wrong Choice");
	
		}
		 i++;
		}
		
	}

}


