// p.102

package p220203;

public class Day07_05 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i ++) {
			if (i == 5) {
				continue; 		// i == 5일 때 해당 반복문만 중지
			}
			System.out.println(i);
		}
	}

}
