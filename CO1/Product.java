
public class Product 
{
	int pcode;
	String pname;
	int price;
	    
	      public static void main(String[] args)
	      {
	    	  Product obj1 = new Product();
		      Product obj2 = new Product();
		      Product obj3 = new Product();
              obj1.pcode=501;
              obj1.pname="product_1";
              obj1.price=200;
              obj2.pcode=502;
              obj2.pname="product_2";
              obj2.price=150;
              obj3.pcode=503;
              obj3.pname="product_3";
              obj3.price=250;
              if(obj1.price<obj2.price && obj1.price<obj3.price)
              {
            	  System.out.println("The product with lowest price is: ");
            	  System.out.println(obj1.pcode+","+obj1.pname+","+obj1.price);
              }
              else if(obj2.price<obj1.price && obj2.price<obj3.price)
              {
            	  System.out.println("The product with lowest price is: ");
            	  System.out.println(obj2.pcode+","+obj2.pname+","+obj2.price);
              }
              else
              {
            	  System.out.println("The product with lowest price is: ");
            	  System.out.println(obj3.pcode+","+obj3.pname+","+obj3.price);
              }
              
	      }
}