// p.127 향상된 for문

package p220207;

public class Day08_09 {

	public static void main(String[] args) {

		// 배열
		int[] arrInt = {1, 2, 3, 4, 5};
		
		// 기존 for문을 이용한 출력
		for (int i = 0; i <arrInt.length; i++) {
			System.out.print(arrInt[i]);
		}
		System.out.println();
		
		// 향상된 for문을 이용한 출력
		for(int number : arrInt) { 		// int number 변수 선언, : 뒤의 arrInt -> 반복할 배열, arrInt를 number에 대입
			System.out.print(number);
		}

	}

}
