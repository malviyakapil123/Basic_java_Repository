package Collectionex;

import java.util.ArrayList;
import java.util.Iterator;

public class Exircise_4 extends Employee1{

	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1();
		e1.setFname("Fahim");
		e1.setLname("Ansari");
		e1.setSalary(10000);
		 
		Employee1 e2 = new Employee1();
		e2.setFname("Kapil");
		e2.setLname("Malviya");
		e2.setSalary(50000);
		
		Employee1 e3 = new Employee1();
		e3.setFname("Yash");
		e3.setLname("Jain");
		e3.setSalary(60000);
		
		Employee1 e4 = new Employee1();
		e4.setFname("Rahul");
		e4.setLname("Jain");
		e4.setSalary(40000);
		
		Employee1 e5 = new Employee1();
		e5.setFname("Raja");
		e5.setLname("Biswas");
		e5.setSalary(30000);
		
		ArrayList<Employee1> A = new ArrayList<Employee1>();
		A.add(e1);
		A.add(e2);
		A.add(e3);
		A.add(e4);
		A.add(e5);
		
		Iterator<Employee1> it = A.iterator();

		while (it.hasNext()) {
			Employee1 employee1 = (Employee1) it.next();
			
			
			
			
		}
		
		
	}

	
}