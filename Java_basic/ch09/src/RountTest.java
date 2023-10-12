// 문자열 -> 숫자 변환
public class RountTest {
	public static void main(String[] args) {
		int i1 = Integer.parseInt("100");
		int i2 = Integer.valueOf("100");
//		Integer i2 = Integer.valueOf("100"); 위와 같은 표현
		
		System.out.println("i1=" + i1);
		System.out.println("i2=" + i2);
		
//		int i3 = Integer.valueOf("100", 2);
		System.out.println("i3=" + Integer.valueOf("100", 2));	// 2진수
		System.out.println("i4=" + Integer.valueOf("FF", 16));	// 16진수
	}	

}
