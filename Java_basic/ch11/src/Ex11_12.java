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
		
		// ������
		// setA.retainAll(setB);
		Iterator it = setB.iterator();
		while(it.hasNext()) { 			// B���� ��� �ϳ��� ���� (4���� 8����)
			Object tmp = it.next();
			if(setA.contains(tmp)) 		// setA���� B�� ���(4)�� �ִ��� Ȯ��
				setKyo.add(tmp);
		}
		
		// ������
		// setA.removeAll(setB);
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp)) 	// setB�� ���� �͸� �����տ� ����
				setCha.add(tmp);
		}
		
		// ������
		// setA.addAll(setB);
		it = setA.iterator(); 			// setA�� �����տ� ����
		while(it.hasNext())
			setHab.add(it.next());
			
		it = setB.iterator();			// setB�� �����տ� ����
		while(it.hasNext())
			setHab.add(it.next());
		// set�� �ߺ��� ���� ���� Ư¡�̹Ƿ� �˾Ƽ� �ߺ� ����
		
		System.out.println("A �� B = " + setKyo);
		System.out.println("A �� B = " + setHab);
		System.out.println("A - B = " + setCha);
	}

}
