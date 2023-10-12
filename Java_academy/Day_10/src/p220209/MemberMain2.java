// p.142

package p220209;

public class MemberMain2 {

	public static void main(String[] args) {

		MemberMain2 m = new MemberMain2(); 		// MemberMain2클래스의 main() 메서드에서 자신의 객체를 생성
		MemberMain2 m2 = new MemberMain2();

		if (m == m2) {
			System.out.println("MemberMain2 클래스의 m개체와 m2객체는 같다.");
		} else {
			System.out.println("MemberMain2 클래스의 m개체와 m2객체는 같지 않다.");
		}
		//
		//
		Member mm = new Member(); 		// 외부의 Member 클래스를 이용해서 만든 객체 (일반적으로 사용됨)
		Member mm2 = new Member();
		if (mm == mm2) {
			System.out.println("Member 클래스의 mm개체와 mm2객체는 같다.");
		} else {
			System.out.println("Member 클래스의 mm개체와 mm2객체는 같지 않다.");
		}
		//
		//
		String st1 = "abcdefghij"; 		// String 변수 st1 선언
		System.out.println("st1.substring(3)--->" + st1.substring(3)); 		// substring() 메서드: st1 변수의 3번째 인덱스 부터 출력
		System.out.println("st1.substring(3,6)--->" + st1.substring(3,6)); 	// st1 변수의 3번부터 6번 직전까지(3~5번)의 인덱스 출력
	}

}
