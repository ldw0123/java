// static import��

import static java.lang.System.out;
import static java.lang.Math.*;

public class Ex7_6 {
	public static void main(String[] args) {
		
		// System.out.println(Math.random()); -> System �� Math Ŭ���� �̸� ���� ����
		for(int i = 0; i < 10; i++)
			out.print((int)(random()*10) + " ");	// 0~10������ ���� ���� ����
		System.out.println();
		
		// System.out.println("Math.PI :" + Math.PI);
		out.println("Math.PI: " + PI);
	}
}
