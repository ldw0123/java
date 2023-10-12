
public class Ex6_3 {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card(); 	// 객체 생성
		c1.kind = "Heart"; 		// 객체 사용
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + " " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")입니다." );
		System.out.println("c2는 " + c2.kind + " " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")입니다." );
		System.out.println("c1과 c2의 width와 height를 각각 50, 80으로 변경합니다.");
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")입니다." );
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")입니다." );
	}

}

class Card { 	
	String kind;				// 인스턴스 변수 선언
	int number;
	static int width = 100;		// 클래스 변수 선언
	static int height = 250;
}
