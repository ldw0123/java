// 2�� ��������
// ���ڿ� �����ڸ� �Է��ϸ� ������ִ� ���α׷�
import java.util.Scanner;

public class ex_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		int num1 = scanner.nextInt(); 		// ���� 1
		System.out.println("���ڸ� �Է��ϼ���");
		int num2 = scanner.nextInt();		// ���� 2
		System.out.println("������(+, -, *, /)�� �Է��ϼ���");
		String sign = scanner.next();
		
		if(sign.equals("+")) {
			System.out.println("���� : " + num1 + " + " + num2 + " = " + (num1+num2) );
		}
		else if(sign.equals("-")) {
			System.out.println("���� : " + num1 + " - " + num2 + " = " + (num1-num2) );
		}
		else if(sign.equals("*")) {
			System.out.println("���� : " + num1 + " * " + num2 + " = " + (num1*num2) );
		}
		else if(sign.equals("/")) {
			System.out.println("���� : " + num1 + " / " + num2 + " = " + num1/(float)num2);
		}
		else
			System.out.println("�߸��� �������Դϴ�.");
	}

}
