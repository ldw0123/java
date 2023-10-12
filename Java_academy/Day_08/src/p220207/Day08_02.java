// p.114 로또 번호 생성 메서드

package p220207;

public class Day08_02 {

	public static void main(String[] args) {

		int[] lotto = new int [6];
		int idx = 0; 		// 인덱스 값을 담을 변수

		while (true) {
			int number = (int)(Math.random()*45)+1; 	// 1~45의 수를 저장

			boolean insert = true; 		// 중복된 번호면 false로 변경해 로또 변수에 추가되지 않도록 하기 위한 변수

			for (int i = 0; i <= idx; i++) {
				if (lotto[i] == number) { 		// 번호가 중복된다면
					insert = false; 			// insert를 false로 바꾸고
					break;						// 반복문 중지
				}
			}

			if (insert == true) {
				lotto[idx] = number;
				idx++;
			}

			if (idx == 6) break; 	// idx의 값이 6이 되면 반복문 중지. 6이 되려면 중복 없이 0~5까지의 인덱스의 값에 랜덤수가 채워졌다는 의미
		}

		for (int i =0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
}
