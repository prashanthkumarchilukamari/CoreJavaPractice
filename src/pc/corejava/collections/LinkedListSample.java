package pc.corejava.collections;

import java.util.*;
public class LinkedListSample {
     public static void main(String args[]) {


         LinkedList<String> ll = new LinkedList<String>();

         ll.add("Vivan");
         ll.add("Shanth");
         ll.add("Chilukamari");

         System.out.println("Printing all elements: " +ll);
         
         // Fetch first element
         String fistIndexElement = ll.get(0);
         System.out.println("fist Index Element Value : " +fistIndexElement);
         
     }
}