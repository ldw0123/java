// 3�� ��������
// �� ������ ������ �Է¹޾� ����� ����ϴ� ���α׷�
import java.util.Scanner;

public class ex_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("���� ������ ������ �Է��ϼ���");
		int kor = scanner.nextInt();
		System.out.println("���� ������ ������ �Է��ϼ���");
		int eng = scanner.nextInt();
		System.out.println("���� ������ ������ �Է��ϼ���");
		int math = scanner.nextInt();

		double avg = (double)(kor+eng+math)/3;

		if((kor>=0 && kor<=100) && (eng>=0 && eng <=100) && (math>=0 && math<=100)) {
			System.out.println(String.format("������ ����� %.1f�Դϴ�.", avg)); // String.format(): �ݿø� �ؼ� �Ҽ����� ����ϴ� �޼���
			if(avg >= 95)
				System.out.println("����� ������ A+�Դϴ�.");
			else if(avg <95 && avg >=90)
				System.out.println("����� ������ A�Դϴ�.");
			else if(avg <90 && avg >=85)
				System.out.println("����� ������ B+�Դϴ�.");
			else if(avg <85 && avg >=80)
				System.out.println("����� ������ B�Դϴ�.");
			else if(avg <80 && avg >=75)
				System.out.println("����� ������ C+�Դϴ�.");
			else if(avg <75 && avg >=70)
				System.out.println("����� ������ C�Դϴ�.");
			else if(avg <70 && avg >=60)
				System.out.println("����� ������ D�Դϴ�.");
			else if(avg <60)
				System.out.println("����� ������ F�Դϴ�.");
		}
		else
			System.out.println("������ �߸� �Է��Ͽ����ϴ�.");
	}

}