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
		System.out.println("������ ��¥�� "+year+"�� "+month+"�� "+date+"��");
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int ampm = cal.get(Calendar.AM_PM);
		if(ampm==Calendar.AM)
			System.out.print("���� �ð��� AM ");
		else
			System.out.print("���� �ð��� PM ");
		System.out.println(hour + "�� " + min + "�� " + sec +"��");
		
		Date d = new Date();
		SimpleDateFormat sf = 
				new SimpleDateFormat("YYYY�� MM�� dd�� HH�� mm�� ss��");
	    String df = sf.format(d);
	    System.out.println(df);
	}
}