package pc.corejava.innerClasses;

public class StaticNestedClassDemo {

	static private final int regestrationId = 1001;
	int grade = 9;
	// Method Local Inner Class
	static class Student {
		int studentId = 101;

		public void displaySchoolInfo() {
			System.out.println("Instance method of static nested class");
			System.out.println("Regestration Id : " + regestrationId);
			// System.out.println(grade); // we can't access the non static data of outer class
		}

		public static void showStudentInfo() {
			System.out.println("Static method of static nested class");
		}

	}

	public static void main(String[] args) {
		StaticNestedClassDemo.Student obj = new StaticNestedClassDemo.Student();
		obj.displaySchoolInfo(); // Accessing instance method

		StaticNestedClassDemo.Student.showStudentInfo(); //outerclass.innerclass.staticMethod()
	}
}
