package date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Datesimple {
public static void main(String[] args) throws ParseException {
	

	Date d= new Date();
    System.out.println(d);
    
	SimpleDateFormat srt= new SimpleDateFormat("dd/mm/yyyy");
	
	String dt = srt.format(d);//date-> string
	System.out.println(dt);
	
	String s = "24/04/1997";
	Date dd = srt.parse(s);//String	to date	
	System.out.println(dd);
}
}