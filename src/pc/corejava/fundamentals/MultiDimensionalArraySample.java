package pc.corejava.fundamentals;

import pc.corejava.collections.Employee;

public class MultiDimensionalArraySample {

	public static void main(String[] args) {
		
		System.out.println("Scenario - 1 : Multi Dimensional Array ");
		 int[][] intArr = { { 1,2,3 }, { 4,5,6 }, { 7,8,9 } };
		 
	        for (int[] row : intArr) {
	            for (int num : row) {
	                System.out.println(num + " ");
	            }
	        }
	 
	        
	     System.out.println("Scenario - 2 : Object Array ");
	     
	     Employee[] employees = new Employee[2];
	     
	        employees[0] = new Employee(1,"Vivan");
	        employees[1] = new Employee(2,"Shanth");
	 
	        for (int i = 0; i < employees.length; i++) {
	            System.out.println(employees[i]);
	        }


	}

}
