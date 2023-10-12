// 접근 제어자
package pkg1;

public class MyParentTest {		// public 접근 제어자 	    다른 클래스에서도 참조 가능
	private	  int prv;		// private 접근 제어자    같은 클래스
			  int dft;		// (default) 접근 제어자  같은 패키지
	protected int prt;		// protected 접근 제어자  같은 패키지 + 자손(다른 패키지의)
	public 	  int pub;		// public 접근 제어자     접근 제한 없음

	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

class MyParent {		// (default) 접근 제어자

	public static void main(String[] args) {
		MyParentTest p = new MyParentTest();
	 // System.out.println(p.prv);	// 에러. 다른 클래스이기 때문에 접근 범위가 맞지 않음
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
	}

}
