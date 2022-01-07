package collectionFramework;

import java.util.Comparator;

public class Lastname implements Comparator<Marksheet> {

	public int compare(Marksheet o1, Marksheet o2) {
		
		return o1.getLname().compareTo(o2.getLname());
	}

}
