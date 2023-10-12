// p.126 Arrays.copyOf() 메서드를 이용한 배열 복사

package p220207;

import java.util.Arrays;

public class Day08_08 {

	public static void main(String[] args) {

		// 원본 배열
		int[] arrInt = {1, 2, 3};
		
		// 복사할 배열
		int[] arrInt2 = null;
		
		arrInt2 = Arrays.copyOf(arrInt, 5);		/// arrInt 배열을 5개 길이로 arrInt2에 대입
		
		// 배열 값 출력
		for (int i = 0; i <arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
	}

}
