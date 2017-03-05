package pc.corejava.fundamentals;

class CarSample {
	int carModel = 100;

	public CarSample() {

	}

	void displayCarModel() {
		System.out.println("Parent Class method");
	}
}

class Audi extends CarSample {
	int carModel = 110;

	public Audi() {
		// Scenario - 1 : Executing the super class constructor 
      super(); // super or this must be the first statement inside the constructor
		
	}
	void printNumber() {
		System.out.println("child class carModel value is : " + this.carModel);
		
		// Scenario - 2 : Fetching the super class member variable value 
		System.out.println("super class carModel value is : " + super.carModel);
		
		// Scenario - 3 : Executing the super class method 
		super.displayCarModel();
	}

	public static void main(String args[]) {
		Audi childObj = new Audi();
		childObj.printNumber();
	}
}
