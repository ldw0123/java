// p.197

package p220214;

public class SmartPhoneMain {

	public static void main(String[] args) {

		Phone p = new Phone();
		p.name = "전화기";
		p.company = "애플";
		p.color = "핑크";
		
		System.out.println("Phone 출력");
		System.out.println(p.name);
		System.out.println(p.company);
		System.out.println(p.color);
		p.call();
		p.receive();
		
		SmartPhone sp = new SmartPhone();
		sp.name = "갤럭시";
		sp.company = "삼성";
		sp.color = "블랙";
		
		System.out.println("SmartPhone 출력");
		System.out.println(sp.name);
		System.out.println(sp.company);
		System.out.println(sp.color);
		sp.call();
		sp.receive();
		sp.installApp();
	}

}
