package inputoutputpa;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writerfile implements AutoCloseable {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("D:/java.txt",true);
		PrintWriter pw = new PrintWriter(fw);
		
		for (int i= 0 ; i<= 5; i++){
			
			pw.println("Kapil And java ");
			
		}
		System.out.println("done");
    // pw.close();
    // fw.close();
	}

	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
