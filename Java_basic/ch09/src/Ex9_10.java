// 문자열과 기본형 간의 변환
public class Ex9_10 {
	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal); 	// int를 String으로 변환하는 방법 1
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; 	// int를 String으로 변환하는 방법 2
		
		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2); 	// 문자열을 숫자로 변환 1
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2); 	// 문자열을 숫자로 변환 2
		
		System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
	}
}
