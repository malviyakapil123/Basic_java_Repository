package Collectionex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exircise_6 {

	public static void main(String[] args) {
		
		Set s1 = new HashSet<>();
		
		s1.add(12);
		s1.add("fahim");
		s1.add(21);
		s1.add(63);
		s1.add(24);
		s1.add(84);
		s1.add(57);
		s1.add(49);
		s1.add(46);
		s1.add(142);
		
		Iterator i=  s1.iterator();
		while (i.hasNext()) {
			Object s11 = (Object) i.next();
			System.out.println("Hashset  "+s11);
		}
		
		
		Set s2 = new LinkedHashSet<>();
		s2.add(45);
		s2.add(25);
		s2.add(61);
		s2.add("kapil");
		s2.add('j');
		s2.add(52);
		s2.add(34);
		s2.add(84);
		s2.add(29);
		s2.add(19);
		
		
		Iterator i1=  s2.iterator();
		while (i1.hasNext()) {
			Object s22 = (Object) i1.next();
			System.out.println("Hashset  "+s22);
		}
		
		 
		Set s3 = new TreeSet<>();
		
		s3.add(21);
		s3.add(52);
		s3.add(24);
		s3.add(53);
		s3.add(94);
		s3.add(65);
		s3.add(38);
		s3.add(29);
		s3.add(58);
		s3.add(75);
		
		Iterator i2=  s3.iterator();
		while (i2.hasNext()) {
			Object s33 = (Object) i2.next();
			System.out.println("Hashset  "+s33);
			
		}
		
	}

}
