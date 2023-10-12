package p220224;

public class Superman extends Human {
	
	@Override
	public void walk() {
		System.out.println("시속 50km로 걷기");
	}
	
	@Override
	public final void run() { 
		// 부모 클래스 메소드인 run이 final로 지정되었음
		// 이 경우이네는 오버라이드 못 함
		System.out.println("시속 200km로 뛰기");
	}
	
}
