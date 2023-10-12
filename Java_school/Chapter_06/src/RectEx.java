// int Ÿ���� �ʵ带 ������ RectŬ������ �ۼ��ϰ�, ������ ������ �� Rect ��ü�� ���� ������ �Ǻ��ϴ� equals() Ŭ����
class Rect {
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Object obj) { 	// �簢�� ���� ��
		Rect p = (Rect)obj; 	// obj�� Rect�� �ٿ�ĳ����
		if (width*height == p.width*p.height) 
			return true;
		else
			return false;
	}
}
public class RectEx {
	public static void main(String[] args) {
		Rect a = new Rect(2, 3); 	// ���� 6
		Rect b = new Rect(3, 2); 	// ���� 6
		Rect c = new Rect(3, 4); 	// ���� 12
		if(a.equals(b))		// a�� b�� ��ü�� ������ ������
			System.out.println("a is equal to b");	// a�� b�� ������ �����Ƿ�, equals()�� ���ٰ� �Ǵ�
		if(a.equals(c))
			System.out.println("a is equal to c");
		if(b.equals(c))		// b�� c�� ��ü�� ������ ������
			System.out.println("b is equal to c");
	}

}
