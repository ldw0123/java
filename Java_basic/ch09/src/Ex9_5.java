// toString()�� �������̵�
class Card2 {
	String kind;
	int number;

	Card2() {
		this("SPADE", 1);	// ������ ȣ��
	}

	Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	// ObjectŬ������ equals()�������̵�
	public boolean equals(Object obj) {
		if(!(obj instanceof Card2))
			return false;

		Card2 c = (Card2)obj;
		return this.kind.equals(c.kind) && this.number==c.number;
	}

	// equals()�� �������̵� �ϸ� hashCode()�� �������̵� �ؾ� �Ѵ�
		public int hashCode() {
			return Objects.hash(kind, number));
		}

	// ObjectŬ������ toString() �������̵�
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
