package pc.corejava.fundamentals;

class Parent {
	
	// Scenario - 1
	void displayName() {
		System.out.println("method signature must be same");
	}

	// Scenario - 2

	Object getParentInfo() {
		String s = "Co variant return types are allowed for objects but not for primitives";
		System.out.println(s);
		return s;
	}

	// Scenario - 3

	public void m1() {
		System.out.println("Weakering of teh acess modifier not allowed");
	}

	// Scenario - 4

	private void m2() {
		System.out.println("Parent class private method");
	}
	
	// Scenario - 5
	
	public static void show(){
        System.out.printf("Method Hiding - Parent Class");
    }
	
	// Scenario - 6
	final void m3(){
		System.out.println("We cant override final method");
	}


}

class Child extends Parent {
	void displayName() {
		// Overriding - gives us a chance to re define the functionality of
		// parent class method.
		System.out.println("method signature must be same");
	}

	String getParentInfo() {
		String s = "Co variant return types are allowed for objects but not for primitives";
		System.out.println(s);
		return s;
	}

	public void m1() {
		// if we modify the above return type to private .. then we will get the
		// CTE
		System.out.println("Weakering of teh acess modifier not allowed");
	}

	private void m2() {
		System.out.println("Child class private method");
	}
	

	public static void show(){
        System.out.printf("Method Hiding - Child Class");
    }
	
	/*  // CTE
final void m3(){
	System.out.println("We cant override final method");
	}*/
	
}

public class OverrridingSample {
	public static void main(String[] args) {
		Parent parentObj = new Parent();
		parentObj.displayName();
		
		Child childObj = new Child();
		childObj.displayName();

		Parent parentObj2 = new Child();
		parentObj2.displayName();

		parentObj2.getParentInfo();

		parentObj2.m1();

//		parentObj2.m2();  Private methods seems to be overridden but its not
		
		parentObj2.show();

	}
}
