package inputoutputExircise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Exircise_3 {
	
	public static void main(String[] args) throws IOException
    {
       
        File dir = new File("E:\\merger");
        PrintWriter pw = new PrintWriter("D:/output.txt");
 
      
        String[] fileNames = dir.list();
        for (String fn : fileNames) {
            System.out.println("Reading from " + fn);
 
            File f = new File(dir, fn);
 
            
            BufferedReader br = new BufferedReader(new FileReader(f));
            pw.println("Contents of file " + fn);
 
            
            String line = br.readLine();
            while (line != null) {
 
                
                pw.println(line);
                line = br.readLine();
            }
            
            
            pw.flush();
        }
        System.out.println("Reading from all files" +
        " in directory " + dir.getName() + " Completed");
    }

}
