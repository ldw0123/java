
import java.util.Arrays;

public class Ex05_1 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		// int[] iArr3 = new int[] {100, 95, 80, 70, 60};  ->  new int[] 생략 가능
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] iArr4 = {'a', 'b', 'c', 'd'};
		
		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1; 		// 1~10의 숫자를 순서대로 배열 iArr1에 넣음
		}
		
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10 + 1); 		// 1~10의 난수값을  배열에 저장
		}
		
		// 배열에 저장된 값을 출력
		for (int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		System.out.println();
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2)); 		// 배열 출력 메서드 사용
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(iArr4));
		System.out.println();
		
		System.out.println(iArr3);
		System.out.println(iArr4);
	}

}
