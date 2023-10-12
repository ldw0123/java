// toString() 메서드
class Point2 {
	private int x, y;
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// Point 객체를 문자열로 리턴하는 toString() 작성
	// 반드시 public으로 선언해야 함
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
}

public class ToStringEx {

	public static void main(String[] args) {
		Point2 a = new Point2(2, 3);
		System.out.println(a.toString());	// .toString() 생략 가능
		System.out.println(a);				// a.toString() 과 a 는 같음
	}
}
