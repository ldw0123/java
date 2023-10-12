// "exit"이 입력되면 while문을 벗어나도록 break문을 활용하는 프로그램
import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			System.out.println(">>");
			String text = scanner.nextLine(); 	// 한 줄을 문자열로 입력받는 메서드
			if(text.equals("exit"))				// 문자열 비교 시 문자열이 같으면 equals()는 true 리턴
				break;							// "exit"이 입력되면 반복 종료
		}
		System.out.println("종료합니다...");
		
		scanner.close();
	}

}
