package pc.corejava.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetSample {
	public static void main(String args[]) {
		// LinkedHashSet of String Type
		LinkedHashSet<String> linkedHashSetObj = new LinkedHashSet<String>();

		linkedHashSetObj.add("Vivan");
		linkedHashSetObj.add("Shanth");
		linkedHashSetObj.add("Chilukamari");

		// Linked hash set will save the insertion order of the objects
		System.out.println(linkedHashSetObj);

	}
}