// 구구단

package p220127;

public class Day06_02 {

	public static void main(String[] args) {

		for( int i =1; i <= 9; i++) {
			System.out.println( i + "단");
			for ( int j = 1; j <= 9; j++) {
				System.out.println( i + "*" + j + "="  + (i * j));
			}
		}
	}
}