package p220221;

public class Car {
	//�ʵ�
	public int speed;
	String name;
	int wheel;
	//��ݾ��¸޼ҵ�
	public void testCar() {
		System.out.println("name : " + this.name);
		System.out.println("wheel : " + this.wheel);
	}
	//�޼ҵ�-�ǽ�1-�ش���� 
	public void speedUp() { 		// �������̵� ����
		speed += 1;
	}        
	//final �޼ҵ�-�ǽ�1-�ش���� 
	public final void stop() { 		// final �޼���: �������̵� �Ұ�
		System.out.println("���� ����");
		speed = 0;
	}
}