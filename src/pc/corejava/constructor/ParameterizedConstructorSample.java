package pc.corejava.constructor;

public class ParameterizedConstructorSample {

	private int consId;
	private String consName;
	private String consType;
	
	// If we specify the parameterized constructor explicitly .. then compiler wont add the Default Constructor.
	public ParameterizedConstructorSample(int consId, String consName) {
		this.consId = consId;
		this.consName = consName;
	}
	
	// Overloaded constructor
	public ParameterizedConstructorSample(int consId, String consName, String consType) {
		this.consId = consId;
		this.consName = consName;
		this.consType = consType;
	}
	
	public void displayInfo() {
		System.out.println("Id value is : " + consId);
		System.out.println("constructorName value is : " + consName);
		System.out.println("consType value is : " + consType);
	}
	
	public static void main(String[] args) {

		ParameterizedConstructorSample paramConsObj = new ParameterizedConstructorSample(1,"Vivan");
		paramConsObj.displayInfo();
		
		System.out.println(" ***********  ");

		ParameterizedConstructorSample paramConsObj1 = new ParameterizedConstructorSample(1,"Vivan","OverloadedConst");
		paramConsObj1.displayInfo();
	}

}
