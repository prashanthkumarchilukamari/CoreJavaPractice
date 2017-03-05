package pc.corejava.collections;


import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapSample {

   public static void main(String[] args) {

      
       
       IdentityHashMap<Integer,String> identityHMObj = new IdentityHashMap<>();
       
       identityHMObj.put(new Integer(1),"Vivan");
       identityHMObj.put(new Integer(2), "Shanth");
       identityHMObj.put(new Integer(3), "Chilukamari");
       
       System.out.println("identityHMObj size = " + identityHMObj.size());
       System.out.println("identityHMObj values are : " + identityHMObj);
       
       // IdentityHashMap uses the == operator to check whether two keys are same or not
       // So it wont replace the value of key 1
       identityHMObj.put(new Integer(1), "Vivan Updated");
       
       System.out.println("studentIdentityMap size = " + identityHMObj);
   }

}

