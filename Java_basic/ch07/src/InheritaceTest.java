// 상속과 포함

class Point extends Object{		// Object 클래스: 모든 클래스의 조상
	int x;		// 2차원 좌표의 한 점
	int y;
}

//class Circle extends Point {	// 상속
//	int r;
//}

class Circle {		// 포함
	Point p = new Point(); 		// 참조변수의 초기화
	int r;
}


public class InheritaceTest {

	public static void main(String[] args) { 	// 포함을 이용하기
		Circle c = new Circle();
		c.p.x = 1;		// c.p.x -> c가 가리키는 객체 p가 가리키는 x는 1. c는 p를 가리키고, p는 x를 가리킴
		c.p.y = 2;		// c.p.y -> c가 가리키는 객체 p가 가리키는 y는 2
		c.r = 3;
		System.out.println("c.p.x = " + c.p.x); 		
		System.out.println("c.p.y = " + c.p.y);
		System.out.println("c.r = " + c.r);
		
		System.out.println(c.toString());	// "Circle@1ff8b8f"
		
		Circle c2 = new Circle();
		System.out.println(c2.toString());	// "Circle@387c703b" 객체마다 주소값이 다르게 나옴
		
		Circle c3 = new Circle();
		System.out.println(c3);				// "Circle@224aed64" .toString() 생략 가능. 결과가 같음
	}
}
