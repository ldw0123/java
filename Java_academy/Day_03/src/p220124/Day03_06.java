// p.57

package p220124;

public class Day03_06 {

	public static void main(String[] args) {
		int a = 10;
		int b = ++a;
		
		System.out.println("전위 연산 결과: "+b);
		
		int x = 10;
		int y = x++;
		System.out.println("후위 연산 결과: "+y);
		System.out.println("x: "+x);
	}

}
