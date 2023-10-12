// DecimalFormat ����2
import java.text.*;

public class Ex10_7 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");	// 10���� ������ ���ڿ�
		DecimalFormat df2 = new DecimalFormat("#,###E0");	// ���� ������ ���ڿ�
		
		try {
			Number num = df.parse("1,234,567.89"); 	// ���ڿ� -> ����
			System.out.print("1,234,567.89" + " -> ");
			
			double d = num.doubleValue(); 	// d = 1234567.89
			System.out.print(d + " -> ");
			
			System.out.println(df2.format(num));
		}
		catch(Exception e) {}
	}	// main
}
