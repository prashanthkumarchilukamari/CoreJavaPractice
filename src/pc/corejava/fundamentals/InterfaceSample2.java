package pc.corejava.fundamentals;

interface MyInterface2 {
	int interfaceId = 100; // interface variables are by default public static final
	


	void display2(); // interface methods are by default public and abstract

}

public class InterfaceSample2 implements MyInterface, MyInterface2 {

	@Override
	public void display() {
	
		System.out.println("First interface method implementatioin");
	}

	@Override
	public void display2() {

		System.out.println("Second interface method implementation");
	}
	
	public static void main(String[] args) {

		InterfaceSample2 sampleObj = new InterfaceSample2();
		sampleObj.display();
		
		// Resolving interface variable naming conflicts
		
		System.out.println("MyInterface.interfaceId value is  : " + MyInterface.interfaceId);
		System.out.println("MyInterface2.interfaceId value is  : " + MyInterface2.interfaceId);
		
		sampleObj.display2();
	}

}
