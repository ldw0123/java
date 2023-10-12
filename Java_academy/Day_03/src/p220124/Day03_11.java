// p.63

package p220124;
public class Day03_11 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println(a == b & test()); 	// & 연산

		System.out.println(a == b && test());	// && 연산: 왼쪽 항이 거짓이라면 오른쪽 항은 확인도 안 함
	}
	
	public static boolean test() {
		System.out.println("test()메서드 실행됨");
		return true; 		// true 값 반환
	}

}
