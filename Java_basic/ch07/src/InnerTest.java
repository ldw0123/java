// ���� Ŭ����
class AAA {			// AAA�� BBB�� �ܺ� Ŭ����
	int i = 100;
	BBB b = new BBB();
	
	class BBB {		// BBB�� AAA�� ���� Ŭ����
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);
			System.out.println(i);	// ��ü ���� ���� �ܺ� Ŭ������ ��� ���� ����
		}
	}
}

//class CCC {
//	BBB b = new BBB();
//}	

public class InnerTest {

	public static void main(String[] args) {
//		BBB b = new BBB();
//		b.method();
		AAA a = new AAA();
		a.b.method();
	}

}
