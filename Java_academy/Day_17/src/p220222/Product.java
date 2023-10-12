// 라이브러리 클래스1: 부모

package p220222;

public class Product {
	
	int price;							// 필드 선언
	int bonusPoint;
	
	public Product() {					// 기본 생성자를 명시적으로 선언
										// 이에 비해 JAVA가 자동적으로 생성하는 것을 '묵시적 선언'이라고 함
	}
	
	public Product(int price) { 		// 생성자 선언
		this.price = price;
		bonusPoint = (int)(price/10.0);
		
	}
}
