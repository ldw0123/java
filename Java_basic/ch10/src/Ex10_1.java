// Calendar Ŭ���� ����1
import java.util.*;

public class Ex10_1 {
	public static void main(String[] args) {
		// �⺻������ ���� ��¥�� �ð����� �����ȴ�
		Calendar today = Calendar.getInstance(); 	// Calendar ��ü ����
		
		System.out.println("�� ���� �⵵: "+today.get(Calendar.YEAR));
		System.out.println("��: "+today.get(Calendar.MONTH));	// 0: 1�� ~ 11: 12��
		System.out.println("�� ���� �� ° ��: "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�� ���� �� �� ��: "+today.get(Calendar.WEEK_OF_MONTH));
		// DATE�� DAY_OF_MONTH�� ����
		System.out.println("�� ���� ��ĥ: "+today.get(Calendar.DATE));
		System.out.println("�� ���� ��ĥ: "+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("�� ���� ��ĥ: "+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("����: "+today.get(Calendar.DAY_OF_WEEK)); 	// 1: �Ͽ��� ~ 7: �����
		System.out.println("�� ���� �� ° ����: "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("����_����: "+today.get(Calendar.AM_PM)); 	// 0: ����, 1: ����
		System.out.println("�ð�(12�ð���): "+today.get(Calendar.HOUR)); 	// 0 ~ 11
		System.out.println("�ð�(24�ð���): "+today.get(Calendar.HOUR_OF_DAY));	// 0 ~ 23
		System.out.println("��: "+today.get(Calendar.MINUTE)); 	// 0 ~ 59
		System.out.println("��: "+today.get(Calendar.SECOND)); 	// 0 ~ 59
		System.out.println("1000���� 1��: "+today.get(Calendar.MILLISECOND));	// 0 ~ 999
		// õ ���� 1�ʸ� ǥ���ϱ� ���� 3600000���� �������� (1�ð� = 60 * 60��)
		System.out.println("TimeZone: "+(today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
		System.out.println("�� ���� ������ ��: "+today.getActualMaximum(Calendar.DATE)); 	// �� ���� ������ ���� ã�´�
	}
}
