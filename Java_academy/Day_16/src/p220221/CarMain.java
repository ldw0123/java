package p220221;

public class CarMain {

	public static void main(String[] args) {
		
		SportsCar c1 = new SportsCar();
		
		c1.name = "�ҳ�Ÿ";
		c1.wheel = 4;
		c1.color ="����";
		
		System.out.println("name : " + c1.name);
		System.out.println("������ : " + c1.wheel);
		System.out.println("�������� : " + c1.color);
		
		c1.name = "�׷���";
		c1.wheel = 4;
		c1.color ="������";
		
		System.out.println("name : " + c1.name);
		System.out.println("������ : " + c1.wheel);
		System.out.println("�������� : " + c1.color);
		      
		//��ݾ��� �޼ҵ�ȣ��
		System.out.println("��ݾ��� �޼ҵ�ȣ��");
		c1.testCar();

	}
}