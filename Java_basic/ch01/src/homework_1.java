// 학생의 정보를 입력하여 출력하는 프로그램

import java.util.Scanner;
public class homework_1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 학생 기본 정보
		System.out.println("당신은 학생입니까? 맞으면 true / 아니면 false");
		boolean stu = scanner.nextBoolean(); 	// 논리형
		System.out.println("당신의 학생여부는" + stu + "입니다.");
		System.out.println("당신의 학점을 입력하세요");
		char grade = scanner.next().charAt(0); 	// 문자형
		System.out.println("당신의 학점은 " + grade + "입니다.");

		// 배열생성
		// 배열의 길이를 3으로 설정
		String[] names = new String[3]; // String형
		int[] numbers = new int[3];		// int형

		int size = names.length; 		// int size = 3
		try {							// try-catch 블록
			for (int i = 0; i <= 3; i++) {		// 배열의 길이는 3으로 인덱스는 0~2 까지 이지만 인덱스 3에 데이터를 넣고자 할 때 오류 발생
				// 문자열 입력
				System.out.println("학생의 이름을 입력하세요");
				names[i] = scanner.next();

				// 정수형 입력
				System.out.println("등수(1~3)를 입력하세요");
				numbers[i] = scanner.nextInt();
			}
		} catch (ArrayIndexOutOfBoundsException e) {	// 객체 e에 예외 정보가 넘어옴
			System.out.println("ArrayIndexOutOfBoundsException 발생"); 	
			System.out.println("배열의 범위를 초과하여 원소를 접근하였습니다.");
		} finally { 
			System.out.println("예외처리 코드가 오류없이 진행되었습니다.");
		}

		int i = 0;
		while (i < size) {
			if (numbers[i] == 1)
				System.out.println(names[i] + "(은)는 1등입니다!");	// 이름과 등수를 출력
			else if (numbers[i] == 2)
				System.out.println(names[i] + "(은)는 2등입니다.");
			switch (numbers[i]) {
			case 3 :
				System.out.println(names[i] + "(은)는 3등입니다.");
				break;
			case 4 :
				continue;		// 4등은 적절하지 않으므로 number[i]가 4이면 넘어감
			}
			i++;
		}
	}
}