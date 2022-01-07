package Collectionex;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{

	private  String Fname;
	private  String Lname;
	private  int salary;
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o2.getSalary()-o1.getSalary();
	}
	
	
}
