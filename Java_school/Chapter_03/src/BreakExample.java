// "exit"�� �ԷµǸ� while���� ������� break���� Ȱ���ϴ� ���α׷�
import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		while(true) {
			System.out.println(">>");
			String text = scanner.nextLine(); 	// �� ���� ���ڿ��� �Է¹޴� �޼���
			if(text.equals("exit"))				// ���ڿ� �� �� ���ڿ��� ������ equals()�� true ����
				break;							// "exit"�� �ԷµǸ� �ݺ� ����
		}
		System.out.println("�����մϴ�...");
		
		scanner.close();
	}

}
