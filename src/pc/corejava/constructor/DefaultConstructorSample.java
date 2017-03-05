package pc.corejava.constructor;

public class DefaultConstructorSample {

	private int id;
	private String constructorName;

	/*
	 *  By default compiler will add below code if we didn't specified any constructor explicitly.
	public DefaultConstructorSample() {
		super();
	}
	
*/
	public void displayInfo() {
		System.out.println("Id value is : " + id);
		System.out.println("constructorName value is : " + constructorName);
	}

	public static void main(String[] args) {

		DefaultConstructorSample defConsObj = new DefaultConstructorSample();
		defConsObj.displayInfo();
	}

}
