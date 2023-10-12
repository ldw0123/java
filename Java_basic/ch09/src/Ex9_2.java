// equals()의 오버라이딩
class Person {
	long id;	 // this.id와 같음. 같은 객체 내에서 this 생략 가능
	
	public boolean equals(Object obj) { 	// 오버라이딩
		if(obj instanceof Person)
			return id == ((Person)obj).id;
		else
			return false;
	}
	
	Person(long id) {
		this.id = id;
	}
}

public class Ex9_2 {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
	
		if(p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람입니다");
		else
			System.out.println("p1과 p2는 다른 사람입니다");

	}

}
