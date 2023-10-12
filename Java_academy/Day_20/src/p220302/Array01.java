// 3명의 점수를 입력받아서 총점을 구하는 프로그램의 일부 주석문 아래쪽 를 완성하시오

package p220302;

import java.io.IOException;

public class Array01 {
	
	public static void main(String[] args) throws IOException {
		// num 점수를 기억할 배열 변수 선언
		int num1 = System.in.read() - '0';
		int num2 = System.in.read() - '0';
		int num3 = System.in.read() - '0';
		
		int sum = num1+num2+num3;
		
		System.out.println("총점: " + sum);
		// ( ) 점수입력 콘솔창으로 입력
		}
	
}
