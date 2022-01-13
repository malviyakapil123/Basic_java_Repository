package Collectionex;

import java.util.*;

public class Employee1 {

	private String Fname;
	private String Lname;
	private int salary;
    private int ID;
	

	

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

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public boolean equals(Object obj) {

		if ( obj==null) 
		return false;
      if (!(obj instanceof Employee1))
    	  return false;
	return false;
	}
	
	public int hashCode(int ID){
		return ID;
		}
		
		
	}


