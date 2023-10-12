// p.130 참조자료형

package p220208;

public class Day09_01 {

	public static void main(String[] args) {

		String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = "임꺽정";
		
		System.out.println(name1 == name2); 	// name1과 name2는 같은 주소를 참조함
		System.out.println(name1 == name3);		// name1과 name3는 다른 주소를 참조함
	}

}
