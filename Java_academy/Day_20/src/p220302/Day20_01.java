package p220302;

public class Day20_01 {

	public static void Odd() {
		int sum1 = 0;

		for (int i = 0; i <= 10; i++) {
			if(i % 2 != 0) {
				sum1 = sum1 + i;
			}
		}
		System.out.println("1���� 10���� Ȧ���� ����" + sum1 + "�Դϴ�.");
	}

	public static void Even() {
		int sum2 = 0;

		for (int i = 0; i <= 10; i++) {
			if(i % 2 == 0) {
				sum2 = sum2 + i;
			}
		}
		System.out.println("1���� 10���� ¦���� ����" + sum2 + "�Դϴ�.");
	}

	public static void main(String[] args) {
		Odd();
		Even();
	}
}