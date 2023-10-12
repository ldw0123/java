// 2번 연습문제
// 숫자와 연산자를 입력하면 계산해주는 프로그램
import java.util.Scanner;

public class ex_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num1 = scanner.nextInt(); 		// 숫자 1
		System.out.println("숫자를 입력하세요");
		int num2 = scanner.nextInt();		// 숫자 2
		System.out.println("연산자(+, -, *, /)를 입력하세요");
		String sign = scanner.next();
		
		if(sign.equals("+")) {
			System.out.println("연산 : " + num1 + " + " + num2 + " = " + (num1+num2) );
		}
		else if(sign.equals("-")) {
			System.out.println("연산 : " + num1 + " - " + num2 + " = " + (num1-num2) );
		}
		else if(sign.equals("*")) {
			System.out.println("연산 : " + num1 + " * " + num2 + " = " + (num1*num2) );
		}
		else if(sign.equals("/")) {
			System.out.println("연산 : " + num1 + " / " + num2 + " = " + num1/(float)num2);
		}
		else
			System.out.println("잘못된 연산자입니다.");
	}

}
