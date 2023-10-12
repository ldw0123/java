// p.69 삼항연산

package p220124;

public class Day03_13 {

	public static void main(String[] args) {
		int score = 80;
		String pass = score >= 60 ? "합격" : "불합격"; 	// score가 60 이상이면 합격, 그렇지 않으면 불합격
		System.out.println(pass);
	}

}
