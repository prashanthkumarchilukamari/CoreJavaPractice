package pc.corejava.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSample2 {
	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<Employee>();
		
		  Employee emp1=new Employee(1001,"Vivan");  
		  Employee emp2=new Employee(1002,"Shanth");  
		  Employee emp3=new Employee(1003,"Chilukamari");  
		  Employee emp4=new Employee(1004,"Shanth");  
		      
		  
		set.add(emp4);
		set.add(emp3);
		set.add(emp2);
		set.add(emp1);
		
		// Employee class implemented comparable interface
		// Here we specified the sorting order as DESCENDING
		for (Employee emp : set) {
			System.out.println(emp);
		}
	}
}

