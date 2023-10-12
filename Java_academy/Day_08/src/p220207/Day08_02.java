// p.114 �ζ� ��ȣ ���� �޼���

package p220207;

public class Day08_02 {

	public static void main(String[] args) {

		int[] lotto = new int [6];
		int idx = 0; 		// �ε��� ���� ���� ����

		while (true) {
			int number = (int)(Math.random()*45)+1; 	// 1~45�� ���� ����

			boolean insert = true; 		// �ߺ��� ��ȣ�� false�� ������ �ζ� ������ �߰����� �ʵ��� �ϱ� ���� ����

			for (int i = 0; i <= idx; i++) {
				if (lotto[i] == number) { 		// ��ȣ�� �ߺ��ȴٸ�
					insert = false; 			// insert�� false�� �ٲٰ�
					break;						// �ݺ��� ����
				}
			}

			if (insert == true) {
				lotto[idx] = number;
				idx++;
			}

			if (idx == 6) break; 	// idx�� ���� 6�� �Ǹ� �ݺ��� ����. 6�� �Ƿ��� �ߺ� ���� 0~5������ �ε����� ���� �������� ä�����ٴ� �ǹ�
		}

		for (int i =0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
}
