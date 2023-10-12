// ArrayList
import java.util.*;

public class Ex11_1 {
	public static void main(String[] args) {
		// �⺻ ����(�뷮, capacity)�� 10�� ArrayList�� ����
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(4);	// list1.add(new Integer(4)); �� ����
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		// ArrayList(Collection c) ������
		ArrayList list2 = new ArrayList(list1.subList(1,4)); 	// sublist(): 1~3�� �ε����� �о ��ȯ
		print(list1, list2);
		
		// Collection�� �������̽�, Collections�� ��ƿŬ����
		Collections.sort(list1);	// list1�� list2�� �����Ѵ�
		Collections.sort(list2);	// Collections.sort(List 1)
		print(list1, list2);
		
		// list1�� list2�� ��� ��Ҹ� �����ϴ°�?
		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); 	// �ε����� 3�� ���� "A"�� �߰�. "B"�� "C"�� �ڷ� �ڸ� �̵�
		print(list1, list2);
		
		list2.set(3, "AA"); // �ε����� 3�� ���� "AA"�� ����
		print(list1, list2);
		
		// list1���� list2�� ��ġ�� �κи� ����� �������� �����Ѵ�
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
		print(list1, list2);
		
		// list2���� list1�� ���Ե� ��ü���� �����Ѵ�
		for(int i = list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))	// get(): ������ �ε����� ��ü �б�, contains(): ������ ��ü�� ���ԵǾ� ������ true
				list2.remove(i); 	// �ε����� i�� ���� ����� ��Ҹ� ����
		}
		print(list1, list2);
		
		list1.add(0, "1"); 	// 0�� �ε����� ���ڿ� 1 �߰�
		list1.add(2, 1); 	// 3�� �ε����� ���� 1 �߰�
		//indexOf()�� ������ ��ü�� ��ġ(�ε���)�� �˷��ش�
		System.out.println("\"1\"�� index = " + list1.indexOf("1"));
		System.out.println("1�� index = " + list1.indexOf(1));
		print(list1, list2);
		
		list1.remove(1); 	// �ε����� 1�� ��ü�� ����
		print(list1, list2);
		
		list1.remove(new Integer(1));	// 1�� ����
		print(list1, list2);
	}	// main

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	}	
} // class
