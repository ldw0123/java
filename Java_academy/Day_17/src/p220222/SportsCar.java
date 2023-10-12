package p220222;

public class SportsCar extends Car_1 {
	
	int select;
	String name;
	
	public void run() {
		if (select == 1) {
			System.out.println("스포츠카가 출발합니다.");
		} else {
			super.run(); 	// 부모 객체의 run()메서드 호출
		}
	}
	
}
