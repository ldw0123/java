// Iterator<E>
import java.util.*;

public class Ex12_2_1 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("�ڹٿ�", 1, 1));
		list.add(new Student("�ڹ�¯", 1, 2));
		list.add(new Student("ȫ�浿", 2, 1));
		
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
//			Student s = (Student)it.Next(); 	// ���׸����� ������� ������ ����ȯ �ʿ�
			Student s = it.next();
			System.out.println(s.name);
		}
	} // main
}

class Student {
	String name = "";
	int ban; 	// ��
	int no; 	// ��ȣ
	
	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}