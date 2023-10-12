//p.130

package p220208;

public class Day09_02 {

	public static void main(String[] args) {

		String name1 = new String("홍길동"); 		// new 연산자를 통해 객체를 비교
		String name2 = new String("홍길동");
		
		System.out.println(name1 == name2); 		// 참조하고 있는 메모리 주소가 다르기 때문에 false

	}

}
