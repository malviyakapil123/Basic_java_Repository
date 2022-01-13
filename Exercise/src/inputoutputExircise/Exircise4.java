package inputoutputExircise;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Exircise4 {

	public static void main(String[] args) throws Exception {
		String r="D:/java.txt";
		FileWriter fw = new FileWriter(r,true);
		PrintWriter pw = new PrintWriter(fw);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		 String ln = br.readLine();
		  while (!ln.equals("quit")){
			  
			  pw.println(ln);
			  ln = br.readLine();
			  
		  }
        fw.close();
        pw.close();

	}

}
