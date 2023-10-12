// 3번 연습문제
// 세 과목의 점수를 입력받아 평균을 출력하는 프로그램
import java.util.Scanner;

public class ex_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("국어 과목의 점수를 입력하세요");
		int kor = scanner.nextInt();
		System.out.println("영어 과목의 점수를 입력하세요");
		int eng = scanner.nextInt();
		System.out.println("수학 과목의 점수를 입력하세요");
		int math = scanner.nextInt();

		double avg = (double)(kor+eng+math)/3;

		if((kor>=0 && kor<=100) && (eng>=0 && eng <=100) && (math>=0 && math<=100)) {
			System.out.println(String.format("학점의 평균은 %.1f입니다.", avg)); // String.format(): 반올림 해서 소수점을 출력하는 메서드
			if(avg >= 95)
				System.out.println("당신의 학점은 A+입니다.");
			else if(avg <95 && avg >=90)
				System.out.println("당신의 학점은 A입니다.");
			else if(avg <90 && avg >=85)
				System.out.println("당신의 학점은 B+입니다.");
			else if(avg <85 && avg >=80)
				System.out.println("당신의 학점은 B입니다.");
			else if(avg <80 && avg >=75)
				System.out.println("당신의 학점은 C+입니다.");
			else if(avg <75 && avg >=70)
				System.out.println("당신의 학점은 C입니다.");
			else if(avg <70 && avg >=60)
				System.out.println("당신의 학점은 D입니다.");
			else if(avg <60)
				System.out.println("당신의 학점은 F입니다.");
		}
		else
			System.out.println("점수를 잘못 입력하였습니다.");
	}

}