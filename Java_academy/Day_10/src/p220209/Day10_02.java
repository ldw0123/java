// p.145 ��ü�� �迭�� ����

package p220209;

public class Day10_02 {

	public static void main(String[] args) {
		
		// Car Ÿ���� �迭��ü ����
		Car[] cars = new Car[3];
		
		// car ��ü ����
		Car G90 = new Car();
		
		G90.color = "ȭ��Ʈ";
		G90.company = "����";
		G90.type = "����";
		
		// ��� �ε����� G90 ��ü ����
		for (int i = 0; i < cars.length; i++) {
			cars[i] = G90;
		}
		
		System.out.println("2�� �ε��� color: " + cars[2].color);
		
		cars[0].color = "��"; 		// 0�� �ε��� ��ü�� color �ʵ忡 "��" ����
		
		System.out.println("2�� �ε��� color: " + cars[2].color);

	}

}
