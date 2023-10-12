// equals()�޼���
class Point3 {
	private int x, y;
	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// Point ��ü�� ������ ���� ���� equals() �޼��带 �̿�
	public boolean equals (Object obj) {
		Point3 p = (Point3)obj; 		// obj�� Point Ÿ������ �ٿ�ĳ����
		if(x == p.x && y == p.y)	// x�� p�� ����Ű�� ��ü x�� ����, y�� p�� ����Ű�� ��ü y�� ���ٸ�
			return true;
		else
			return false;
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Point3 a = new Point3(2, 3);
		Point3 b = new Point3(2, 3);	// a�� b�� ���� ���۷������� ����Ŵ
		Point3 c = new Point3(3, 4);
		Point3 d = a;	// a�� d�� ���� ��ü�� ����Ű�� ���۷��� ���� ����
		
		if(a == b)		// == �����ڴ� �� ���۷��� ���� ����
			System.out.println("a==b");
		if(a ==d)
			System.out.println("a==d");
		if(a.equals(b))	// equals() �޼���� ��ü�� ������ ������ ����
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
		if(a.equals(d))
			System.out.println("a is equal to d");
	}

}
