// p.97 중첩 반복문

package p220203;

public class Day07_01 {

	public static void main(String[] args) {
		
		for(int j = 2; j < 10; j++) { 		// 2 ~ 9  반복
			for(int i =1; i < 10; i++) { 	// 1 ~ 9 반복. 총 72회 반복
				System.out.println("j = "+j+", i = "+i);
			}
		}

	}

}
