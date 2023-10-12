
import java.util.Arrays;

public class Ex5_0 {

	public static void main(String[] args) {
		// int[] score; 		// 배열 score 선언 (참조변수)
		// score = new int[5]; 	// 배열 생성

		int[] score = new int[5]; 		// 배열의 선언과 생성을 동시에
		score[3] = 100;					// score[3]에 100을 저장

		System.out.println("score[0] = "+score[0]);	
		System.out.println("score[1] = "+score[1]);
		System.out.println("score[2] = "+score[2]);
		System.out.println("score[3] = "+score[3]); // 100 출력
		System.out.println("score[4] = "+score[4]);

		int value = score[3];
		System.out.println("value = "+value);
		System.out.println();

		int[] arr = new int[10]; 	// 길이가 5인 int 배열 arr 생성. index 범위: 0~9
		System.out.println("arr.length = " + arr.length);
		for(int i = 0; i < arr.length; i++)
			System.out.println("arr[" + i + "] = " + arr[i]);
		System.out.println();
		
		int[] iArr = { 100, 95, 80, 75, 60, 55 }; 		// 길이가 6인 int 배열
		System.out.println(iArr); 		// '타입@주소'의 형식으로 출력
		System.out.println("iArr.length = " + iArr.length);			// 배열 iArr의 길이를 출력
		for(int i = 0; i < iArr.length; i++)						// 배열 iArr의 모든 요소를 출력 1
			System.out.println(iArr[i]);
		System.out.println("int[] iArr = "+Arrays.toString(iArr)); 	// 배열 iArr의 모든 요소를 출력 2
		
	}

}
