package inputoutputpa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyTextFile  {

	public static void main(String[] args) throws Exception {
		
		String src = "D:/copy.txt";
		String trgt = "D:/paste.txt";
				
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(trgt);
		
		int ch  = fr.read();
		while(ch!=-1){
			
			fw.write(ch);
			ch  = fr.read();
			
		}
		System.out.println(src+"is copy to"+ trgt);
     fw.close();
     fr.close();
	}

	

}
