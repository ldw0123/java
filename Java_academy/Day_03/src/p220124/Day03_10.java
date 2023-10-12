//p.61

package p220124;

public class Day03_10 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		// AND 연산
		System.out.println(a > b && a == 10); 		// true
		System.out.println(a > b && a == b);		// false
		System.out.println();
		
		// OR 연산
		System.out.println(a > b || a == b);		// true
		System.out.println(a < b || a == b);		// false
		System.out.println();
		
		// XOR 연산
		System.out.println(a > b ^ a == 10);		// false
		System.out.println(a < b ^ a == b);			// true
		System.out.println();
		
		// NOT 연산
		System.out.println(!(a > b));				// false
		System.out.println(!(a < b));				// true
	}

}
