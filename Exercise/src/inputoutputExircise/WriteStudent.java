package inputoutputExircise;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteStudent {

	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream("D:/student.ser");
	    ObjectOutputStream out = new ObjectOutputStream(file);

	    Student s= new Student();
	    s.setName("kapil");
	    s.setRollno("0805ce151042");
	    s.setAge(24);
	    
	    System.out.println("Name of student  "+s.getName());
	    System.out.println("Roll number  "+s.getRollno());
	    System.out.println("Age of Student  "+s.getAge());
	    
	    out.writeObject(s);
	    file.close();
	    System.out.println("Serializable program");
	}

}
