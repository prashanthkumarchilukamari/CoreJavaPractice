package pc.corejava.fundamentals;

public class OverloadingSample2 {

	 

	private void displayName(String name) {

		System.out.println("Between parent and child objects.. child will gets high priority  ---> " + name );
	}

	private void displayName(Object name) {

		System.out.println("Parent Class as an argument   ---> " + name);
	}
	
	private void add(long num1 , long num2){
		System.out.println("Type promotion will occurs if the matching method is not available");
	}

	/*private void displayName(String... name) {

		System.out.println("Var arg method has the low priority  ---> " + name );
	}*/
	
	public static void main(String args[]) {
		OverloadingSample2 obj = new OverloadingSample2();
		obj.displayName("Vivan");
		obj.displayName(null);
		obj.add(10,20);
		obj.displayName("Vivan");
	}
}
