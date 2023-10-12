// p.175 static멤버 (클래스 멤버)
class Calc {
	public static int abs(int a) {
		return a>0?a:-a;		// a>0이 true이면 a 반환, false이면 -a 반환
	}
	public static int max(int a, int b) {
		return (a>b)?a:b;		// a>b가 true이면 a 반환, false이면 b 반환
	}
	public static int min(int a, int b) {
		return (a>b)?b:a;		// a>b가 true이면 b 반환, false이면 a 반환
	}
}

public class CalEx {
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3, -8));
	}

}