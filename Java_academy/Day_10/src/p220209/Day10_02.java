// p.145 객체를 배열에 저장

package p220209;

public class Day10_02 {

	public static void main(String[] args) {
		
		// Car 타입의 배열객체 생성
		Car[] cars = new Car[3];
		
		// car 객체 생셩
		Car G90 = new Car();
		
		G90.color = "화이트";
		G90.company = "현대";
		G90.type = "대형";
		
		// 모든 인덱스에 G90 객체 저장
		for (int i = 0; i < cars.length; i++) {
			cars[i] = G90;
		}
		
		System.out.println("2번 인덱스 color: " + cars[2].color);
		
		cars[0].color = "블랙"; 		// 0번 인덱스 객체의 color 필드에 "블랙" 대입
		
		System.out.println("2번 인덱스 color: " + cars[2].color);

	}

}
