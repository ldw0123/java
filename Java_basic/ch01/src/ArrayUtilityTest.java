// 정적 메서드 구현
class ArrayUtility {
	static double[] intToDouble(int[] source) { 	     // int 배열을 double 배열로 변환
		double resource[] = new double[source.length];	 // double형 배열 생성
		for (int i = 0; i < source.length; i++) {
			resource[i] = (double) source[i];		 // 배열 요소를 double형으로 형변환 
		}
		return resource;							 // 배열 resource 반환
	}
	static int[] doubleToInt(double[] source) {		// double 배열을 int 배열로 변환
		int resource[] = new int[source.length];	// int형 배열 생성
		for (int i = 0; i < source.length; i++) {
			resource[i] = (int) source[i];
		}
		return resource;
	}
	static int[] concat(int[] a1, int[] a2) {		// a1과 a2를 연결한 배열 반환
		int[] resource = new int[a1.length+a2.length];		// 두 배열을 합한 새로운 배열 resource
		System.arraycopy(a1, 0, resource, 0, a1.length);	// 배열 a1을 배열 resource에 복사
		System.arraycopy(a2, 0, resource, a1.length, a2.length);	// 배열 a2을 배열 resource에 복사
		return resource;
	}
	static int[] remove(int[] arr, int i) {			// arr 배열에서 인덱스 i번째 숫자를 삭제한 배열 반환

	}
	
	

}

public class ArrayUtilityTest {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };		// int형 배열 생성
		double b[] = { 1.2, 2.3, 3.4, 4.5 }; // double형 배열 생성
		
		int c[] = new int[b.length]; // 길이가 num_double.length인 int형 배열 생성
		double d[] = new double[a.length]; // 길이가 num_int.length인 double형 배열 생성

		c = ArrayUtility.doubleToInt(b); // double형을 int형으로 형변환
									 	 // ArrayUtility 클래스의 douleToInt(num_double)메서드 호출하여 c로 반환
		d = ArrayUtility.intToDouble(a); // int형을 double형으로 형변환
										 // ArrayUtility 클래스의 intToDouble(num_int)메서드 호출하여 d로 반환
		
		// int형 배열과 double형으로 변환한 배열 출력
		for (int i = 0; i < a.length; i++)		// int형 배열 a 출력
			System.out.print(a[i] + " ");
		System.out.println();	
		for (int i = 0; i < a.length; i++)		// 배열 a를 double형으로 변환한 배열 d 출력
			System.out.print(d[i] + " ");

		System.out.println();
		System.out.println();

		// double형 배열과 int형으로 변환한 배열 출력
		for (int i = 0; i < b.length; i++)		// double형 배열 b 출력
			System.out.print(b[i] + " ");
		System.out.println();
		for (int i = 0; i < b.length; i++)		// 배열 b를 int형으로 변환한 배열 c 출력
			System.out.print(c[i] + " ");
		System.out.println();
		System.out.println();
		
		// 두 배열을 연결
		int[] e = {1, 2, 3};
		int[] f = {4, 5, 6};
		int arrlength = e.length + f.length; 	// 두 배열의 총 길이
		int[] g = new int[arrlength]; 			// 두 배열을 합한 새로운 배열
		g = ArrayUtility.concat(e, f);			// 두 배열을 합해서 g로 반환
		for(int i = 0; i < g.length; i++)
			System.out.print(g[i] + " ");
		
	}

}
