// ��Ӱ� ����

class Point extends Object{		// Object Ŭ����: ��� Ŭ������ ����
	int x;		// 2���� ��ǥ�� �� ��
	int y;
}

//class Circle extends Point {	// ���
//	int r;
//}

class Circle {		// ����
	Point p = new Point(); 		// ���������� �ʱ�ȭ
	int r;
}


public class InheritaceTest {

	public static void main(String[] args) { 	// ������ �̿��ϱ�
		Circle c = new Circle();
		c.p.x = 1;		// c.p.x -> c�� ����Ű�� ��ü p�� ����Ű�� x�� 1. c�� p�� ����Ű��, p�� x�� ����Ŵ
		c.p.y = 2;		// c.p.y -> c�� ����Ű�� ��ü p�� ����Ű�� y�� 2
		c.r = 3;
		System.out.println("c.p.x = " + c.p.x); 		
		System.out.println("c.p.y = " + c.p.y);
		System.out.println("c.r = " + c.r);
		
		System.out.println(c.toString());	// "Circle@1ff8b8f"
		
		Circle c2 = new Circle();
		System.out.println(c2.toString());	// "Circle@387c703b" ��ü���� �ּҰ��� �ٸ��� ����
		
		Circle c3 = new Circle();
		System.out.println(c3);				// "Circle@224aed64" .toString() ���� ����. ����� ����
	}
}
