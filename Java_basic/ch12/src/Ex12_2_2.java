// HashMap<K,V>
import java.util.*;

public class Ex12_2_2 {
	public static void main(String[] args) {
		HashMap map = new HashMap(); 	// JDK1.7���� �����ڿ� Ÿ������ ���� ����
		HashMap<String, Student2> map2 = new HashMap<>();
		map2.put("�ڹٿ�", new Student2("�ڹٿ�", 1, 1, 100, 100, 100));

		//	public Student get(Object key) { 
		Student2 s = map2.get("�ڹٿ�"); 
		
		System.out.println(map2.get("�ڹٿ�").name);
	}
} // main

class Student2 {
	String name = "";
	int ban; 	// ��
	int no; 	// ��ȣ
	int kor;
	int eng;
	int math;

	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}