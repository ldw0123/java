package p220215;

public class Car0 { 		// 이것은 클래스 선언입니다
	// 클래스는 멤버를 가집니다
	// 멤버의 종류는 필드, 생성자, 메서드 3가지가 존재합니다
	// 아래 코드에는 생성자는 없고 필드와 메서드만 존재하는 상태입니다
	int wheel; 		// 이것은 필드입니다. 인스턴스 변수라고도 합니다.
	String name;	// 이것은 필드입니다. 인스턴스 변수라고도 합니다.
	String car2(int c2_num) { 		// 이것은 메서드입니다
		System.out.println("car2의 메서드 c2_num");
		if(c2_num >= 6) {
			return "전용차로 가능";
		} else {
			return "전용차로 금지";
		}
	}

}
