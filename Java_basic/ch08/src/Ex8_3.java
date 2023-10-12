// 예외의 발생과 catch블럭
public class Ex8_3 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); 	// 예외 발생!
			System.out.println(4); 		// 실행x
		} catch (Exception e) {
			System.out.println(5);
		} // try-catch의 끝
		System.out.println(6);
	}	// main메서드의 끝
}
