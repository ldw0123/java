// p.141

package p220209;

public class Day10_01 {

	public static void main(String[] args) {
		
		Member m = new Member();  // new: ��ü ���� ������(�ν��Ͻ�)
		Member m2 = new Member(); // Ÿ���� Member (����ڰ� ���������� ���� ���� Ÿ��)
		
		if (m == m2) {
			System.out.println("m��ü�� m2��ü�� ����.");
		} else {
			System.out.println("m��ü�� m2��ü�� ���� �ʴ�."); 	// m, m2�� ���� �ڷ��������� ����� �ּҰ��� �ٸ�
		}
		
	}

}
