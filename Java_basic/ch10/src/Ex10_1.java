// Calendar 클래스 예제1
import java.util.*;

public class Ex10_1 {
	public static void main(String[] args) {
		// 기본적으로 현재 날짜와 시간으로 설정된다
		Calendar today = Calendar.getInstance(); 	// Calendar 객체 생성
		
		System.out.println("이 해의 년도: "+today.get(Calendar.YEAR));
		System.out.println("월: "+today.get(Calendar.MONTH));	// 0: 1월 ~ 11: 12월
		System.out.println("이 해의 몇 째 주: "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 쩨 주: "+today.get(Calendar.WEEK_OF_MONTH));
		// DATE와 DAY_OF_MONTH는 같다
		System.out.println("이 달의 며칠: "+today.get(Calendar.DATE));
		System.out.println("이 달의 며칠: "+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 며칠: "+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일: "+today.get(Calendar.DAY_OF_WEEK)); 	// 1: 일요일 ~ 7: 토요일
		System.out.println("이 달의 몇 째 요일: "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전_오후: "+today.get(Calendar.AM_PM)); 	// 0: 오전, 1: 오후
		System.out.println("시간(12시간제): "+today.get(Calendar.HOUR)); 	// 0 ~ 11
		System.out.println("시간(24시간제): "+today.get(Calendar.HOUR_OF_DAY));	// 0 ~ 23
		System.out.println("분: "+today.get(Calendar.MINUTE)); 	// 0 ~ 59
		System.out.println("초: "+today.get(Calendar.SECOND)); 	// 0 ~ 59
		System.out.println("1000분의 1초: "+today.get(Calendar.MILLISECOND));	// 0 ~ 999
		// 천 분의 1초를 표시하기 위해 3600000으로 나누었다 (1시간 = 60 * 60초)
		System.out.println("TimeZone: "+(today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
		System.out.println("이 달의 마지막 날: "+today.getActualMaximum(Calendar.DATE)); 	// 이 달의 마지막 날을 찾는다
	}
}
