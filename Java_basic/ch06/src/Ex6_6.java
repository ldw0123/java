

class Data {
	int x;
}

public class Ex6_6 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main(): x = " + d.x);
		
		change(d.x);	// change �޼��� ȣ��
		System.out.println("After change(d.x)");
		System.out.println("main(): x = " + d.x); 		// �⺻�� �Ű������� ������ ���� ������ �� ����
	}
	
	static void change(int x) { 		// �⺻�� �Ű�����
		x = 1000; 		// x�� ��������. main �޼����� x ������ �ٸ� ����
		System.out.println("change(): x = " + x);
	}

}
