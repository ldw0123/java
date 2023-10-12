// 참조변수 super

public class Ex7_2 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();		// method() 메서드 호출
	}

}

class Parent {
	int x = 10;		// super.x -> 조상의 멤버
}

class Child extends Parent {
	int x = 20; 	// this.x -> 자신의 멤버

	void method() {		// method() 메서드
		System.out.println("x = " + x);
		System.out.println("super.x = " + super.x);		// 조상의 변수 x
		System.out.println("this.x = " + this.x);		// 자신의 변수 x
	}
}
