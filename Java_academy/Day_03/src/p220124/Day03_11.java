// p.63

package p220124;
public class Day03_11 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println(a == b & test()); 	// & ����

		System.out.println(a == b && test());	// && ����: ���� ���� �����̶�� ������ ���� Ȯ�ε� �� ��
	}
	
	public static boolean test() {
		System.out.println("test()�޼��� �����");
		return true; 		// true �� ��ȯ
	}

}
