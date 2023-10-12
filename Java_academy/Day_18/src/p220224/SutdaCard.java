package p220224;

public class SutdaCard {

	int num = 10;            //필드선언 및 초기화
	boolean isKwang;        //필드선언 

	public SutdaCard() {    //명시적 기본생성자 
		this(1, true);        //다른 명시적 생성자를 호출함 
	}

	public SutdaCard(int i, boolean isKwang) { //명시적 생성자
		this.num = i;            // 매개변수를 필드에 할당함
		this.isKwang = isKwang;    // 매개변수를 필드에 할당함
	}

	String info() {// 메소드 선언 
		if (isKwang == false) {    
			// 현재 isKwang필드의 값에 의해 두 가지 반환값을 만듦
			String result = num + "";
			return result;
		} else {
			String result = num + "K";
			return result;
		}
	}

}
