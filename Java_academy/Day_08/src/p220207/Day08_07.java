// p.125 System.arraycopy() 메서드를 이용한 배열 복사

package p220207;

public class Day08_07 {

	public static void main(String[] args) {

		// 원본 배열
		int[] arrInt = {1, 2, 3};
		
		// 복사할 배열
		int[] arrInt2 = new int[5]; 	// int[] arrInt2 = {0, 0, 0, 0, 0}; 과 같음
		
		System.arraycopy(arrInt, 0, arrInt2, 2, arrInt.length);
		// arrInt: 원본 배열, 0: 복사할 시작 인덱스 값, arrInt2: 복사할 대상 배열, 2: 복사 위치 시작 인덱스(arrInt[2]에서 부터 복사하라는 뜻), arrInt.length: 복사할 길이 (3)
		
		// 배열 값 출력
		for (int i = 0; i < arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}

	}

}
