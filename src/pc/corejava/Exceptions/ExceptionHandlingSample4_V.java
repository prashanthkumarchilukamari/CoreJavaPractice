package pc.corejava.Exceptions;

public class ExceptionHandlingSample4_V {

	// Checked exceptions need to be handled by using the try - catch
	// or by using the throws key word otherwise it will throw Compile time error.
	// To resolve the issue un comment throws section

	public void method3() /* throws ClassNotFoundException */ {
		throw new ClassNotFoundException("Invalid Case");
	}

	public void method2() /* throws ClassNotFoundException */ {
		method3();
	}

	public void method1() {
		try {
			method2();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) {
		ExceptionHandlingSample4_V excpObj = new ExceptionHandlingSample4_V();
		excpObj.method1();
	}
}
