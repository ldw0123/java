// 제한된 지네릭 클래스
import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() { return "Fruit"; }
}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy				  { public String tostring() { return "Toy"  ;}}

interface Eatable{}

public class Ex12_3 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // 에러. 타입 불일치
//		FruitBox<Grape> toyBox 	 = new FruitBox<Toy>();   // 에러. Toy는 Fruit의 자손이 아님
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		applebox.add(new Grape());	// 에러. Grape는 Apple의 자손이 아님
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox-" + fruitBox);
		System.out.println("appleBox-" + appleBox);
		System.out.println("grapeBox-" + grapeBox);
	}	// main
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>(); 	// item을 저장할 list
	void add(T item) { list.add(item);		}   // 박스에 item 추가
	T get(int i) 	 { return list.get(i); 	}	// 박스에서 item을 꺼낼 때
	int size() 		 { return list.size(); 	}
	public String toString() { return list.toString(); }
}
