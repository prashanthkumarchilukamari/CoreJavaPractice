package pc.corejava.fundamentals;

public class OverloadingSample {

	private void display() {
		System.out.println("Display overlaoded method invocation");
	}

	private void display(int number) {

		System.out.println("Invoking one argument overloaded method " + number );
	}

	private void display(int id, int no) {

		System.out.println("Invoking two argument overloaded method " + id +" - " + no);
	}

	public static void main(String args[]) {
		OverloadingSample obj = new OverloadingSample();
		obj.display(); 
		obj.display(3);
		obj.display(6,9); 
	}
}
