package inputoutputExircise;

import java.io.FileInputStream;

import java.io.ObjectInputStream;

public class TestReadStudent {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("D:/student.ser");
		   ObjectInputStream in = new ObjectInputStream(file);
   
		   Student s1 = (Student) in.readObject();
		   
		   System.out.println("name :" + s1.getName());
		   System.out.println("rollno :" + s1.getRollno());
		   System.out.println("age :" + s1.getAge());
		   
		   
		   file.close();
		   in.close();
		  
		   
	}

}
