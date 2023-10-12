// Collections 예제
import java.util.*;
import static java.util.Collections.*; 	// Collections를 생략 가능하게 해줌

public class Ex11_19 {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list, 1,2,3,4,5);	// Collections.addAll() 중에 Collections 생략
		System.out.println(list);
		
		rotate(list, 2); 	// 오른쪽으로 두 칸씩 이동
		System.out.println(list);
		
		swap(list, 0, 2); 	// 첫 번째와 세 번째를 교환(swap)
		System.out.println(list);
		
		shuffle(list); 		// 저장된 요소의 위치를 임의로 변경
		System.out.println(list);
		
		sort(list, reverseOrder()); 		// 역순 정렬. reverse(list); 와 동일
		System.out.println(list);
		
		sort(list); 		// 정렬
		System.out.println(list);
		
		int idx = binarySearch(list, 3);	// 3이 저장된 위치(index)를 반환
		System.out.println("index of 3 = " + idx);
		
		System.out.println("max=" + max(list));		// 최댓값
		System.out.println("min=" + min(list));		// 최솟값
		System.out.println("min=" + max(list, reverseOrder()));	// 역순으로 최댓값 -> 최솟값
		
		fill(list, 9); 		// list를 9로 채운다
		System.out.println("list" + list);
		
		// list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단, 결과는 변경불가
		List newList = nCopies(list.size(), 2);
		System.out.println("newList=" + newList);
		
		System.out.println(disjoint(list, newList)); 	// 공통요소가 없으면 true
		
		copy(list, newList); 	// newList의 요소들을 list에 복사
		System.out.println("newList=" + newList);
		System.out.println("list=" + list);
		
		replaceAll(list, 2, 1); 	//  list의 요소 중 2를 1로 전부 교체
		System.out.println("list"+list);
		
		Enumeration e = enumeration(list); 	// Iterator와 같음
		ArrayList list2 = list(e);
		
		System.out.println("list2=" + list2);
	}
}
