// p.150

package p220210;

public class Day11_01 {

	public static void main(String[] args) {

		Local local = new Local();
		
		System.out.println(local.name); 	// null
		
		local.process();
		System.out.println(local.name); 	 // ȫ�浿
		
		local.printAge1();
		local.printAge2();
		
		// for�� ��� �������� ���� ����
		for(int i = 0; i < 10; i++) { 		// int i: for�� �ȿ����� ��������
			int temp = 0;
			temp += i;
		}
		
		// System.out.println(temp); 		// int i�� �������� �̱� ������ ����
	}

}

class Local {
	
	String name;
	
	void process() {
		name = "ȫ�浿";
	}
	
	void printAge1() {
		int age = 20; 		// ��������
		System.out.println(age);
	}
	
	void printAge2() {
		int age = 30; 		// ��������
		System.out.println(age);
	}
}
