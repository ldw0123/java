// p.132

package p220208;

import java.util.Arrays;

public class Day09_05 {

	public static void main(String[] args) {
		
		// �迭 ���� ����
		int[] arr1 = {1, 2, 3};
		int[] arr2 = Arrays.copyOf(arr1, 3); 		// arr2�� arr1�� �����ؼ� ������
		
		arr2[0] = 4;		// arr2[0]�� 4�� ���������� arr1[0]�� �״�� 1��
		System.out.println("arr1[0]: " + arr1[0]);
		System.out.println("arr2[0]: " + arr2[0]);
	}

}
