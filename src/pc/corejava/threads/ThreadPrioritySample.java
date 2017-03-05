package pc.corejava.threads;



public class ThreadPrioritySample {

	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();
		 
        System.out.println("Main Thread Priority is : " + mainThread.getPriority() +"\n");    //Output : 5
        
        
		MyThread t1 = new MyThread("V1");
		 
        t1.setPriority(Thread.MIN_PRIORITY); // Priority range is 1 -10
        // t1.setPriority(100);  // For other values, will get Illegal Argument Exception
        
        t1.start();        
        
        System.out.println("V1 thread priority is  : " +t1.getPriority());  
        
	}

}
