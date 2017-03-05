package pc.corejava.collections;

import java.util.*;

public class StackSample{
   public static void main(String[] args) {
	   
   Stack stack=new Stack();
   
   // Here we are adding the raw elements
   stack.push("Vivan");
   stack.push("Shanth");
   stack.push("Chilukamari");
   stack.push(new Integer(10));
  
   System.out.println("Stack elements are \n" + stack);
   System.out.println("Size of the stack is : " + stack.size());
   
   System.out.println("Pop - Removes and returns the object from top of the stack : " + stack.pop());
   System.out.println("Pop - Removes and returns the object from top of the stack : " + stack.pop());

   System.out.println("Stack elements are" + stack);
   
   System.out.println("After Pop Operation the size of the stack is : " + stack.size());
   }
 } 