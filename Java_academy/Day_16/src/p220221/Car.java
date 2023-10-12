package p220221;

public class Car {
	//필드
	public int speed;
	String name;
	int wheel;
	//뜬금없는메소드
	public void testCar() {
		System.out.println("name : " + this.name);
		System.out.println("wheel : " + this.wheel);
	}
	//메소드-실습1-해당없음 
	public void speedUp() { 		// 오버라이드 가능
		speed += 1;
	}        
	//final 메소드-실습1-해당없음 
	public final void stop() { 		// final 메서드: 오버라이드 불가
		System.out.println("차를 멈춤");
		speed = 0;
	}
}