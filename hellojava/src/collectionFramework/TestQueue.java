package collectionFramework;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {
		
		Queue l= new PriorityQueue();
		
		l.add(5);
		l.add(4);
		l.add(444);
		l.add(52);
		l.add(5545);
		l.add(475);
		l.add(635);
		System.out.println(l);
		
		Queue j =new LinkedList();
		
		j.add("Harshit");
		j.add("Raj");
		j.add("Satyam");
		j.add("Harsh");
		j.add("Yash");
		j.add("Ram");
		j.add("Raja");
		System.out.println(j);

	}

}
