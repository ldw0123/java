// 두 개의 생성자를 가진 Circle1 클래스
public class Circle1 {
	int radius;
	String name;
	
	// 생성자 이름은 클래스 이름과 동일. 생성자는 리턴 타입 없음
	public Circle1() {	// 매개변수 없는 생성자
		radius = 1;		// radius의 초기값은 1
		name = " ";
	}
	
	
	public Circle1(int r, String n) {	// 매개변수를 가진 생성자
		radius = r;		// 생성자는 radius와 name 필드 초기화를 함
		name = n;		
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle1 pizza = new Circle1(10, "자바피자"); 	// Circle1 객체 생성, 반지름 10
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area); 
		
		Circle1 donut = new Circle1(); 	// Circle 객체 생성, 반지름 1
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}

}
