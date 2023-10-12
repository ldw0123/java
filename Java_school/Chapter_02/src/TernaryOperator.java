// 조건 연산자(삼항 연산자)
public class TernaryOperator {

	public static void main(String[] args) {
		int a = 3, b = 5;
		
		// (a>b)가 참이면 (a-b) 출력, 거짓이면 (b-a) 출력
		System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a)) );	// 거짓이므로 b - a = 2
		
		int c = 7, d = 2;
		
		System.out.println("두 수의 차는 " + ((c>d)?(c-d):(d-c)) );	// 참이므로 c - d = 5
	}

}
