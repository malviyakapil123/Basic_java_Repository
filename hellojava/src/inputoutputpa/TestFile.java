package inputoutputpa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Date;

public class TestFile {

	public static void main(String[] args) throws Exception {
		
		File f = new File("D:/java.txt");
		
		
		
		if(f.exists()){
			
			System.out.println("name    "+ f.getName());
			System.out.println("path   "+ f.getAbsolutePath());
			System.out.println("readable  "+ f.canRead());
			System.out.println("Writeble  "+ f.canWrite());
			System.out.println("Is File  "+ f.isFile());
			System.out.println("is dir  "+ f.isDirectory());
			
			Date d= new Date(f.lastModified());
		    System.out.println("Date  of modified "+ d);
		    
		    File directory = new File("C:/");
			
		    String [] Files= directory.list();
		    
		    for(String h: Files){
		    	
		    	System.out.println(h);
		    	
		    	
		    }
		    
		}
            FileReader F= new FileReader("D:/java.txt");
            
            int ch=F.read();
            char chr;
            
            while(ch!=-1){
            	
            	chr = (char)ch;
            	
            	System.out.print(chr);
            	ch=F.read();
            }
            
	}

}
