// p.125 System.arraycopy() �޼��带 �̿��� �迭 ����

package p220207;

public class Day08_07 {

	public static void main(String[] args) {

		// ���� �迭
		int[] arrInt = {1, 2, 3};
		
		// ������ �迭
		int[] arrInt2 = new int[5]; 	// int[] arrInt2 = {0, 0, 0, 0, 0}; �� ����
		
		System.arraycopy(arrInt, 0, arrInt2, 2, arrInt.length);
		// arrInt: ���� �迭, 0: ������ ���� �ε��� ��, arrInt2: ������ ��� �迭, 2: ���� ��ġ ���� �ε���(arrInt[2]���� ���� �����϶�� ��), arrInt.length: ������ ���� (3)
		
		// �迭 �� ���
		for (int i = 0; i < arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}

	}

}
