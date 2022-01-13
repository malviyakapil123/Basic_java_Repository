package inputoutputExircise;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadExeternal {

	public static void main(String[] args) throws Exception {
		
		   FileInputStream file = new FileInputStream("D:/marksheet1.ser");
		   ObjectInputStream in = new ObjectInputStream(file);
		   
		   Marksheetin m1 =  (Marksheetin) in.readObject();
		   System.out.println("name :" + m1.getName());
		   System.out.println("maths :"+m1.getMaths());
		   System.out.println("chemistry :"+m1.getChemistry());
		   System.out.println("physics :"+m1.getPhysics());
		   System.out.println("total mark :"+m1.getTotal());
		   System.out.println("percentage : "+ m1.getPercentage());
		   
		   in.close();
		   file.close();
		   
	}
	
}
