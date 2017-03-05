package pc.corejava.fundamentals;

import pc.corejava.collections.Employee;

class OracleEmployee extends Employee {

	private String empWorkLocation;	

	public OracleEmployee(int employeeID, String employeeName, String empWorkLocation) {
		super(employeeID, employeeName);
		this.empWorkLocation = empWorkLocation;
	}

	public String getEmpWorkLocation() {
		return empWorkLocation;
	}

	public void setEmpWorkLocation(String empWorkLocation) {
		this.empWorkLocation = empWorkLocation;
	}
	
	public void displayEmployeeInfo(){
	
		 // Using the super keyword to retrieve Parent info
		System.out.println("Parent class employee ID  variable value is : " + super.employeeID);      
	       
        System.out.println("Invoking parent class method using super "+super.getEmployeeID());
	}

}

public class InheritanceSample1 {

	public static void main(String args[]) {
		OracleEmployee oraEmp = new OracleEmployee(1,"Vivan","IDC");
		
		System.out.println("Fetching the Employee Name from parent class : " + oraEmp.getEmployeeName());
		System.out.println("Fetching the employee location from child class : " + oraEmp.getEmpWorkLocation());
		oraEmp.displayEmployeeInfo();
	}
}
