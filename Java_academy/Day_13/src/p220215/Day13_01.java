package p220215;

public class Day13_01 {

	public static void main(String[] args) {

		String reStr = "";
		int num1 = 0; 		// num1 ������ ����
		// System.out.println("main �޼ҵ� c1.while: " + c1.while);
		// System.out.println("main �޼ҵ� c1.name: " + c1.name);
		Car0 c1 = new Car0(); 		// ���赵 ������ Car Ŭ������ �������� ��ü�� ����� �ִ� ���
		// �� ������ ����ϱ� ���� ��ü�� ����� �� ���� �ƴմϴ�
		// �� ���忡�� new �����ڴ� Ŭ����(���赵)�κ��� ��ü(�ǹ�)�� �����ϴ� �������Դϴ�
		// new ������ �������� ������(Car())�� �ɴϴ�
		// ��, new Car; ���� Car()�� �������Դϴ�
		c1.wheel = 4;
		c1.name = "ī�Ϲ�";
		reStr = c1.car2(4);
		System.out.println("main�޼ҵ� retStr: " + retStr);
		System.out.println("main�޼ҵ� c1.wheel: " + c1.wheel);
		System.out.println("main�޼ҵ� c1.name: " + c1.name);

	}

}
