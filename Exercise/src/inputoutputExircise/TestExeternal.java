package inputoutputExircise;

import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

public class TestExeternal {

	public static void main(String[] args) throws Exception {
		
	    FileOutputStream file = new FileOutputStream("D:/marksheet1.ser");
	    ObjectOutputStream out = new ObjectOutputStream(file);
	    
	    Marksheetin m = new Marksheetin();
	    
	    m.setName("ram");
	    m.setMaths(70);
	    m.setPhysics(80);
	    m.setChemistry(90);
	    m.setTemp(99);
	    
	    System.out.println("name :"+m.getName());
	    System.out.println("maths : "+m.getMaths());
	    System.out.println("chemistry :"+ m.getChemistry());
	    System.out.println("physics :"+m.getPhysics());
	    System.out.println("total marks :" + m.getTotal());
	    System.out.println("total percentage :" + m.getPercentage());
	    
	    out.writeObject(m);
	    out.close();
	    
	    System.out.println("object is serialize and persisted");
}
	
}
