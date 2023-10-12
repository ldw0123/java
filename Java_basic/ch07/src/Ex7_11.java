// 디폴트 메서드와 static메서드
class Ex7_11 {
	public static void main(String[] args) {
		Child3 c = new Child3();	// 객체 c생성
		c.method1();				// method1() 메서드 호출
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {		// 인터페이스 2개를 다중상속받아 구현하는 Parent3 클래스를 상속받는 Child3 클래스
	public void method1() {
		System.out.println("method1() in Chile3");	// 오버라이딩
	}
}

class Parent3 {
	public void method2() {
		System.out.println("method2() in Parent3");
	}
}

interface MyInterface{	// 인터페이스
	default void method1() {		// 디폴트 메서드
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {		// 디폴트 메서드
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod() { 	// static 메서드
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {	// 인터페이스
	default void method1() {		// 디폴트 메서드
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticMethod() { 	// static 메서드
		System.out.println("staticMethod() in MyInterface2");
	}
}