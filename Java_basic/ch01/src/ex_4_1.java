// 4-1번 연습문제
// 난수 추출
import java.util.Random;
public class ex_4_1 {

	public static void main(String[] args) {
		Random random = new Random(); 		// 랜덤 객체 생성
		for(int i = 0; i < 10; i++) {		// 10번 반복
			int num1 = random.nextInt(26); 	// 0~25까지 int형 난수 생성
			System.out.print((char)('A'+num1));	// 문자열A와 난수를 더해 문자로 변환
		}
		System.out.println(" ");
		
		for(int i = 0; i < 3; i++) {
		int num2 = random.nextInt(10);	 	// 0~10까지 난수 생성
		System.out.print((char)(num2+65)); 	// 숫자를 문자로 변환
		}
	}

} 


