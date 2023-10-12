// 5번 연습문제
// 구구단 프로그램
import java.util.Scanner;
public class ex5 {
	public static void table() {
		for(int i = 2; i < 10; i++) {		// 2~9단
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {	// 1부터 9를 곱함
				System.out.println(i + "x" + j + "=" + i*j);
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for(;;) {
			System.out.println("원하는 단을 출력하려면 1번을 입력하세요.");
			System.out.println("전체 구구단을 출력하려면 2번을 입려하세요.");
			System.out.println("프로그램을 종료하려면 3번을 입력하세요.");			
			int num = scanner.nextInt();
			if (num == 1) {
				System.out.println("몇 단을 출력할까요?");
				int x = scanner.nextInt();
				System.out.println(x + "단");
				for (int j = 1; j < 10; j++) {	// 1부터 9를 곱함
					System.out.println(x + "x" + j + "=" + x*j);
				}
				System.out.println();
			}
			else if (num == 2) {
				table();	// table 메서드 호출
			}
			else if (num == 3) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			else {
				System.out.println("잘못된 값을 입력하였습니다.");
				System.out.println();
			}
		}

	}
}

