package Oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class TestPerson {

	public static void main(String[] args) throws ParseException {
		
		
       

		SimpleDateFormat s= new SimpleDateFormat("dd/MM/yyyy");

		Person pr= new Person();
		
		
		pr.setName("Kapil");
	    pr.setDob(s.parse("05/07/1997"));
	    
		pr.setAddress("Indore");
        
		System.out.println("person name"+pr.getName());
		System.out.println(pr.getDob());
		System.out.println("person address " + pr.getAddress());
		
		
		
	}

}
