// 5�� ��������
// ������ ���α׷�
import java.util.Scanner;
public class ex5 {
	public static void table() {
		for(int i = 2; i < 10; i++) {		// 2~9��
			System.out.println(i + "��");
			for (int j = 1; j < 10; j++) {	// 1���� 9�� ����
				System.out.println(i + "x" + j + "=" + i*j);
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for(;;) {
			System.out.println("���ϴ� ���� ����Ϸ��� 1���� �Է��ϼ���.");
			System.out.println("��ü �������� ����Ϸ��� 2���� �Է��ϼ���.");
			System.out.println("���α׷��� �����Ϸ��� 3���� �Է��ϼ���.");			
			int num = scanner.nextInt();
			if (num == 1) {
				System.out.println("�� ���� ����ұ��?");
				int x = scanner.nextInt();
				System.out.println(x + "��");
				for (int j = 1; j < 10; j++) {	// 1���� 9�� ����
					System.out.println(x + "x" + j + "=" + x*j);
				}
				System.out.println();
			}
			else if (num == 2) {
				table();	// table �޼��� ȣ��
			}
			else if (num == 3) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
			else {
				System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
				System.out.println();
			}
		}

	}
}

