package pc.corejava.fundamentals;

abstract class Laptop {
	
	Laptop(){
		System.out.println("We can have constructor in abstract class");
	}
	
	//  it may contain zero or more abstract methods
	abstract int getLaptopPrice();
	
	public String getLaptopConfig(){
		return "Basic model";
	}
}

class HP extends Laptop {
	int getLaptopPrice() {
		return 50000;
	}
}

class Dell extends Laptop {
	int getLaptopPrice() {
		return 70000;
	}
}

public class AbstractClassSample {
	public static void main(String args[]) {
		
		// If we are trying to create an object for abstract class, then will get CTE
		//Laptop myLaptopObj = new Laptop(); // CTE : Cannot instantiate the type Abstract Class Name
		
		Laptop myLaptop;
		myLaptop = new HP();
		System.out.println("HP Laptop price is : " + myLaptop.getLaptopPrice() + " %");
		myLaptop = new Dell();
		System.out.println("Dell Laptop price is : " + myLaptop.getLaptopPrice() + " %");
	}
}