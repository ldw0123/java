// p.207

package p220218;

public class PolyEx {

	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.run();
		
		// �θ�Ŭ������ �ڷ������� ���� (�ڵ�����ȯ)
		Parent p = new Child();
		p.run();	// �����ǵ� �޼��尡 ����
		// p.eat(); -> ����
	}

}
