// ���� ������(���� ������)
public class TernaryOperator {

	public static void main(String[] args) {
		int a = 3, b = 5;
		
		// (a>b)�� ���̸� (a-b) ���, �����̸� (b-a) ���
		System.out.println("�� ���� ���� " + ((a>b)?(a-b):(b-a)) );	// �����̹Ƿ� b - a = 2
		
		int c = 7, d = 2;
		
		System.out.println("�� ���� ���� " + ((c>d)?(c-d):(d-c)) );	// ���̹Ƿ� c - d = 5
	}

}
