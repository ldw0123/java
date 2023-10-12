// �� ���� �����ڸ� ���� Circle1 Ŭ����
public class Circle1 {
	int radius;
	String name;
	
	// ������ �̸��� Ŭ���� �̸��� ����. �����ڴ� ���� Ÿ�� ����
	public Circle1() {	// �Ű����� ���� ������
		radius = 1;		// radius�� �ʱⰪ�� 1
		name = " ";
	}
	
	
	public Circle1(int r, String n) {	// �Ű������� ���� ������
		radius = r;		// �����ڴ� radius�� name �ʵ� �ʱ�ȭ�� ��
		name = n;		
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle1 pizza = new Circle1(10, "�ڹ�����"); 	// Circle1 ��ü ����, ������ 10
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area); 
		
		Circle1 donut = new Circle1(); 	// Circle ��ü ����, ������ 1
		donut.name = "��������";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}

}
