// p.127 ���� for��

package p220207;

public class Day08_09 {

	public static void main(String[] args) {

		// �迭
		int[] arrInt = {1, 2, 3, 4, 5};
		
		// ���� for���� �̿��� ���
		for (int i = 0; i <arrInt.length; i++) {
			System.out.print(arrInt[i]);
		}
		System.out.println();
		
		// ���� for���� �̿��� ���
		for(int number : arrInt) { 		// int number ���� ����, : ���� arrInt -> �ݺ��� �迭, arrInt�� number�� ����
			System.out.print(number);
		}

	}

}
