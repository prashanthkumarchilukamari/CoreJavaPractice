package pc.corejava.Exceptions;

import java.io.IOException;

class ExceptionHandlingSample2 {

	int number;
	// constructor with checked exception
	public ExceptionHandlingSample2() throws IOException {
          number = 10;
          
	}

}

 class ExceptionHandlingSample3 extends ExceptionHandlingSample2 {

	/**
	 * If parent class constructor throws some checked exception
	 * then compulsory child class constructor should throw the same checked exception 
	 * or its parent. otherwise will get CTE.  
	 * 
	 */
	 
	public ExceptionHandlingSample3() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
