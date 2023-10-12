// 인터페이스
class A {
	public void method(I i) {	// 인터페이스 I를 구현한 것들만 들어오라는 뜻
		i.method();
	}
}

// B클래스의 선언과 구현을 분리l
interface I {
	public void method();	// 추상 메서드 (선언부)
}

class B implements I {		// 메서드의 구현부
	public void method() {	// 추상 메서드
		System.out.println("B클래스의 메서드");
	}
}

class C implements I{
	public void method() {	// 추상 메서드
		System.out.println("C클래스의 메서드");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A(); 		// A클래스의 객체
		a.method(new B());	// A가 B를 사용(A가 B에 의존하고 있다)
							// B b = new B();
							// a.method(b); 와 같은 표현
		a.method(new C());
	}

}
