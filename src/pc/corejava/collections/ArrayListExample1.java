package pc.corejava.collections;

import java.util.*;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Vivan");
		list.add("Shanth");
		list.add("Chilukamari");
		
		// ArrayList class, already overridden the toString() method to display its elements
		System.out.println("Printing all elements " + list +"\n");
		
		list.add("Vivan");// Duplicates objects are allowed
		
		System.out.println("\n Displaying elements using the for loop");
		for (String obj : list) {
			System.out.println(obj);
		}

		// Sorting the elements
		Collections.sort(list);

		System.out.println("\n After sorting - displaying the list elements using Iterator");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
