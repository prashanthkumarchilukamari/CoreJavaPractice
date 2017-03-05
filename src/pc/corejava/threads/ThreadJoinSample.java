package pc.corejava.threads;

public class ThreadJoinSample extends Thread {
	
	// Defining the task
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		ThreadJoinSample thread1 = new ThreadJoinSample();
		ThreadJoinSample thread2 = new ThreadJoinSample();
		
		/*
		 
		// Scenario - 1 -- > Here the order of execution will depends on the thread scheduler
		// Comment scenario 2 code and test it
		  
		thread1.start();
		thread2.start();

		*/
		
		
		
		//Scenario - 2 
		
		thread1.start();
		try {
			thread1.join(); // Waits for this thread to die.
			System.out.println("thread1 thread completed");
		} catch (Exception e) {
			System.out.println(e);
		}

		thread2.start();

	}
}