package Collectionex;

import java.util.Comparator;

public class LastName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getLname().compareTo(o2.getLname())==0){
			return o1.getFname().compareTo(o2.getFname());
		}
		
		return o1.getLname().compareTo(o2.getLname());
		
	}

}
