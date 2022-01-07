package inputoutputpa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyImage {

	public static void main(String[] args) throws Exception  {
		
		String src = "D:/test.png";
		String trgt = "D:/paste.png";
				
		FileInputStream fr = new FileInputStream(src);
		FileOutputStream fw = new FileOutputStream(trgt);
		
		int ch  = fr.read();
		while(ch!=-1){
			
			fw.write(ch);
			ch  = fr.read();
			
		}
		System.out.println("done");
		System.out.println(src+"is copy to"+ trgt);
     fw.close();
     fr.close();
	}
		
	}


