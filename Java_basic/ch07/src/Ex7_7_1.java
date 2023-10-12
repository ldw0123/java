// 참조변수의 형변환
public class Ex7_7_1 {

	public static void main(String[] args) {
		Car2 c = new Car2();	// Car2인스턴스에는 water()가 없음
		FireEngine2 fe = (FireEngine2)c;	// 형변환 실행 Error. java.lang.ClassCastException
		fe.water();		// 컴파일 ok. 실행하면 Error. 객체 Car2에는 없는 water()를 호출했기 때문
	}
}


class Car2 {
	String color;
	int door;

	void drive() {		// 운전하는 기능
		System.out.println("drive, Brrr~");
	}

	void stop() {		// 멈추는 기능
		System.out.println("Stop!!");
	}
}

class FireEngine2 extends Car2 {		// 소방차
	void water() {		// 물을 뿌리는 기능
		System.out.println("water!!");
	}
}