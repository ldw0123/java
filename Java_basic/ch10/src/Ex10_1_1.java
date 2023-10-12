// Calendar Ŭ���� ����1_1
import java.util.*;

public class Ex10_1_1 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance(); 	// Calendar ��ü ����

		int year = today.get(Calendar.YEAR);		// ��
		int month = today.get(Calendar.MONTH);		// �� (0~11)
		int month2 = month+1;						// ��+1 (1~12)
		int date = today.get(Calendar.DATE);		// ��
		int weekOfYear = today.get(Calendar.WEEK_OF_YEAR);				 // �� ���� �� ° ��
		int weekOfMonth = today.get(Calendar.WEEK_OF_MONTH);			 // �� ���� �� �� ��
		int DATE = today.get(Calendar.DATE);							 // �� ���� ��ĥ
		int DayOfYear = today.get(Calendar.DAY_OF_YEAR); 				 // �� ���� ��ĥ
		int DayOfWeek = today.get(Calendar.DAY_OF_WEEK);			 	 // ����		
		int DayOfWeekInMonth = today.get(Calendar.DAY_OF_WEEK_IN_MONTH); // �� ���� �� ° ����
		int amPm = today.get(Calendar.AM_PM); 			 	// ���� ����
		int hour = today.get(Calendar.HOUR);			 	// �ð�(12�ð���)
		int hourOfDay = today.get(Calendar.HOUR_OF_DAY); 	// �ð�(24�ð���)
		int minute = today.get(Calendar.MINUTE); 		 	// ��
		int second = today.get(Calendar.SECOND); 			// ��

		int milliSecond = today.get(Calendar.MILLISECOND);	// 0 ~ 999
		// õ ���� 1�ʸ� ǥ���ϱ� ���� 3600000���� �������� (1�ð� = 60 * 60��)
		int timeZone = (today.get(Calendar.ZONE_OFFSET)/(60*60*1000)); 	// TimeZone
		int getActualMaximum = today.getActualMaximum(Calendar.DATE); 	// �� ���� ������ ���� ã�´�

		
		String[] week = new String[] {"", "�Ͽ���", "������", " ȭ����", "������", "�����", "�ݿ���", "�����"};		// string�� �迭 ��ü ����. new String[] ���� ����
		System.out.println("������ " + year + "�� " + month2 + "�� " + date + "�� " + week[DayOfWeek] + " �Դϴ�.");
		System.out.println("������ ������ " + weekOfYear + "��° ���̸�, �� ���� " + weekOfMonth + "��° ���Դϴ�");
		System.out.println("������ ������ " + DayOfYear + "�� °�̸�, �� ���� " + DayOfWeekInMonth + "��° " + week[today.get(Calendar.DAY_OF_WEEK)] + " �Դϴ�");
		String[] ap = new String[] {"����", "����"};
		System.out.println("���� �ð��� " + ap[amPm] + " " + hour + "�� " + minute + "�� " + second + "�� �Դϴ�");
	}
}
