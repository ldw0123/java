// 실수형

package p220124;

public class Day03_02 {

	public static void main(String[] args) {
		float f = 3.1415926553589793f;		// float형: 맨 뒤에 f를 반드시 붙여야 함
		double d = 3.1415926553589793d;		// double형: d를 붙여도 되고 생략 가능

		System.out.println("float f: "+f);
		System.out.println("double d: "+d);
		
		double d2 = 3.1415926553589793; 	// d 생략 가능
		System.out.println("double d2: "+d2);
	}

}
