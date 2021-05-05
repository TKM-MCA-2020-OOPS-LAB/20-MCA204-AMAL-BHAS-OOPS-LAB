public class cpu {
	
	int price;
	
	public class processor
	{
		int no_cores;
		String manufacturer;
		
		
	}
	static class RAM
	{
		 int memory;
		 String manufacturer;
		 
	}
	public void display(int proc1,int proc2,int ram1,String proc3, String ram2)
	{
		System.out.println("processor Details");
		System.out.println("price: "+proc1);
		System.out.println("number of cores: "+proc2);
		System.out.println("Manufacturer: "+proc3);
		System.out.println("\n RAM details");
		System.out.println(" memory: "+ram1);
		System.out.println("Manufacturer: "+ram2);
	}

	public static void main(String[] args) {
		int a,b,c;
		String s,d;
		
		cpu obj=new cpu();
		cpu.processor obj1=obj.new processor();
		
		a=obj.price=25000;
		b=obj1.no_cores=8;
		s=obj1.manufacturer="intel";
		
		cpu.RAM obj2=new RAM();
		c=obj2.memory=16;
		d=obj2.manufacturer="samsung";
		
		
		obj.display(a,b,c,s,d);
		
		
		
		
		

	}

}