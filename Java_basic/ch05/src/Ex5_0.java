
import java.util.Arrays;

public class Ex5_0 {

	public static void main(String[] args) {
		// int[] score; 		// �迭 score ���� (��������)
		// score = new int[5]; 	// �迭 ����

		int[] score = new int[5]; 		// �迭�� ����� ������ ���ÿ�
		score[3] = 100;					// score[3]�� 100�� ����

		System.out.println("score[0] = "+score[0]);	
		System.out.println("score[1] = "+score[1]);
		System.out.println("score[2] = "+score[2]);
		System.out.println("score[3] = "+score[3]); // 100 ���
		System.out.println("score[4] = "+score[4]);

		int value = score[3];
		System.out.println("value = "+value);
		System.out.println();

		int[] arr = new int[10]; 	// ���̰� 5�� int �迭 arr ����. index ����: 0~9
		System.out.println("arr.length = " + arr.length);
		for(int i = 0; i < arr.length; i++)
			System.out.println("arr[" + i + "] = " + arr[i]);
		System.out.println();
		
		int[] iArr = { 100, 95, 80, 75, 60, 55 }; 		// ���̰� 6�� int �迭
		System.out.println(iArr); 		// 'Ÿ��@�ּ�'�� �������� ���
		System.out.println("iArr.length = " + iArr.length);			// �迭 iArr�� ���̸� ���
		for(int i = 0; i < iArr.length; i++)						// �迭 iArr�� ��� ��Ҹ� ��� 1
			System.out.println(iArr[i]);
		System.out.println("int[] iArr = "+Arrays.toString(iArr)); 	// �迭 iArr�� ��� ��Ҹ� ��� 2
		
	}

}
