package pc.corejava.fundamentals;

interface MyInterface {
	int interfaceId = 10; // interface variables are by default public static final
	
	// int number; // CTE : Value of the number is not initialized

	void display(); // interface methods are by default public and abstract

}

public class InterfaceSample implements MyInterface {

	@Override
	public void display() {

		System.out.println("implementing the interface method");

		// interfaceId = 100; // we are not allowed to modify the interface variable values
		// Because , they are final

	}

	public static void main(String[] args) {

		InterfaceSample sampleObj = new InterfaceSample();
		sampleObj.display();
	}

}
