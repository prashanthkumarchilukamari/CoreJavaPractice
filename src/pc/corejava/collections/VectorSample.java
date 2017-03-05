package pc.corejava.collections;

import java.util.*;

public class VectorSample {

   public static void main(String args[]) {
    
      Vector<String> vectorObj = new Vector<String>();

      vectorObj.add("Vivan");
      vectorObj.add("Shanth");
      vectorObj.add("Chilukamari");
     
      Enumeration<String> en = vectorObj.elements();
      
      System.out.println("Below are the Vector Object elements :");
      while(en.hasMoreElements())
         System.out.println(en.nextElement());
   }
}