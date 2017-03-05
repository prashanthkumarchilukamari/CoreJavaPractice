package pc.corejava.string;

public class StringBuilderSample {

	public static void main(String[] args) {

		StringBuilder stringBuilderObj = new StringBuilder("Vivan ");

		System.out.println("The value of stringBufferObj is : " + stringBuilderObj);
		System.out.println("The length of stringBufferObj is : " + stringBuilderObj.length());
		System.out.println("Reverse of stringBufferObj is : " + stringBuilderObj.reverse());

		stringBuilderObj.reverse();
		stringBuilderObj.append("Shanth");

		System.out.println("The length of stringBufferObj after append : " + stringBuilderObj);

		stringBuilderObj.insert(0, "A");
		System.out.println("Inserting 'A' at the begining : " + stringBuilderObj);

		stringBuilderObj.deleteCharAt(0);
		System.out.println("deleting 'A' from the begining : " + stringBuilderObj);

	}

}