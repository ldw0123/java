// p.126 Arrays.copyOf() �޼��带 �̿��� �迭 ����

package p220207;

import java.util.Arrays;

public class Day08_08 {

	public static void main(String[] args) {

		// ���� �迭
		int[] arrInt = {1, 2, 3};
		
		// ������ �迭
		int[] arrInt2 = null;
		
		arrInt2 = Arrays.copyOf(arrInt, 5);		/// arrInt �迭�� 5�� ���̷� arrInt2�� ����
		
		// �迭 �� ���
		for (int i = 0; i <arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
	}

}
