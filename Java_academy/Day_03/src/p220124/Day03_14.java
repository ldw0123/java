// p.70 문자열 연산

package p220124;

public class Day03_14 {

	public static void main(String[] args) {
		String name = "홍길동";
		System.out.println("안녕하세요 " + name + "입니다.");
		
		int height = 180;
		System.out.println("저의 키는 " + height + "입니다.");
		
 		String weight = 75.5 + ""; 		// String weight = 75.5; -> 에러 발생 (문자열형 변수에는 숫자를 대입 못함)
		System.out.println("제 몸무게는 " + weight + "kg입니다.");
		
		int ageInt = 30;
		String ageStr = "30"; 		// 문자열
	}

}
