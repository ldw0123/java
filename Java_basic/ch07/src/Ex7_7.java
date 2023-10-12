// 참조변수의 형변환
public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();				// 참조변수 fe가 가리키는 객체 water() 호출
		car = (Car)fe;			// 자손타입 -> 조상타입 형변환.(Car) 생략 가능
	 // car.water(); 			-> 컴파일 에러. Car타입의 참조변수로는 water()를 호출할 수 없다
		fe2 = (FireEngine)car;	// 조상타입 -> 자손타입 형변환. 생략 불가
		fe2.drive();			// 참조변수 fe2가 가리키는 객체 drive() 호출
	}
}


class Car {
	String color;
	int door;

	void drive() {		// 운전하는 기능
		System.out.println("drive, Brrr~");
	}

	void stop() {		// 멈추는 기능
		System.out.println("Stop!!");
	}
}

class FireEngine extends Car {		// 소방차
	void water() {		// 물을 뿌리는 기능
		System.out.println("water!!");
	}
}