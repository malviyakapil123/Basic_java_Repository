package date;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Calendarr {

	public static void main(String[] args) {
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		 
		cal.setTime(d);
		
		int dayOfYear =cal.get(Calendar.DAY_OF_YEAR);
		
		cal.add(Calendar.DATE, -1);
		
		
		Date yesterday = cal.getTime();
		
		cal.add(Calendar.DATE, 30);
		
		Date nextMaintenance = cal.getTime();
		
		Year y = Year.of(2012);
				
		
		
		
		System.out.println( nextMaintenance);
		
	}

}
