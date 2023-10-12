// HashMap 예제2
import java.util.*;

public class Ex11_17 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", 90);
		map.put("김자바", 100); 	// 90을 지우고 100을 덮어 씀
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);

		Set set = map.entrySet(); 	//entry(key+value)를 set에 반환
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름: " + e.getKey() + ", 점수: " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단: " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			int i = (int)it.next();
			total += i; 	// value(점수)들을 모두 더함(총점)
		}
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + (float)total/set.size());
		System.out.println("최고점수: " + Collections.max(values));
		System.out.println("최저점수: " + Collections.min(values));
	}
}
