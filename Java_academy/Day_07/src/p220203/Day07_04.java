// p.101

package p220203;

public class Day07_04 {

	public static void main(String[] args) {

		target:for (int i=0; i<5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j ==3) {
					break target; 		// target: 탈출할 범위를 지정
				}
				System.out.println("i = "+i+", j ="+j);
			}
		}
	}

}
