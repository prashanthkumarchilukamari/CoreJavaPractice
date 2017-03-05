package pc.corejava.collections;

import java.util.TreeSet;
public class TreeSetSample {
     public static void main(String args[]) {

    	 TreeSet<String> treeSetObj = new TreeSet<String>();

         treeSetObj.add("Vivan");
         treeSetObj.add("Shanth");
         treeSetObj.add("Chilukamari");
 		
         // Elements are displayed in Natural sorting order
         // Because it implements the Comparator Interface.
         System.out.println(treeSetObj);
         
         //Below statement will throw NullPointerException
         //Because it follows natural sorting
         treeSetObj.add(null); 

    }
 }