// p.141

package p220209;

public class Day10_01 {

	public static void main(String[] args) {
		
		Member m = new Member();  // new: 객체 생성 연산자(인스턴스)
		Member m2 = new Member(); // 타입이 Member (사용자가 독자적으로 만든 변수 타입)
		
		if (m == m2) {
			System.out.println("m개체와 m2객체는 같다.");
		} else {
			System.out.println("m개체와 m2객체는 같지 않다."); 	// m, m2는 같은 자료형이지만 저장된 주소값이 다름
		}
		
	}

}
