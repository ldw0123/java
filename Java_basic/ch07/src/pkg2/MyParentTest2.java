package pkg2;

import pkg1.MyParentTest; 	// �ٸ� ��Ű���� Ŭ������ ���

public class MyParentTest2 {

	class MyChild extends MyParentTest {
		public void printMembers() {
		 // System.out.println(prv);	// ����. �ٸ� Ŭ�����̱� ������ ����
         // System.out.println(dft);	// ����. �ٸ� Ŭ�����̱� ������ ����
			System.out.println(prt);	// ok. �ٸ� ��Ű���� �ڼ��̱� ������ ����
			System.out.println(pub);
		}
	}

	public static void main(String[] args) {
		MyParentTest p = new MyParentTest();
     // System.out.println(p.prv);	// ����. �ٸ� Ŭ�����̱� ������ ����
     // System.out.println(p.dft);	// ����.	�ٸ� Ŭ�����̱� ������ ����
     // System.out.println(p.prt);  // ����.	�ٸ� ��Ű���� �ٸ� Ŭ�����̱� ������ ����
		System.out.println(p.pub);
	}

}
