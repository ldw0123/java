// TreeSet ����1
import java.util.*;

public class Ex11_13 {
	public static void main(String[] args) {
		Set set1 = new TreeSet(); 	// �ڵ����� ��. 	�����˻��� ���Ŀ� ����
		Set set2 = new HashSet(); 	// �ڵ����� �� ��. ���� �ʿ���

		for (int i = 0; set1.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			set1.add(num); 	// set.add(new Integer(num));
		}
		
		for (int i = 0; set2.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			set2.add(num); 	// set.add(new Integer(num));
		}

		System.out.println("Treeset : " + set1);
		System.out.println("HashSet : " + set2);
	}
}