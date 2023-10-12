// toString() �޼���
class Point2 {
	private int x, y;
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// Point ��ü�� ���ڿ��� �����ϴ� toString() �ۼ�
	// �ݵ�� public���� �����ؾ� ��
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
}

public class ToStringEx {

	public static void main(String[] args) {
		Point2 a = new Point2(2, 3);
		System.out.println(a.toString());	// .toString() ���� ����
		System.out.println(a);				// a.toString() �� a �� ����
	}
}
