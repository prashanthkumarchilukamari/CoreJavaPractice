package pc.corejava.collections;

import java.util.*;

public class PriorityQueueSample {
	public static void main(String args[]) {
		PriorityQueue<String> queueObj = new PriorityQueue<String>();
		
		queueObj.add("Vivan");
		queueObj.add("Shanth");
		queueObj.add("Chilukamari");
		
		System.out.println(queueObj);
		
		queueObj.add("Abc");
		
		System.out.println("**************"+queueObj); // check the order of the elements it is displaying
		
		//if queue is empty then peek() method will return NULL
		System.out.println("First Element is retrived :" + queueObj.peek());
		
		
		
		Iterator<String> itrObj = queueObj.iterator();
		while (itrObj.hasNext()) {
			System.out.println(itrObj.next());
			
		}
		
		
		System.out.println("First element is removed ");
		//if queue is empty then poll() method will return NULL
		queueObj.poll();
		
		Iterator<String> itrObject2 = queueObj.iterator();
		while (itrObject2.hasNext()) {
			System.out.println(itrObject2.next());
		}
	}
}
