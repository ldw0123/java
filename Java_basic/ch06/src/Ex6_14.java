// 멤버변수의 초기화

public class Ex6_14 {

	static {
		System.out.println("static { }");	// 클래스 초기화 블럭
	}
	
	{
		System.out.println("{ }");			// 인스턴스 초기화 블럭
	}
	
	public Ex6_14() {
		System.out.println("생성자");			// 생성자를 이용한 초기화
	}
	
	public static void main(String[] args) {
		System.out.println("Ex6_14 bt = new Ex6_14();");
		Ex6_14 bt = new Ex6_14();			// 참조형 변수의 명시적 초기화

		System.out.println("Ex6_14 bt2 = new Ex6_14();");
		Ex6_14 bt2 = new Ex6_14();
	}


}
