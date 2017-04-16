import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

 class X {

	public static void main(String[] args) throws ParseException {

		//Locale locale = Locale.ENGLISH; 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd EEE a",Locale.US);

		//  利用 DateFormat 來parse 日期的字串
		DateFormat df = DateFormat.getDateInstance();
		Date date = df.parse("2009/1/1");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println(sdf.format(calendar.getTime()));

		//  利用 set 直接輸入日期
		calendar.set(2009, Calendar.JANUARY, 2);
		System.out.println(sdf.format(calendar.getTime()));
		
		
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		Date current = new Date();
		System.out.println(sdFormat.format(current));
		
		System.out.println("=====================================================================");
		
		
		SimpleDateFormat dfDate = new SimpleDateFormat("yyyy/MM/dd");

		Calendar cal= Calendar.getInstance();

		//cal.set(2017 , 8-1 , 29);
		Date date1 = cal.getTime(); //日期1
		System.out.println("日期1:"+dfDate.format(cal.getTime())); 

		cal.set(1994 , 12-1 , 24);
		Date date2 = cal.getTime(); //日期2
		System.out.println("日期2:"+dfDate.format(cal.getTime())); 

		long daterange = date1.getTime() - date2.getTime(); 
		long time = 1000*3600*24; //A day in milliseconds

		int result =(int)(daterange/time);

		System.out.print("日期1-日期2 = " + result + "天") ;
	}
}
