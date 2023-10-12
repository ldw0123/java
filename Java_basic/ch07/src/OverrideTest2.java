// 메서드 오버라이딩

class Point3 extends Object{
	int x;
	int y;
	
	Point3(int x, int y) {		// 매개변수가 있는 생성자
		this.x = x;
		this.y = y;
	}
	
	// Object클래스의 toString()을 오버라이딩
	public String toString() {
		return "x: " + x + ", y: " + y;
	}
}

public class OverrideTest2 {

	public static void main(String[] args) {
		Point3 p = new Point3(3, 5);	// 생성자 호출
		System.out.println(p.toString());
		System.out.println(p);			// .toString() 생략가능
		
//		Point3 p = new Point3();
//		p.x = 3;
//		p.y = 5;
//		System.out.println("p.x = " + p.x);
//		System.out.println("p.y = " + p.y);
	}

}
