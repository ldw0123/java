import java.util.*;

public class Ex11_12 {
	public static void main(String[] args) {
		HashSet setA   = new HashSet();
		HashSet setB   = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1"); setA.add("2"); setA.add("3");
		setA.add("4"); setA.add("5");
		System.out.println("A = " + setA);
		
		setB.add("4"); setB.add("5"); setB.add("6");
		setB.add("7"); setB.add("8");
		System.out.println("B = " + setB);
		
		// 교집합
		// setA.retainAll(setB);
		Iterator it = setB.iterator();
		while(it.hasNext()) { 			// B에서 요소 하나씩 꺼냄 (4부터 8까지)
			Object tmp = it.next();
			if(setA.contains(tmp)) 		// setA에서 B의 요소(4)가 있는지 확인
				setKyo.add(tmp);
		}
		
		// 차집합
		// setA.removeAll(setB);
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp)) 	// setB에 없는 것만 차집합에 저장
				setCha.add(tmp);
		}
		
		// 합집합
		// setA.addAll(setB);
		it = setA.iterator(); 			// setA를 합집합에 저장
		while(it.hasNext())
			setHab.add(it.next());
			
		it = setB.iterator();			// setB를 합집합에 저장
		while(it.hasNext())
			setHab.add(it.next());
		// set은 중복이 없는 것이 특징이므로 알아서 중복 제거
		
		System.out.println("A ∩ B = " + setKyo);
		System.out.println("A ∪ B = " + setHab);
		System.out.println("A - B = " + setCha);
	}

}
