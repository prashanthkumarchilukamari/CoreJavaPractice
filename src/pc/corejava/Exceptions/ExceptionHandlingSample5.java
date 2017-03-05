package pc.corejava.Exceptions;

import java.io.EOFException;
import java.io.IOException;

class Demo {

	/**
	 * While overriding the size of the checked exceptions are not allowed to
	 * increase. But we can decrease.
	 */
	public void m1() throws IOException {

	}

	// We don't have any rules for un checked exception
	public void m2() {

	}
}

public class ExceptionHandlingSample5 extends Demo {

	// valid
	public void m1() throws EOFException {

	}

	/*
	 * // In valid
	 * 
	 * public void m1() throws InterruptedException{
	 * 
	 * }
	 * 
	 */

	public void m2() throws ArithmeticException {

	}
}
