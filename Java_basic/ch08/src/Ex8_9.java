// �޼��忡 ���� �����ϱ� ����1
public class Ex8_9 {
	public static void main(String[] args) throws Exception { 	// ���ܸ� �޼��忡 ����
		method1(); 	// ���� Ŭ���� ���� static����̹Ƿ� ��ü ���� ���� ���� ȣ�� ����
	}	// main()�� ��
	
	static void method1() throws Exception {
		method2();
	}	// method1()�� ��
	
	static void method2() throws Exception {
		throw new Exception(); 	// ���� �߻�
	}	// method2()�� ��
}
