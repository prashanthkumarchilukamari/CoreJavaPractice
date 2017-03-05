package pc.corejava.fundamentals;

// Valid example

class Animal {
	void eat() {
		System.out.println("Invoking eat method from Animal Class");
	}
}

class Dog {
	void eat() {
		System.out.println("Invoking eat method from Dog Class");
	}
}

public class DiamondProblemSample_V extends Animal,Dog  { // Multiple Inheritance Not Supported   
   
 public static void main(String args[]) {
	 
	 DiamondProblemSample_V diamondProblemSampleObj = new DiamondProblemSample_V();
		
		diamondProblemSampleObj.eat();
	}
}
