// equals()메서드
class Point3 {
	private int x, y;
	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// Point 객체가 같은지 비교할 때는 equals() 메서드를 이용
	public boolean equals (Object obj) {
		Point3 p = (Point3)obj; 		// obj를 Point 타입으로 다운캐스팅
		if(x == p.x && y == p.y)	// x는 p가 가리키는 객체 x와 같고, y는 p가 가리키는 객체 y와 같다면
			return true;
		else
			return false;
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Point3 a = new Point3(2, 3);
		Point3 b = new Point3(2, 3);	// a와 b는 같은 레퍼런스값을 가리킴
		Point3 c = new Point3(3, 4);
		Point3 d = a;	// a와 d는 같은 객체를 가리키고 레퍼런스 값이 같음
		
		if(a == b)		// == 연산자는 두 레퍼런스 값을 비교함
			System.out.println("a==b");
		if(a ==d)
			System.out.println("a==d");
		if(a.equals(b))	// equals() 메서드는 객체의 내용이 같은지 비교함
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
		if(a.equals(d))
			System.out.println("a is equal to d");
	}

}
