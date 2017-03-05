package pc.corejava.collections;

import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapSample {
    public static void main(String args[]) {
         // HashMap Declaration
         LinkedHashMap<Integer, String> linkedHashMapObj = new LinkedHashMap<Integer, String>();

         linkedHashMapObj.put(1001, "Vivan");       
         linkedHashMapObj.put(null, null);
         linkedHashMapObj.put(1003, "Chilukamari");
         linkedHashMapObj.put(1002, "Shanth");      
       
         linkedHashMapObj.put(1004, null);
         
         // It is same as hash map excepts it saves the insertion order
         
         for(Map.Entry m:linkedHashMapObj.entrySet()){  
       	     System.out.println(m.getKey()+" "+m.getValue());  
       	   }  
    }
}