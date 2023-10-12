// super()를 이용하여 ColorPoint 클래스의 생성자에서 슈퍼 클래스 Point의 생성자를 호출하는 예제
class Point {
	private int x, y; 	// 한 점을 구성하는 x, y 좌표
	public Point() {
		this.x = this.y = 0;
	}
	public Point (int x, int y) {	// Point 생성자
		this.x = x;
		this.y = y;
	}
	public void showPoint() { 	// 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point { 	// Point를 상속받은 ColorPoint 선언
	private String color; 	// 점의 색
	public ColorPoint(int x, int y, String color) {
		super(x, y); 	// Point의 생성자 Point(x, y) 호출.
						// super()의 호출은 생성자의 첫 줄에 와야한다
		this.color = color;
	}
	public void showColorPoint() { 	// 컬러 점의 좌표 출력
		System.out.println(color);
		showPoint(); 	// Point 클래스의 showPoint()	호출
	}
}

public class SuperEx {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();

	}

}
