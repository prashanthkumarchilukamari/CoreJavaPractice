package pc.corejava.collections;

import java.util.HashSet;

public class HashSetSample {
	public static void main(String args[]) {
		HashSet<String> hashSetObj = new HashSet<String>();

		hashSetObj.add("Vivan");
		hashSetObj.add("Shanth");
		hashSetObj.add("Chilukamari");
		
		// Duplicates are objects are not allowed so it wont the add the value again 
		//And also below statement wont throw any exception
		hashSetObj.add("Vivan"); 

		// Hash set will save the insertion order of the objects
		System.out.println(hashSetObj);
	}
}