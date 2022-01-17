package jdk_8;

import java.util.ArrayList;
import java.util.List;

public class TestForEach {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(5);
		l.add(8);
		l.add(4);
		l.add(2);
		l.add(1);
		l.add(6);
		l.add(7);
		l.add(9);
		l.add(3);
		
		l.forEach(li -> System.out.println(li));

	}

}
