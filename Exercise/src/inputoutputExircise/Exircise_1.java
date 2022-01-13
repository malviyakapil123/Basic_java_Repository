package inputoutputExircise;

import java.io.File;

public class Exircise_1 {

	public static void main(String[] args) {
		 File directory = new File("C:/");
			
		    String [] Files= directory.list();
		    
		    for(String h: Files){
		    	
		    	System.out.println(h);
	}
	
}
}