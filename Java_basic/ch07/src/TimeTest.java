// 캡슐화와 접근제어자

class Time {
	private int hour;		// 0~23 사이의 값
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isNotValidHour(hour))
			return;			// true이면 빠져나옴
		this.hour = hour;	// false이면 값을 바꿈
	}

	private boolean isNotValidHour(int hour) {
		return isValidHour(hour);
	}

	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
	private boolean isValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	
	public int getHour() {
		return hour;
	}
}

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(21);		// hour의 값을 21로 바꿈
		System.out.println(t.getHour());
		t.setHour(100);		// hour의 값이 바뀌지 않으므로 여전히 hour는 21
		System.out.println(t.getHour());
	}

}
