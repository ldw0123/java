

class Data {
	int x;
}

public class Ex6_6 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main(): x = " + d.x);
		
		change(d.x);	// change 메서드 호출
		System.out.println("After change(d.x)");
		System.out.println("main(): x = " + d.x); 		// 기본형 매개변수는 변수의 값을 변경할 수 없다
	}
	
	static void change(int x) { 		// 기본형 매개변수
		x = 1000; 		// x는 지역변수. main 메서드의 x 변수와 다른 변수
		System.out.println("change(): x = " + x);
	}

}
