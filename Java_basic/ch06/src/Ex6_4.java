
public class Ex6_4 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();	// ��ü ����
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		mm.printGugudan(12); 		// ������ 3���� ���

		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}

}

class MyMath {	
	
	void printGugudan(int dan) {	// ������ �޼���
		for (int i = 1; i <= 9; i++) {
			if(!(2 <= dan && dan <= 9))
				return; 		// �Է¹��� ��(dan)�� 2~9�� �ƴϸ� �޼��带 �����ϰ� ���ư���
						
			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		}
		System.out.println();
	}
	
	long add(long a, long b) {
		long result = a + b;
		return result;
		// return a + b;  ->  ���� �� ���� �̿� ���� �� �ٷ� ������ �� �� �ִ�.
	}
		long subtract(long a, long b) { return a - b; }
		long multiply(long a, long b) {	return a * b; }
		double divide(double a, double b) { return a / b;}
	}