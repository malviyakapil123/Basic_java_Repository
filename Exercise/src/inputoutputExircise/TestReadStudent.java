package inputoutputExircise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestReadStudent {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("E:/Student1.ser");
		   ObjectInputStream in = new ObjectInputStream(file);
   
		   Student s = (Student) in.readObject();
		   
		   System.out.println("name :" + s.getName());
		   System.out.println("rollno :" + s.getRollno());
		   System.out.println("age :" + s.getAge());
		   
		   in.close();
		   file.close();
		   
	}

}
