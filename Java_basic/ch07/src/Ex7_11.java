// ����Ʈ �޼���� static�޼���
class Ex7_11 {
	public static void main(String[] args) {
		Child3 c = new Child3();	// ��ü c����
		c.method1();				// method1() �޼��� ȣ��
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {		// �������̽� 2���� ���߻�ӹ޾� �����ϴ� Parent3 Ŭ������ ��ӹ޴� Child3 Ŭ����
	public void method1() {
		System.out.println("method1() in Chile3");	// �������̵�
	}
}

class Parent3 {
	public void method2() {
		System.out.println("method2() in Parent3");
	}
}

interface MyInterface{	// �������̽�
	default void method1() {		// ����Ʈ �޼���
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {		// ����Ʈ �޼���
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod() { 	// static �޼���
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {	// �������̽�
	default void method1() {		// ����Ʈ �޼���
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticMethod() { 	// static �޼���
		System.out.println("staticMethod() in MyInterface2");
	}
}