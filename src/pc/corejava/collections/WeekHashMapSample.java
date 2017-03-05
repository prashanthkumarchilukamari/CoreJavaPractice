package pc.corejava.collections;


import java.util.Map;
import java.util.WeakHashMap;

public class WeekHashMapSample {
	public static void main(String[] args) {
		
//        Map<Employee, String> weakHashMapObj = new HashMap<Employee, String>();
		
        Map<Employee, String> weakHashMapObj = new WeakHashMap<Employee, String>();
        Employee emp1=new Employee(1001,"Vivan");
        weakHashMapObj.put(emp1, "Vivan");
        
        System.out.println(weakHashMapObj);
        
        emp1 = null;
        
        System.gc();
        
        System.out.println(weakHashMapObj);
        
        
        
    }

}
