// 패키지
package lib;	// Calculator.java를 컴파일하여 Calculator.class를 lib폴더에 저장하라는 뜻

public abstract class Calculator {		// 다른 패키지에서 Calculator를 접근할 수 있도록, Calculator의 접근 지정자를 public으로 설정
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}
