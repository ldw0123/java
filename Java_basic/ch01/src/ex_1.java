// 1번 연습문제
// 월과 온도를 입력하여 계절을 출력하는 프로그램
import java.util.Scanner;

public class ex_1 {

	public static void main(String[] args) {
		System.out.println("월을 입력하세요");

		Scanner scanner = new Scanner(System.in);
		int mon = scanner.nextInt(); 		// 문자열 토큰 읽기
		System.out.println("온도를 입력하세요");
		int tem = scanner.nextInt();

		if(mon >= 3 && mon <= 5 && tem >= 3 && tem <= 15)
			System.out.println("봄입니다.");
		else if(mon >= 6 && mon <= 8 && tem >= 18 && tem <= 37)
			System.out.println("여름입니다.");
		else if(mon >= 9 && mon <= 11 && tem >= 3 && tem <= 15)
			System.out.println("가을입니다.");
		else if((mon >= 1 && mon <= 2 || mon == 12) && (tem >= -15 && tem <2))
			System.out.println("겨울입니다.");
		else													// 온도와 월이 맞지 않으면
			System.out.println("계절과 온도가 맞지 않습니다.");

		scanner.close();
	}

}
