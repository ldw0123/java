// p.172 ������ �����ε�

package p220210;

public class Student {
	
	// �ʵ�
	String name; 		// �л���
	int grade; 			// �г�
	String department;	// �а�
	
	// 1�� ������
	Student() {
		
	}
	
	// 2�� ������ 
	Student(String n) {
		name = n;
	}
	
	// 3�� ������
	Student(String n, int g) {
		name = n;
		grade = g;
	}
	
	// 4�� ������ (�ùٸ� ���)
	Student(String n, int g, String d) {
		name = n;
		grade = g;
		department = d;
	}
	
	/*
	�а��� �г��� �Ű������� �޴� ������ (���� �߻�)
	Student(String d, int g) {
		department = d;
		grade = g;
	}
	*/
	
}
