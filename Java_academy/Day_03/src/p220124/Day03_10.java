//p.61

package p220124;

public class Day03_10 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		// AND ����
		System.out.println(a > b && a == 10); 		// true
		System.out.println(a > b && a == b);		// false
		System.out.println();
		
		// OR ����
		System.out.println(a > b || a == b);		// true
		System.out.println(a < b || a == b);		// false
		System.out.println();
		
		// XOR ����
		System.out.println(a > b ^ a == 10);		// false
		System.out.println(a < b ^ a == b);			// true
		System.out.println();
		
		// NOT ����
		System.out.println(!(a > b));				// false
		System.out.println(!(a < b));				// true
	}

}
