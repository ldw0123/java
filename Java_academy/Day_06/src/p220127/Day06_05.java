// 3*3 ������ 3

package p220127;

public class Day06_05 {
	public class Day07_01 {
		public static void main(String[] args) {
			// 06����-�ǽ�-2-�ش� 3 * 3 ������ 
			for (int m = 0; m < 3; m++) {    // m ������ 0,1,2 �� ��ȯ��
				System.out.println((3 * m + 1) + "��\t\t" + (3 * m + 2) + "��\t\t" + (3 * m + 3) + "��\t\t");
				//
				for (int n = 1; n <= 9; n++) {    // n ������ 1,2,3,4,5,6,7,8,9 �� ��ȯ��
					System.out.println(
							(3 * m + 1) + " * " + n + " = " + (3 * m + 1) * n + "\t" + 
							(3 * m + 2) + " * " + n + " = " + (3 * m + 2) * n + "\t" + 
							(3 * m + 3) + " * " + n + " = " + (3 * m + 3) * n + "\t");
					//        (3 * m + 1) 1                     (3 * m + 1) 1  
					//        (3 * m + 2) 2                     (3 * m + 2) 2  
					//        (3 * m + 3) 3                     (3 * m + 3) 3  
				}
				System.out.println();// �� ���� ����� �� �ٹٲ�
			}
		}
	}
}
