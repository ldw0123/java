package p220222;

public class SportsCar extends Car_1 {
	
	int select;
	String name;
	
	public void run() {
		if (select == 1) {
			System.out.println("������ī�� ����մϴ�.");
		} else {
			super.run(); 	// �θ� ��ü�� run()�޼��� ȣ��
		}
	}
	
}
