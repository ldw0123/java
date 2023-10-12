// 예외 발생시키기
public class Ex8_6 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("예외를 고의로 발생시켰음");
			throw e;	// 예외를 발생시킴
//			throw new Exception("예외를 고의로 발생시켰음");	// 위의 두 줄을 한 줄로 줄여 쓸 수 있다
		} catch(Exception e) {	// 예외를 처리함
			System.out.println("에러 메시지: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음");
	}

}
