// static import문

import static java.lang.System.out;
import static java.lang.Math.*;

public class Ex7_6 {
	public static void main(String[] args) {
		
		// System.out.println(Math.random()); -> System 과 Math 클래스 이름 생략 가능
		for(int i = 0; i < 10; i++)
			out.print((int)(random()*10) + " ");	// 0~10까지의 랜덤 정수 생성
		System.out.println();
		
		// System.out.println("Math.PI :" + Math.PI);
		out.println("Math.PI: " + PI);
	}
}
