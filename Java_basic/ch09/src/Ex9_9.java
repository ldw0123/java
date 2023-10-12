// join()과 StringJoiner
import java.util.StringJoiner;

public class Ex9_9 {
	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");		// 문자열을 ','로 나눠서 배열에 저장
		
		System.out.println(String.join("-", arr));	// 배열의 ','을 '-'로 바꿔서 결합
		
		StringJoiner sj = new StringJoiner("/","[","]"); 	// 문자열을 결합하는 java.util.StringJoiner클래스
		
		for(String s : arr)
			sj.add(s);
		
		System.out.println(sj.toString());
	}

}
