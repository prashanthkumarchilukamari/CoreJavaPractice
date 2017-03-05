package pc.corejava.generics;

import java.util.ArrayList;
import java.util.Iterator;

import pc.corejava.collections.Employee;

public class GenericsSample {

	public static void main(String[] args) {

		// Scenario -1 --->
		ArrayList list = new ArrayList(); // For this list, we can add any type
											// of data.

		list.add("Vivan"); // String Obj
		list.add(new Employee(1, "Vivan")); // Custom Obj
		list.add(123); // Integer Obj

		for (Object object : list) {

			// As we are not sure about the type of the object coming from the
			// list ..
			// We will end up with ClassCastException at run time.

			String str = (String) object;
			System.out.println(str);
		}

		// Scenario - 2
		ArrayList<String> genericAL = new ArrayList<String>();

		genericAL.add("Vivan");

		// genericAL.add(new Employee(1,"Vivan")); // We are not allowed to add
		// anything other than string values

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String stringObj = iterator.next(); // class cast exception will not occur
			System.out.println("Type casting not required for the generic type collections " + stringObj);
		}

	}

}
