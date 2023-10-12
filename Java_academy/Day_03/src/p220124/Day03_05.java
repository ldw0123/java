// p.47 강제 형변환 예시

package p220124;

public class Day03_05 {
	
	public static void main(String[] args) {
		
		double pi = 3.14; 		// double 자료형
		int pi2 = (int)pi;		// 형변환 연산자
		
		System.out.println(pi2);	// 소수점 이하의 손실 발생
	}

}