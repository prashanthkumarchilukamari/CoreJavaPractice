package pc.corejava.threads;

// Scenario - 1  
class MyThread extends Thread {

	public MyThread(String name) {
		
		super(name);
	}

	public void run() {

		System.out.println("creating a thread by extending Thread class");

		System.out.println(getName() + " .. thread is completed .. ");
	}
}

// Scenario - 2
class MyRunnable implements Runnable {

	public void run() {

		System.out.println("creating a thread by implementing Runnable interface");

		for (int i = 0; i < 1000; i++) {
			System.out.println("This is daemon thread....." + i);
		}

	}
}

/**
 * Thread sample will demonstrate
 * 
 * 1) Creating a thread 2) Set Name to a thread 3) Making the thread as Daemon
 * thread
 * 
 * @author
 *
 */
public class ThreadSample {

	public static void main(String[] args) {

		MyThread firstThreadObj = new MyThread("Vivan1"); // creating thread & setting its name
		
		firstThreadObj.run(); // we are executing run() method without starting the thread
		
		System.out.println("Thread id "  + firstThreadObj.getId());
		firstThreadObj.start();
		
		// firstThreadObj.start(); // IllegalThreadStateException. Bcoz thread is already started.
		// firstThreadObj.setDaemon(true); // IllegalThreadStateException. Bcoz thread is already started.

		MyRunnable runnableObj = new MyRunnable();
		Thread secondThreadObj = new Thread(runnableObj);
		if (!secondThreadObj.isDaemon()) {
	       secondThreadObj.setDaemon(true); // Changing the current thread to Daeamon.. before we are starting it.
			// Daemon thread wont complete its task if the non daemon threads are  already completed.
		}

		System.out.println("Default name of the second thread obj is : " + secondThreadObj.getName());

		secondThreadObj.start();

		secondThreadObj.setName("Vivan2");

		System.out.println("name of the second thread obj is : " + secondThreadObj.getName());
	}

}
