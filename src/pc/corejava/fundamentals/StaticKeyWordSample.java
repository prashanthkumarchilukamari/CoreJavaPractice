package pc.corejava.fundamentals;

public class StaticKeyWordSample {

	static int count = 0; // This variable is common for all objects
	
	static{
		System.out.println("This block will be executed during the class loading");
		
		// this.display();     // CTE : Can't use this inside static context
		//  super.display();   // CTE : Can't use super inside static context
	}
	
	/*
	int index = 0; // instance variable 
	
	{              // instance block   
		index =10;
	}
	*/
	public static void display(){
		System.out.println("We can access this method with out creating the object");
		System.out.println("Static variable count value is : " + count);
		count++;
	}
	
	public static void main(String[] args) {

		
		StaticKeyWordSample.display(); // Accessing the static method using the class name
		
		StaticKeyWordSample obj1 = new StaticKeyWordSample();
		StaticKeyWordSample obj2 = new StaticKeyWordSample();
		
		System.out.println("obj1 count value is : " + obj1.count);
		
		System.out.println("obj2 count value is : " + obj2.count);
		
	}

}
