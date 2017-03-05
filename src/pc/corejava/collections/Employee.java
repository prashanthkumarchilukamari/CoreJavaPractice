package pc.corejava.collections;

public class Employee implements Comparable<Employee> {
	public int employeeID;
	public String employeeName;

	public Employee(int employeeID, String employeeName) {
		this.setEmployeeID(employeeID);
		this.setEmployeeName(employeeName);

	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return employeeID + " " + employeeName;
	}
	
	 //Two objects are equal if their names are same
	@Override
	public boolean equals(Object obj) {
          Employee emp = (Employee)obj;
		return employeeName.equals(emp.employeeName);
	}
	
	@Override
	public int compareTo(Employee emp) {
		if(employeeID<emp.employeeID){ 
			  return 1;  
		}else if(employeeID>emp.employeeID){
			 return -1;  
		}else{ 
			return 0;  
		}
	}

	public static <T> void genericMethodDemo(T t1)
    {
         
        System.out.println("Executing Generic method " +t1);
    }


	
}
