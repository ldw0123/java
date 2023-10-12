package pkg2;

import pkg1.MyParentTest; 	// 다른 패키지의 클래스를 사용

public class MyParentTest2 {

	class MyChild extends MyParentTest {
		public void printMembers() {
		 // System.out.println(prv);	// 에러. 다른 클래스이기 때문에 에러
         // System.out.println(dft);	// 에러. 다른 클래스이기 때문에 에러
			System.out.println(prt);	// ok. 다른 패키지의 자손이기 때문에 가능
			System.out.println(pub);
		}
	}

	public static void main(String[] args) {
		MyParentTest p = new MyParentTest();
     // System.out.println(p.prv);	// 에러. 다른 클래스이기 때문에 에러
     // System.out.println(p.dft);	// 에러.	다른 클래스이기 때문에 에러
     // System.out.println(p.prt);  // 에러.	다른 패키지의 다른 클래스이기 때문에 에러
		System.out.println(p.pub);
	}

}
