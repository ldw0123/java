// �޼��� �������̵�

class Point3 extends Object{
	int x;
	int y;
	
	Point3(int x, int y) {		// �Ű������� �ִ� ������
		this.x = x;
		this.y = y;
	}
	
	// ObjectŬ������ toString()�� �������̵�
	public String toString() {
		return "x: " + x + ", y: " + y;
	}
}

public class OverrideTest2 {

	public static void main(String[] args) {
		Point3 p = new Point3(3, 5);	// ������ ȣ��
		System.out.println(p.toString());
		System.out.println(p);			// .toString() ��������
		
//		Point3 p = new Point3();
//		p.x = 3;
//		p.y = 5;
//		System.out.println("p.x = " + p.x);
//		System.out.println("p.y = " + p.y);
	}

}
