package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		
		Set s = new HashSet();
		s.add("kapil");
		s.add('l');
		s.add(20);
		s.add(12.33);
		s.add(20.5f);
		s.add(122222L);
		System.out.println(s);
		
		Set g = new LinkedHashSet();
		g.add("Swati");
		g.add('g');
		g.add(26);
		g.add(12.366);
		g.add(22.5f);
		g.add(1662222L);
		System.out.println(g);
		
		Set k = new TreeSet();
		k.add(55);
		k.add(555);
		System.out.println(k);

	}

}
