// ���������� ����ȯ
public class Ex7_7_1 {

	public static void main(String[] args) {
		Car2 c = new Car2();	// Car2�ν��Ͻ����� water()�� ����
		FireEngine2 fe = (FireEngine2)c;	// ����ȯ ���� Error. java.lang.ClassCastException
		fe.water();		// ������ ok. �����ϸ� Error. ��ü Car2���� ���� water()�� ȣ���߱� ����
	}
}


class Car2 {
	String color;
	int door;

	void drive() {		// �����ϴ� ���
		System.out.println("drive, Brrr~");
	}

	void stop() {		// ���ߴ� ���
		System.out.println("Stop!!");
	}
}

class FireEngine2 extends Car2 {		// �ҹ���
	void water() {		// ���� �Ѹ��� ���
		System.out.println("water!!");
	}
}