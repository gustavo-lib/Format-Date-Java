import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo {

	public static void main(String[] args) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT);
		String strDate = dateFormat.format(date);
		System.out.println("DEFAULT format = "+strDate);

		dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		strDate = dateFormat.format(date);
		System.out.println("FULL format = "+strDate);

		dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		strDate = dateFormat.format(date);
		System.out.println("LONG format = "+strDate);

		dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		strDate = dateFormat.format(date);
		System.out.println("SHORT format = "+strDate);

	}

}


