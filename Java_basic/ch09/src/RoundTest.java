// MathŬ������ �޼���
public class RoundTest {
	public static void main(String[] args) {
		double sum = 0;
		double sum1 = 0;
		double sum2 = 0;
		
		System.out.println("  d     round(d)  rint(d)");
		for(double d = 0.5; d <= 10.5; d++) {
			double d1 = Math.round(d);	// �ݿø� �޼���
			double d2 = Math.rint(d);	// ¦�� �ݿø� �޼��� (0.5�� 0, 1.5�� 2, 2.5�� 2... ��ȯ)
			
			System.out.printf("%4.1f %8.1f %8.1f\n", d, d1, d2);
			
			sum += d;
			sum1 += d1;
			sum2 += d2;
		}

		System.out.println("------------------------");
		System.out.printf("%4.1f %8.1f %8.1f\n", sum, sum1, sum2);

	}

}