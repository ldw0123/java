// 1�� ��������
// ���� �µ��� �Է��Ͽ� ������ ����ϴ� ���α׷�
import java.util.Scanner;

public class ex_1 {

	public static void main(String[] args) {
		System.out.println("���� �Է��ϼ���");

		Scanner scanner = new Scanner(System.in);
		int mon = scanner.nextInt(); 		// ���ڿ� ��ū �б�
		System.out.println("�µ��� �Է��ϼ���");
		int tem = scanner.nextInt();

		if(mon >= 3 && mon <= 5 && tem >= 3 && tem <= 15)
			System.out.println("���Դϴ�.");
		else if(mon >= 6 && mon <= 8 && tem >= 18 && tem <= 37)
			System.out.println("�����Դϴ�.");
		else if(mon >= 9 && mon <= 11 && tem >= 3 && tem <= 15)
			System.out.println("�����Դϴ�.");
		else if((mon >= 1 && mon <= 2 || mon == 12) && (tem >= -15 && tem <2))
			System.out.println("�ܿ��Դϴ�.");
		else													// �µ��� ���� ���� ������
			System.out.println("������ �µ��� ���� �ʽ��ϴ�.");

		scanner.close();
	}

}
