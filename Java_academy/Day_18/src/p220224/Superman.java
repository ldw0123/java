package p220224;

public class Superman extends Human {
	
	@Override
	public void walk() {
		System.out.println("�ü� 50km�� �ȱ�");
	}
	
	@Override
	public final void run() { 
		// �θ� Ŭ���� �޼ҵ��� run�� final�� �����Ǿ���
		// �� ����̳״� �������̵� �� ��
		System.out.println("�ü� 200km�� �ٱ�");
	}
	
}
