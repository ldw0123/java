// ���ڿ��� �⺻�� ���� ��ȯ
public class Ex9_10 {
	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal); 	// int�� String���� ��ȯ�ϴ� ��� 1
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; 	// int�� String���� ��ȯ�ϴ� ��� 2
		
		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2); 	// ���ڿ��� ���ڷ� ��ȯ 1
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2); 	// ���ڿ��� ���ڷ� ��ȯ 2
		
		System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
	}
}
