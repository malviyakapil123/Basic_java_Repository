package inputoutputpa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Linebyline {

	public static void main(String[] args) throws Exception {
		  FileReader F= new FileReader("D:/java.txt");
		  
		  BufferedReader br = new BufferedReader(F);
		  
		  String ln = br.readLine();
		  while (ln!=null){
			  
			  System.out.println(ln);
			  ln = br.readLine();
			  
		  }
		  F.close();

	}

}
