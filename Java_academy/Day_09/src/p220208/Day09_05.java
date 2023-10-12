// p.132

package p220208;

import java.util.Arrays;

public class Day09_05 {

	public static void main(String[] args) {
		
		// 배열 변수 생셩
		int[] arr1 = {1, 2, 3};
		int[] arr2 = Arrays.copyOf(arr1, 3); 		// arr2에 arr1을 복사해서 대입함
		
		arr2[0] = 4;		// arr2[0]에 4를 대입하지만 arr1[0]은 그대로 1임
		System.out.println("arr1[0]: " + arr1[0]);
		System.out.println("arr2[0]: " + arr2[0]);
	}

}
