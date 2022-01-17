package conccorent.collection;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class TestConcorunt {

	public static void main(String[] args) {
		
		ArrayBlockingQueue<Integer> li = new ArrayBlockingQueue<Integer>(10);
		
		li.add(5);
		li.add(56);
		li.add(51);
		li.add(25);
		li.add(85);
		li.add(35);
		li.add(75);
		li.add(25);
			
	Iterator<Integer> it=li.iterator();
	
	li.add(24);
	
   while (it.hasNext()) {
	Object ob = (Object) it.next();
	
	System.out.println(ob);
	
}
		

	}

}
