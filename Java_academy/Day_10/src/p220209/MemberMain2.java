// p.142

package p220209;

public class MemberMain2 {

	public static void main(String[] args) {

		MemberMain2 m = new MemberMain2(); 		// MemberMain2Ŭ������ main() �޼��忡�� �ڽ��� ��ü�� ����
		MemberMain2 m2 = new MemberMain2();

		if (m == m2) {
			System.out.println("MemberMain2 Ŭ������ m��ü�� m2��ü�� ����.");
		} else {
			System.out.println("MemberMain2 Ŭ������ m��ü�� m2��ü�� ���� �ʴ�.");
		}
		//
		//
		Member mm = new Member(); 		// �ܺ��� Member Ŭ������ �̿��ؼ� ���� ��ü (�Ϲ������� ����)
		Member mm2 = new Member();
		if (mm == mm2) {
			System.out.println("Member Ŭ������ mm��ü�� mm2��ü�� ����.");
		} else {
			System.out.println("Member Ŭ������ mm��ü�� mm2��ü�� ���� �ʴ�.");
		}
		//
		//
		String st1 = "abcdefghij"; 		// String ���� st1 ����
		System.out.println("st1.substring(3)--->" + st1.substring(3)); 		// substring() �޼���: st1 ������ 3��° �ε��� ���� ���
		System.out.println("st1.substring(3,6)--->" + st1.substring(3,6)); 	// st1 ������ 3������ 6�� ��������(3~5��)�� �ε��� ���
	}

}
