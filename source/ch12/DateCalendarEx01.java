package ch12;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateCalendarEx01 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int  month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		System.out.println("오늘의 날짜는 "+year+"년 "+month+"월 "+date+"일");
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int ampm = cal.get(Calendar.AM_PM);
		if(ampm==Calendar.AM)
			System.out.print("현재 시간은 AM ");
		else
			System.out.print("현재 시간은 PM ");
		System.out.println(hour + "시 " + min + "분 " + sec +"초");
		
		Date d = new Date();
		SimpleDateFormat sf = 
				new SimpleDateFormat("YYYY년 MM월 dd일 HH시 mm분 ss초");
	    String df = sf.format(d);
	    System.out.println(df);
	}
}