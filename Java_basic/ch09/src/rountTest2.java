// ����ڽ� & ��ڽ�
import java.util.ArrayList; 	// ctrl+shift+o �ڵ� import�� �߰�

public class rountTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); 	// JDK1.5 �������� ����. ����� ����. �����Ϸ��� �ڵ����� 100�� new Integer(100)���� �ٲ���(����ڽ�)
//		list.add(new Integer(100));		// Integer��ü�� �������. list���� ��ü�� �߰� ����
		System.out.println(list);
		
		Integer i = list.get(0); 		// list�� ����� ù��° ��ü�� ����. �����Ϸ��� �ڵ����� intValue()�� �߰�����(��ڽ�)
//		int i = list.get(0);			// ���� ����
//		int i = list.get(0).intValue();	// intValue()�� Integer�� int�� ��ȯ. 
		System.out.println(i);
	}
}
