// p.131

package p220208;

public class Day09_04 {

	public static void main(String[] args) {
		
		// 배열 변수 생성
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		
		System.out.println("arr1 == arr2: " + (arr1 == arr2)); 		// 주소값이 다르기 때문에 false

		int[] arr3 = arr1;		// arr3에 arr1을 대입
		System.out.println("arr1 == arr3: " + (arr1 == arr3));		// 주소값이 같기 때문에 true
		
		arr3[0] = 4;		// arr3의 0번 인덱스에 4를 대입하면 arr1의 0번 인덱스도 같이 4로 바뀜
		System.out.println("arr3[0]: " + arr3[0]);
		System.out.println("arr1[0]: " + arr1[0]);
	}

}
