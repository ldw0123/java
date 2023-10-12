package p220215;

public class Day13_01 {

	public static void main(String[] args) {

		String reStr = "";
		int num1 = 0; 		// num1 정수형 변수
		// System.out.println("main 메소드 c1.while: " + c1.while);
		// System.out.println("main 메소드 c1.name: " + c1.name);
		Car0 c1 = new Car0(); 		// 설계도 개념인 Car 클래스를 실질적인 객체로 만들어 주는 명령
		// 이 문장을 사용하기 전에 객체가 만들어 진 것은 아닙니다
		// 이 문장에서 new 연산자는 클래스(설계도)로부터 객체(실물)을 생성하는 연산자입니다
		// new 연산자 다음에는 생성자(Car())가 옵니다
		// 즉, new Car; 에서 Car()은 생성자입니다
		c1.wheel = 4;
		c1.name = "카니발";
		reStr = c1.car2(4);
		System.out.println("main메소드 retStr: " + retStr);
		System.out.println("main메소드 c1.wheel: " + c1.wheel);
		System.out.println("main메소드 c1.name: " + c1.name);

	}

}
