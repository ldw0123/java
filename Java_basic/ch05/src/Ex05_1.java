
import java.util.Arrays;

public class Ex05_1 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		// int[] iArr3 = new int[] {100, 95, 80, 70, 60};  ->  new int[] ���� ����
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] iArr4 = {'a', 'b', 'c', 'd'};
		
		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1; 		// 1~10�� ���ڸ� ������� �迭 iArr1�� ����
		}
		
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10 + 1); 		// 1~10�� ��������  �迭�� ����
		}
		
		// �迭�� ����� ���� ���
		for (int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		System.out.println();
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2)); 		// �迭 ��� �޼��� ���
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(iArr4));
		System.out.println();
		
		System.out.println(iArr3);
		System.out.println(iArr4);
	}

}
