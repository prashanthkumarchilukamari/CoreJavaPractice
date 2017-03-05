package pc.corejava.collections;

import java.util.HashMap;
import java.util.Map;
public class HashMapSample {

   public static void main(String args[]) {

      HashMap<Integer, String> hashMapObj = new HashMap<Integer, String>();

      
      hashMapObj.put(1001, "Vivan");
      //It accepts null as key only once
      hashMapObj.put(null, null);
      hashMapObj.put(1003, "Chilukamari");
      hashMapObj.put(1002, "Shanth");
      
    //It accepts null as value multiple times
      hashMapObj.put(1004, null);
      
      // It doesn't save the insertion order
      for(Map.Entry m:hashMapObj.entrySet()){  
    	     System.out.println(m.getKey()+" "+m.getValue());  
    	   }  

      
      //Fetch the value based on key
      String var= hashMapObj.get(1001);
      System.out.println("Value for the key 1001 is : "+var);

      // Delete the value based on the key
      hashMapObj.remove(1003);
      System.out.println("key and values after removal:" + hashMapObj);
      
      // HashMap uses equals() method to check whether two keys are same or not
      hashMapObj.put(1001, "Vivan updated");
      System.out.println("key and values after removal:" + hashMapObj);
      

   }
}