// p.161

package p220210;

public class Day11_07 {

	public static void main(String[] args) {

		System.out.println(divide(pow(add(3, 3))));

	}
	
	static int add(int x, int y) {
		return x + y;
	}
	
	static int pow(int x) {
		return x * x;
	}
	
	static int divide(int x) {
		return x / 2;
	}
}
