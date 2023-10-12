// 변수의 범위

package p220124;

public class Day03_03 {	 // 클래스 블럭
	
	int no; 	// 클래스 블럭 내에서 사용 가능한 변수
	
	public static void main(String[] args) { 	// main 메서드 블럭
		
		String name; 		// main 메서드 블럭 내에서 사용 가능한 변수
		
		if(true) {
			name = "홍길동";
			
			String email = "hong@test.com";
		}
		email  = "hong@test.com"	// if문 밖에서 email 변수를 사용하면 에러 발생
	}

}
