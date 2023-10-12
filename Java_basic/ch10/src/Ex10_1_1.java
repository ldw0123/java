// Calendar 클래스 예제1_1
import java.util.*;

public class Ex10_1_1 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance(); 	// Calendar 객체 생성

		int year = today.get(Calendar.YEAR);		// 연
		int month = today.get(Calendar.MONTH);		// 월 (0~11)
		int month2 = month+1;						// 월+1 (1~12)
		int date = today.get(Calendar.DATE);		// 일
		int weekOfYear = today.get(Calendar.WEEK_OF_YEAR);				 // 이 해의 몇 째 주
		int weekOfMonth = today.get(Calendar.WEEK_OF_MONTH);			 // 이 달의 몇 쩨 주
		int DATE = today.get(Calendar.DATE);							 // 이 해의 며칠
		int DayOfYear = today.get(Calendar.DAY_OF_YEAR); 				 // 이 달의 며칠
		int DayOfWeek = today.get(Calendar.DAY_OF_WEEK);			 	 // 요일		
		int DayOfWeekInMonth = today.get(Calendar.DAY_OF_WEEK_IN_MONTH); // 이 달의 몇 째 요일
		int amPm = today.get(Calendar.AM_PM); 			 	// 오전 오후
		int hour = today.get(Calendar.HOUR);			 	// 시간(12시간제)
		int hourOfDay = today.get(Calendar.HOUR_OF_DAY); 	// 시간(24시간제)
		int minute = today.get(Calendar.MINUTE); 		 	// 분
		int second = today.get(Calendar.SECOND); 			// 초

		int milliSecond = today.get(Calendar.MILLISECOND);	// 0 ~ 999
		// 천 분의 1초를 표시하기 위해 3600000으로 나누었다 (1시간 = 60 * 60초)
		int timeZone = (today.get(Calendar.ZONE_OFFSET)/(60*60*1000)); 	// TimeZone
		int getActualMaximum = today.getActualMaximum(Calendar.DATE); 	// 이 달의 마지막 날을 찾는다

		
		String[] week = new String[] {"", "일요일", "월요일", " 화요일", "수요일", "목요일", "금요일", "토요일"};		// string형 배열 객체 생성. new String[] 생략 가능
		System.out.println("오늘은 " + year + "년 " + month2 + "월 " + date + "일 " + week[DayOfWeek] + " 입니다.");
		System.out.println("오늘은 올해의 " + weekOfYear + "번째 주이며, 이 달의 " + weekOfMonth + "번째 주입니다");
		System.out.println("오늘은 올해의 " + DayOfYear + "일 째이며, 이 달의 " + DayOfWeekInMonth + "번째 " + week[today.get(Calendar.DAY_OF_WEEK)] + " 입니다");
		String[] ap = new String[] {"오전", "오후"};
		System.out.println("현재 시각은 " + ap[amPm] + " " + hour + "시 " + minute + "분 " + second + "초 입니다");
	}
}
