// ���������� ����ȯ
public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();				// �������� fe�� ����Ű�� ��ü water() ȣ��
		car = (Car)fe;			// �ڼ�Ÿ�� -> ����Ÿ�� ����ȯ.(Car) ���� ����
	 // car.water(); 			-> ������ ����. CarŸ���� ���������δ� water()�� ȣ���� �� ����
		fe2 = (FireEngine)car;	// ����Ÿ�� -> �ڼ�Ÿ�� ����ȯ. ���� �Ұ�
		fe2.drive();			// �������� fe2�� ����Ű�� ��ü drive() ȣ��
	}
}


class Car {
	String color;
	int door;

	void drive() {		// �����ϴ� ���
		System.out.println("drive, Brrr~");
	}

	void stop() {		// ���ߴ� ���
		System.out.println("Stop!!");
	}
}

class FireEngine extends Car {		// �ҹ���
	void water() {		// ���� �Ѹ��� ���
		System.out.println("water!!");
	}
}