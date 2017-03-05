package pc.corejava.string;

public class StringBufferSample {

	public static void main(String[] args) {
		
		StringBuffer stringBufferObj=new StringBuffer("Vivan ");  
		
		System.out.println("The value of stringBufferObj is : " + stringBufferObj);
		System.out.println("The length of stringBufferObj is : " + stringBufferObj.length());
		System.out.println("Reverse of stringBufferObj is : " + stringBufferObj.reverse());
		
		stringBufferObj.reverse();
		stringBufferObj.append("Shanth");  
		
		System.out.println("The length of stringBufferObj after append : " + stringBufferObj);
		
	}

}
