package pc.corejava.collections;

import java.util.*;  
public class ArrayListExample2{  
 public static void main(String args[]){  
  
  Employee emp1=new Employee(1001,"Vivan");  
  Employee emp2=new Employee(1002,"Shanth");  
    
  ArrayList<Employee> al=new ArrayList<Employee>();  
  al.add(emp1);
  al.add(emp2);  
 
  System.out.println("Array List elements are " + al);
  
  // Adding an element at a particular index
  al.add(0, new Employee(1003,"Chilukamari"));
  System.out.println("Array List elements after index based add operation " + al);

  //Removing an element from a particular index   
  al.remove(new Employee(1002,"Shanth"));
  System.out.println("Array List elements after remove operation " + al);
  
  Iterator<Employee> itr=al.iterator();  
  //traversing elements of ArrayList object  
  while(itr.hasNext()){  
	  Employee empObj=(Employee)itr.next();  
    System.out.println(empObj);  
  }  
 }  
}  
