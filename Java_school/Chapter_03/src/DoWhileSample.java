
public class DoWhileSample {

	public static void main(String[] args) {
		char a = 'a';
		
		do {
			System.out.println(a); 	// 문자 출력
			a = (char)(a+1); 		// 알파벳의 경우 1을 더하면 다음 문자 코드 값
									// 강제 형 변환
		} while ( a <= 'z');
	}

}
