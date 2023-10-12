package p220221;

public class CarMain {

	public static void main(String[] args) {
		
		SportsCar c1 = new SportsCar();
		
		c1.name = "소나타";
		c1.wheel = 4;
		c1.color ="은색";
		
		System.out.println("name : " + c1.name);
		System.out.println("바퀴수 : " + c1.wheel);
		System.out.println("차량색깔 : " + c1.color);
		
		c1.name = "그랜저";
		c1.wheel = 4;
		c1.color ="검정색";
		
		System.out.println("name : " + c1.name);
		System.out.println("바퀴수 : " + c1.wheel);
		System.out.println("차량색깔 : " + c1.color);
		      
		//뜬금없는 메소드호출
		System.out.println("뜬금없는 메소드호출");
		c1.testCar();

	}
}