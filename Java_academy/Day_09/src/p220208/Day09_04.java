// p.131

package p220208;

public class Day09_04 {

	public static void main(String[] args) {
		
		// �迭 ���� ����
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		
		System.out.println("arr1 == arr2: " + (arr1 == arr2)); 		// �ּҰ��� �ٸ��� ������ false

		int[] arr3 = arr1;		// arr3�� arr1�� ����
		System.out.println("arr1 == arr3: " + (arr1 == arr3));		// �ּҰ��� ���� ������ true
		
		arr3[0] = 4;		// arr3�� 0�� �ε����� 4�� �����ϸ� arr1�� 0�� �ε����� ���� 4�� �ٲ�
		System.out.println("arr3[0]: " + arr3[0]);
		System.out.println("arr1[0]: " + arr1[0]);
	}

}
