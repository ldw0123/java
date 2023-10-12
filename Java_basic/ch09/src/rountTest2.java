// 오토박싱 & 언박싱
import java.util.ArrayList; 	// ctrl+shift+o 자동 import문 추가

public class rountTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); 	// JDK1.5 이전에는 에러. 현재는 가능. 컴파일러가 자동으로 100을 new Integer(100)으로 바꿔줌(오토박싱)
//		list.add(new Integer(100));		// Integer객체를 집어넣음. list에는 객체만 추가 가능
		System.out.println(list);
		
		Integer i = list.get(0); 		// list에 저장된 첫번째 객체를 꺼냄. 컴파일러가 자동으로 intValue()를 추가해줌(언박싱)
//		int i = list.get(0);			// 위와 같음
//		int i = list.get(0).intValue();	// intValue()로 Integer를 int로 변환. 
		System.out.println(i);
	}
}
