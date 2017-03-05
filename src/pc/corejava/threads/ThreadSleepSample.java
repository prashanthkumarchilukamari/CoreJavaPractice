package pc.corejava.threads;
public class ThreadSleepSample 
{
    public static void main(String args[]) 
    {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
         
        try
        {
        	System.out.println("Before sleeping");
            for(int count = 0; count <5 ; count ++) 
            {
                System.out.println("Count value is : " + count); 
                //sleep() method throws checked exception - InterruptedException 
                
                Thread.sleep(1000);  // Current thread will sleep for 1sec
                
                //Scenario - 2 
                
                // Thread.sleep(-3);  //Will get  Illegal argument exception for negative value
                
                // Scenario - 3 -- > Allowed nanosecond range values are  0 – 999999.
                
                //Thread.sleep(100,10000000);   //IllegalArgumentException: nanosecond timeout value out of range
            }
            
            System.out.println("After sleeping ");
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Current thread is interrupted");
        }
    }
}