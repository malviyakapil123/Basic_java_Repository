package collectionFramework;

import java.util.Comparator;

public class Firstname implements Comparator<Marksheet> {

	public int compare(Marksheet o1, Marksheet o2) {
		if( o1.getFname().compareTo(o2.getFname())==0){
			
			return o1.getLname().compareTo(o2.getLname());
		}
		return o1.getFname().compareTo(o2.getFname());
		
		
	}

}
