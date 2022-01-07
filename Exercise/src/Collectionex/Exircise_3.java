package Collectionex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Exircise_3 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setFname("Fahim");
		e1.setLname("Ansari");
		e1.setSalary(10000);
		 
		Employee e2 = new Employee();
		e2.setFname("Kapil");
		e2.setLname("Malviya");
		e2.setSalary(50000);
		
		Employee e3 = new Employee();
		e3.setFname("Yash");
		e3.setLname("Jain");
		e3.setSalary(60000);
		
		Employee e4 = new Employee();
		e4.setFname("Rahul");
		e4.setLname("Jain");
		e4.setSalary(40000);
		
		Employee e5 = new Employee();
		e5.setFname("Raja");
		e5.setLname("Biswas");
		e5.setSalary(30000);
		
		ArrayList<Employee> A = new ArrayList<Employee>();
		A.add(e1);
		A.add(e2);
		A.add(e3);
		A.add(e4);
		A.add(e5);
		
		Collections.sort(A,new LastName());
		
		Iterator<Employee> itr= A.iterator();
		while (itr.hasNext()) {
			Employee em = (Employee) itr.next();
			System.out.println(em.getFname()+"  "+ em.getLname()+"  "+em.getSalary());
		

			
		}

	}

}
