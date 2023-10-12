// 메서드에 예외 선언하기 예제1
public class Ex8_9 {
	public static void main(String[] args) throws Exception { 	// 예외를 메서드에 선언
		method1(); 	// 같은 클래스 내의 static멤버이므로 객체 생성 없이 직접 호출 가능
	}	// main()의 끝
	
	static void method1() throws Exception {
		method2();
	}	// method1()의 끝
	
	static void method2() throws Exception {
		throw new Exception(); 	// 예외 발생
	}	// method2()의 끝
}
