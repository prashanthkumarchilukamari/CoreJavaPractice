package pc.corejava.Exceptions;

public class ExceptionHandlingSample1 {
	   public static void main(String args[]) {
		  
	     int divisor = 0, result;
	     try { 
	        result = 62 / divisor;
	        System.out.println(result);
	     } 
	     /*
	     catch(Exception e){
	    	 System.out.println("Invalid order of the catch blocks");
	     }
	    */ 
	     catch (ArithmeticException e) { 
	            System.out.println("We got Arithmetic Exception");
	       }
	     finally{
	    	
	    	 // System.exit(0);  un comment this line and check the finally block code execution
	    	 System.out.println("This will be executed in every case Except the system.exit() call  ");
	     }
	     
	   }
	}