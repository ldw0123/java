// DecimalFormat 예제2
import java.text.*;

public class Ex10_7 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");	// 10진수 형식의 문자열
		DecimalFormat df2 = new DecimalFormat("#,###E0");	// 지수 형식의 문자열
		
		try {
			Number num = df.parse("1,234,567.89"); 	// 문자열 -> 숫자
			System.out.print("1,234,567.89" + " -> ");
			
			double d = num.doubleValue(); 	// d = 1234567.89
			System.out.print(d + " -> ");
			
			System.out.println(df2.format(num));
		}
		catch(Exception e) {}
	}	// main
}
