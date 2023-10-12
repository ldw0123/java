package p220224;

public class Day18_01 {

	public static void main(String[] args) {

		SutdaCard card1 = new SutdaCard(3, false);
		//명시적 생성자를 이용하여 객체 생성
		SutdaCard card2 = new SutdaCard();
		//명시적 기본 생성자를 이용하여 객체 생성
		System.out.println(card1.info());
		// card1참조변수가 가리키는 객체의 맴버메소드를 호출함
		System.out.println(card2.info());
		// card2참조변수가 가리키는 객체의 맴버메소드를 호출함

	}

}
