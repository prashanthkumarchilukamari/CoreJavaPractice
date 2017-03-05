package pc.corejava.innerClasses;

import pc.corejava.collections.Employee;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Employee empSubClass = new Employee(1, "Vivan")
        {
            @Override
			public int getEmployeeID()
            {
                System.out.println("Employee sub class specific implementation");
                return employeeID;
            }
        };
        empSubClass.getEmployeeID();

	}

}
