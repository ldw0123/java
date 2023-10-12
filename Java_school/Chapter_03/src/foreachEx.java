// for-each 문을 활용하여 int[] 배열의 합을 구하고, String[] 배열의 문자열을 출력하는 프로그램

public class foreachEx {

	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5};
		int sum = 0;
		for (int k : n) { 	// k는 n[0], n[1], ..., n[4]로 반복
			System.out.print(k + " ");	// 반복되는 k값 출력
			sum += k;
		}
		System.out.println( );
		System.out.println("합은" + sum);
		System.out.println( );
		
		String f[] = { "사과", "배", "바나나", "체리", "딸기", "포도" };
		for(String s : f) 	// s는 f[0], f[1], ... , f[5]로 반복
			System.out.print(s + " ");
	}

}
