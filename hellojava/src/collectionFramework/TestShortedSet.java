package collectionFramework;

import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestShortedSet {

	public static void main(String[] args) {
		
		SortedSet f=  new TreeSet();
		f.add(12);
		f.add(45);
		f.add(7);
		f.add(23);
		f.add(2);
		
		System.out.println(f.subSet(7, 23));
		System.out.println(f.tailSet(23));
        System.out.println(f.first());
        System.out.println(f);
       
        
        SortedSet h = new TreeSet();
        h.add("kapil");
        h.add("ram");
        h.add("malviya");
        System.out.println(h.headSet("malviya"));
        System.out.println(h);
        
	}

}
