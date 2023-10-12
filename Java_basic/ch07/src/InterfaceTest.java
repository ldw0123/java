// �������̽�
class A {
	public void method(I i) {	// �������̽� I�� ������ �͵鸸 ������� ��
		i.method();
	}
}

// BŬ������ ����� ������ �и�l
interface I {
	public void method();	// �߻� �޼��� (�����)
}

class B implements I {		// �޼����� ������
	public void method() {	// �߻� �޼���
		System.out.println("BŬ������ �޼���");
	}
}

class C implements I{
	public void method() {	// �߻� �޼���
		System.out.println("CŬ������ �޼���");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A(); 		// AŬ������ ��ü
		a.method(new B());	// A�� B�� ���(A�� B�� �����ϰ� �ִ�)
							// B b = new B();
							// a.method(b); �� ���� ǥ��
		a.method(new C());
	}

}
