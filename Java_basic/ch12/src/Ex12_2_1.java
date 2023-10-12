// Iterator<E>
import java.util.*;

public class Ex12_2_1 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("자바왕", 1, 1));
		list.add(new Student("자바짱", 1, 2));
		list.add(new Student("홍길동", 2, 1));
		
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
//			Student s = (Student)it.Next(); 	// 지네릭스를 사용하지 않으면 형변환 필요
			Student s = it.next();
			System.out.println(s.name);
		}
	} // main
}

class Student {
	String name = "";
	int ban; 	// 반
	int no; 	// 번호
	
	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}