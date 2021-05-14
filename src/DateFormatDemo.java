import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

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
		System.out.println("*******************");
		DateFormat dateFormat1 = DateFormat.getTimeInstance();
		String formatedDateStr = dateFormat1.format(date);
		System.out.println(formatedDateStr);
		DateFormat dateFormat2 = DateFormat.getTimeInstance(DateFormat.LONG);
		String formatedDateStr1 = dateFormat2.format(date);
		System.out.println("formated Date Str Long   = "+formatedDateStr);
		dateFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		formatedDateStr1 = dateFormat2.format(date);
		System.out.println("formated Date Str MEDIUM = "+formatedDateStr1);
		dateFormat = DateFormat.getTimeInstance(DateFormat.SHORT);
		formatedDateStr = dateFormat2.format(date);
		System.out.println("formated Date Str SHORT  = "+formatedDateStr1);
		System.out.println("*******************");
		Locale locale = Locale.US;//j11 arg
		System.out.println(locale);
		DateFormat dateFormat3 = DateFormat.getTimeInstance(DateFormat.LONG,locale);
		String formatedDateStr3 = dateFormat3.format(date);
		System.out.println(formatedDateStr);

	}

}


