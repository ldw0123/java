// p.208

package p220218;

public class PolyEx2 {

	public static void main(String[] args) {
		
		Parent p = new Child();
		
		p.run();
		
		// �ڽ�Ŭ������ �ڷ������� ��ȯ (��������ȯ)
		Child c = (Child)p;
		c.eat();
	}

}
