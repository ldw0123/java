// ���� �޼��� ����
class ArrayUtility {
	static double[] intToDouble(int[] source) { 	     // int �迭�� double �迭�� ��ȯ
		double resource[] = new double[source.length];	 // double�� �迭 ����
		for (int i = 0; i < source.length; i++) {
			resource[i] = (double) source[i];		 // �迭 ��Ҹ� double������ ����ȯ 
		}
		return resource;							 // �迭 resource ��ȯ
	}
	static int[] doubleToInt(double[] source) {		// double �迭�� int �迭�� ��ȯ
		int resource[] = new int[source.length];	// int�� �迭 ����
		for (int i = 0; i < source.length; i++) {
			resource[i] = (int) source[i];
		}
		return resource;
	}
	static int[] concat(int[] a1, int[] a2) {		// a1�� a2�� ������ �迭 ��ȯ
		int[] resource = new int[a1.length+a2.length];		// �� �迭�� ���� ���ο� �迭 resource
		System.arraycopy(a1, 0, resource, 0, a1.length);	// �迭 a1�� �迭 resource�� ����
		System.arraycopy(a2, 0, resource, a1.length, a2.length);	// �迭 a2�� �迭 resource�� ����
		return resource;
	}
	static int[] remove(int[] arr, int i) {			// arr �迭���� �ε��� i��° ���ڸ� ������ �迭 ��ȯ

	}
	
	

}

public class ArrayUtilityTest {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };		// int�� �迭 ����
		double b[] = { 1.2, 2.3, 3.4, 4.5 }; // double�� �迭 ����
		
		int c[] = new int[b.length]; // ���̰� num_double.length�� int�� �迭 ����
		double d[] = new double[a.length]; // ���̰� num_int.length�� double�� �迭 ����

		c = ArrayUtility.doubleToInt(b); // double���� int������ ����ȯ
									 	 // ArrayUtility Ŭ������ douleToInt(num_double)�޼��� ȣ���Ͽ� c�� ��ȯ
		d = ArrayUtility.intToDouble(a); // int���� double������ ����ȯ
										 // ArrayUtility Ŭ������ intToDouble(num_int)�޼��� ȣ���Ͽ� d�� ��ȯ
		
		// int�� �迭�� double������ ��ȯ�� �迭 ���
		for (int i = 0; i < a.length; i++)		// int�� �迭 a ���
			System.out.print(a[i] + " ");
		System.out.println();	
		for (int i = 0; i < a.length; i++)		// �迭 a�� double������ ��ȯ�� �迭 d ���
			System.out.print(d[i] + " ");

		System.out.println();
		System.out.println();

		// double�� �迭�� int������ ��ȯ�� �迭 ���
		for (int i = 0; i < b.length; i++)		// double�� �迭 b ���
			System.out.print(b[i] + " ");
		System.out.println();
		for (int i = 0; i < b.length; i++)		// �迭 b�� int������ ��ȯ�� �迭 c ���
			System.out.print(c[i] + " ");
		System.out.println();
		System.out.println();
		
		// �� �迭�� ����
		int[] e = {1, 2, 3};
		int[] f = {4, 5, 6};
		int arrlength = e.length + f.length; 	// �� �迭�� �� ����
		int[] g = new int[arrlength]; 			// �� �迭�� ���� ���ο� �迭
		g = ArrayUtility.concat(e, f);			// �� �迭�� ���ؼ� g�� ��ȯ
		for(int i = 0; i < g.length; i++)
			System.out.print(g[i] + " ");
		
	}

}
