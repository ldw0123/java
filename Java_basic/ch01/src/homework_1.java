// �л��� ������ �Է��Ͽ� ����ϴ� ���α׷�

import java.util.Scanner;
public class homework_1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// �л� �⺻ ����
		System.out.println("����� �л��Դϱ�? ������ true / �ƴϸ� false");
		boolean stu = scanner.nextBoolean(); 	// ����
		System.out.println("����� �л����δ�" + stu + "�Դϴ�.");
		System.out.println("����� ������ �Է��ϼ���");
		char grade = scanner.next().charAt(0); 	// ������
		System.out.println("����� ������ " + grade + "�Դϴ�.");

		// �迭����
		// �迭�� ���̸� 3���� ����
		String[] names = new String[3]; // String��
		int[] numbers = new int[3];		// int��

		int size = names.length; 		// int size = 3
		try {							// try-catch ���
			for (int i = 0; i <= 3; i++) {		// �迭�� ���̴� 3���� �ε����� 0~2 ���� ������ �ε��� 3�� �����͸� �ְ��� �� �� ���� �߻�
				// ���ڿ� �Է�
				System.out.println("�л��� �̸��� �Է��ϼ���");
				names[i] = scanner.next();

				// ������ �Է�
				System.out.println("���(1~3)�� �Է��ϼ���");
				numbers[i] = scanner.nextInt();
			}
		} catch (ArrayIndexOutOfBoundsException e) {	// ��ü e�� ���� ������ �Ѿ��
			System.out.println("ArrayIndexOutOfBoundsException �߻�"); 	
			System.out.println("�迭�� ������ �ʰ��Ͽ� ���Ҹ� �����Ͽ����ϴ�.");
		} finally { 
			System.out.println("����ó�� �ڵ尡 �������� ����Ǿ����ϴ�.");
		}

		int i = 0;
		while (i < size) {
			if (numbers[i] == 1)
				System.out.println(names[i] + "(��)�� 1���Դϴ�!");	// �̸��� ����� ���
			else if (numbers[i] == 2)
				System.out.println(names[i] + "(��)�� 2���Դϴ�.");
			switch (numbers[i]) {
			case 3 :
				System.out.println(names[i] + "(��)�� 3���Դϴ�.");
				break;
			case 4 :
				continue;		// 4���� �������� �����Ƿ� number[i]�� 4�̸� �Ѿ
			}
			i++;
		}
	}
}