package collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class TestCollection {

	public static void main(String[] args) {
		
		List l = new Vector();
		l.add(52);
		l.add('k');
		l.add("ram");
		l.add(52.22);
		l.add("raj");
		
		System.out.println(l.size());
		System.out.println(l.isEmpty()); 
		System.out.println(l);
		
		
		List h = new Stack();
		h.add(5);
		h.add('h');
		h.add("raja");
		h.add(52.22);		
		h.add("aman");
		h.addAll(l);
		System.out.println(h.contains(5)); 
		System.out.println(h);
		
		List j = new ArrayList();
		j.add(5);
		j.add('h');
		j.add("raja");
		j.add(52.22);		
		j.add("aman");
		j.addAll(l);
		System.out.println(j);
		
		List a= new LinkedList();
		a.add(5);
		a.add('h');
		a.add("raja");
		a.add(52.22);		
		a.add("aman");
		a.addAll(l);
		System.out.println("A list   "+a);
		
	}

}
