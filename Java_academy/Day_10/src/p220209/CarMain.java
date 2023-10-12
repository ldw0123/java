package p220209;

public class CarMain {

	public static void main(String[] args) {
		
		Car sonata = new Car(); 		// Car 객체를 생성하여 Car 타입의 sonata 객체 변수에 대입
		Car k3 = new Car();				// Car 객체를 생성하여 Car 타입의 k3 객체 변수에 대입
		
		sonata.color = "블랙";
		sonata.company = "현대";
		sonata.type = "소형";
		
		k3.color = "블랙";
		k3.company = "기아";
		k3.type = "소형";
		
		sonata.go(); 		// go() 메서드 호출
		k3.go();
		k3.back();
		System.out.println(sonata.color);
		System.out.println(sonata.company);
		System.out.println(sonata.type);
		System.out.println(k3.color);
		System.out.println(k3.company);
		System.out.println(k3.type);
	}

}
