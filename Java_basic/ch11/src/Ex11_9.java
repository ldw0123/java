// HashSet ����1
import java.util.*;

public class Ex11_9 {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4"};
		Set set = new HashSet();

		for(int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]); 	// HashSet�� objArr�� ��ҵ��� �����Ѵ�
		}
		// HashSet�� ����� ��ҵ��� ����Ѵ�
		System.out.println(set);

		// HashSet�� ����� ��ҵ��� ����Ѵ� (Iterator �̿�)
		Iterator it = set.iterator(); 	// iterator()�޼���� iterator�� ����

		while(it.hasNext()) { 	// �о� �� ��Ұ� �����ִ��� Ȯ��
			System.out.println(it.next()); 	// ��� �ϳ� ��������
		}
	}
}