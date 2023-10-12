// 상속

class Tv {
	boolean power; 		// 전원상태 (on/off)
	int channel;		// 채널
	void power() 		{ 	power = !power; }
	void channelUp()	{	++channel;		}
	void channelDown()  { 	--channel;		}
}

// 부모 클래스 Tv의 멤버를 자식 클래스 SmartTv에 상속
class SmartTv extends Tv {	// SmartTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption; 		// 캡션상태 (on/off)
	void displayCaption(String text) {
		if (caption) {		// 캡션 상택 on(true)일 때만 text를 보여 준다.
			System.out.println(text);
		}
	}
}

public class Ex7_1 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;				// 조상 클래스로부터 상속받은 멤버
		stv.channelUp();				// 조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);		// 채널 출력
		stv.displayCaption("Hello, World"); 	// 캡션이 true가 아니기 때문에 출력되지 않음
		stv.caption = true;						// 캡션(자막)기능을 켠다.
		stv.displayCaption("Hello, World");		// 캡션이 출력됨
	}

}
