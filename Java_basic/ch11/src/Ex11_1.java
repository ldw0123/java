// ArrayList
import java.util.*;

public class Ex11_1 {
	public static void main(String[] args) {
		// 기본 길이(용량, capacity)가 10인 ArrayList를 생성
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(4);	// list1.add(new Integer(4)); 와 같음
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		// ArrayList(Collection c) 생성자
		ArrayList list2 = new ArrayList(list1.subList(1,4)); 	// sublist(): 1~3번 인덱스를 읽어서 반환
		print(list1, list2);
		
		// Collection은 인터페이스, Collections는 유틸클래스
		Collections.sort(list1);	// list1과 list2를 정렬한다
		Collections.sort(list2);	// Collections.sort(List 1)
		print(list1, list2);
		
		// list1이 list2의 모든 요소를 포함하는가?
		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); 	// 인덱스가 3인 곳에 "A"를 추가. "B"와 "C"는 뒤로 자리 이동
		print(list1, list2);
		
		list2.set(3, "AA"); // 인덱스가 3인 곳을 "AA"로 변경
		print(list1, list2);
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
		print(list1, list2);
		
		// list2에서 list1에 포함된 객체들을 삭제한다
		for(int i = list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))	// get(): 지정된 인덱스의 객체 읽기, contains(): 지정된 객체가 포함되어 있으면 true
				list2.remove(i); 	// 인덱스가 i인 곳에 저장된 요소를 삭제
		}
		print(list1, list2);
		
		list1.add(0, "1"); 	// 0번 인덱스에 문자열 1 추가
		list1.add(2, 1); 	// 3번 인덱스에 숫자 1 추가
		//indexOf()는 지정된 객체의 위치(인덱스)를 알려준다
		System.out.println("\"1\"의 index = " + list1.indexOf("1"));
		System.out.println("1의 index = " + list1.indexOf(1));
		print(list1, list2);
		
		list1.remove(1); 	// 인덱스가 1인 객체를 삭제
		print(list1, list2);
		
		list1.remove(new Integer(1));	// 1을 삭제
		print(list1, list2);
	}	// main

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	}	
} // class
