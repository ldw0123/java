
public class DoWhileSample {

	public static void main(String[] args) {
		char a = 'a';
		
		do {
			System.out.println(a); 	// ���� ���
			a = (char)(a+1); 		// ���ĺ��� ��� 1�� ���ϸ� ���� ���� �ڵ� ��
									// ���� �� ��ȯ
		} while ( a <= 'z');
	}

}
