// ���� ������
package pkg1;

public class MyParentTest {		// public ���� ������ 	    �ٸ� Ŭ���������� ���� ����
	private	  int prv;		// private ���� ������    ���� Ŭ����
			  int dft;		// (default) ���� ������  ���� ��Ű��
	protected int prt;		// protected ���� ������  ���� ��Ű�� + �ڼ�(�ٸ� ��Ű����)
	public 	  int pub;		// public ���� ������     ���� ���� ����

	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

class MyParent {		// (default) ���� ������

	public static void main(String[] args) {
		MyParentTest p = new MyParentTest();
	 // System.out.println(p.prv);	// ����. �ٸ� Ŭ�����̱� ������ ���� ������ ���� ����
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
	}

}
