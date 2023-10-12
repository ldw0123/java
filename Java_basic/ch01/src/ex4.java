// 4번 연습문제
// 랜덤으로 0~25사이의 난수를 받아 문자 A에 더하기 연산을 해서 A~Z까지 출력하는 프로그램
import java.util.Random;
public class ex4 {

	public static void main(String[] args) {
		Random r = new Random(); 		// 난수 객체 생성
		int num = r.nextInt(26);		// 0~25의 난수 생성
		System.out.println("난수값은 " + num + "입니다.");
		System.out.println(num + " + 5 = " + (char)('A'+num));	// 문자열 A와 난수를 더해 문자로 변환 후 A~Z까지의 알파벳을 출력
		
	}

}
