// p.128

package p220207;

public class Day08_10 {

	public static void main(String[] args) {

		// 배열 선언
		String[] names = {"홍길동", "이순신", "김유신"};
		int[] scores = {90, 80, 100};
		
		int i = 0; 		// 인덱스 변수 
		for (String name : names) { 		// names를 name에 복사하고 반복
			System.out.println(name + ": " + scores[i]);
			i++;
		}

	}

}
