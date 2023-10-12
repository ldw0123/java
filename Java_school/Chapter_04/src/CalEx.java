// p.175 static��� (Ŭ���� ���)
class Calc {
	public static int abs(int a) {
		return a>0?a:-a;		// a>0�� true�̸� a ��ȯ, false�̸� -a ��ȯ
	}
	public static int max(int a, int b) {
		return (a>b)?a:b;		// a>b�� true�̸� a ��ȯ, false�̸� b ��ȯ
	}
	public static int min(int a, int b) {
		return (a>b)?b:a;		// a>b�� true�̸� b ��ȯ, false�̸� a ��ȯ
	}
}

public class CalEx {
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3, -8));
	}

}