// p.72

package p220124;

public class Day03_15 {

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		int c = 3;
		
		System.out.println(a + b * c); 		// * 연산이 먼저 실행됨
		
		System.out.println((a + b) * c);	// 괄호로 묶어 우선순위를 높임
	}

}
