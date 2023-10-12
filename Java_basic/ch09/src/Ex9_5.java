// toString()의 오버라이딩
class Card2 {
	String kind;
	int number;

	Card2() {
		this("SPADE", 1);	// 생성자 호출
	}

	Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	// Object클래스의 equals()오버라이딩
	public boolean equals(Object obj) {
		if(!(obj instanceof Card2))
			return false;

		Card2 c = (Card2)obj;
		return this.kind.equals(c.kind) && this.number==c.number;
	}

	// equals()를 오버라이딩 하면 hashCode()도 오버라이딩 해야 한다
		public int hashCode() {
			return Objects.hash(kind, number));
		}

	// Object클래스의 toString() 오버라이딩
	public String toString() {		
		return "kind: " + kind + ", number: " + number;
	}
}

public class Ex9_5 {
	public static void main(String[] args) {
		Card2 c1 = new Card2();
		Card2 c2 = new Card2();

		System.out.println(c1.equals(c2));

		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
