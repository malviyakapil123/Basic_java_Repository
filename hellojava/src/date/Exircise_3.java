package date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Exircise_3 {

	public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("2020-01-30");
        Date date2 = sdf.parse("2020-01-29");

        System.out.println("date1 : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));

        int result = date1.compareTo(date2);
        System.out.println("result: " + result);

        if (result == 0) {
            System.out.println("Date1 is equal to Date2");
        } else if (result > 0) {
            System.out.println("Date1 is after Date2");
        } else if (result < 0) {
            System.out.println("Date1 is before Date2");
        } else {
            System.out.println("How to get here?");
        }

    }
	
}
