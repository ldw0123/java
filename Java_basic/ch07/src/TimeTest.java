// ĸ��ȭ�� ����������

class Time {
	private int hour;		// 0~23 ������ ��
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isNotValidHour(hour))
			return;			// true�̸� ��������
		this.hour = hour;	// false�̸� ���� �ٲ�
	}

	private boolean isNotValidHour(int hour) {
		return isValidHour(hour);
	}

	// �Ű������� �Ѱ��� hour�� ��ȿ���� Ȯ���ؼ� �˷��ִ� �޼���
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
		t.setHour(21);		// hour�� ���� 21�� �ٲ�
		System.out.println(t.getHour());
		t.setHour(100);		// hour�� ���� �ٲ��� �����Ƿ� ������ hour�� 21
		System.out.println(t.getHour());
	}

}
