package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		System.out.println(now);
		printDate(now);
		printDate2(now);
		
		//특정 시간 셋팅(2000/08/04)
		Date d1 = new Date(100,7, 4);
		
	}
	
	//printDate2 보다는 아래의 것이 더 좋은 방법
	private static void printDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		System.out.println(sdf.format(date));
	}

	private static void printDate2(Date date) {
		//줄그어지는거 하지말라는 것 없앨꺼라는 것
		//년도 + 1900
		int year = date.getYear();
		
		//월 0~11
		int month = date.getMonth();
		
		int day = date.getDate();
		
		int hour = date.getHours();
		
		int min =date.getMinutes();
		
		
		
		System.out.println((year + 1900) + "-" + (month + 1) + "-" + day + "  " + hour + ":" + min);
		
	}

	
}
