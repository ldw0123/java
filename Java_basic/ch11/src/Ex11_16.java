// HashMap ����1
import java.util.*;

public class Ex11_16 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); 	// OK. �̹� �����ϴ� Ű �߰� ����. ���� ���� ������
		
		Scanner s = new Scanner(System.in); 	// ���δ����� �Է¹���
		
		while(true) { 	// ���ѹݺ���
			System.out.println("id�� password�� �Է��ϼ���");
			System.out.println("id: ");
			String id  = s.nextLine().trim();
			
			System.out.println("password: ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) { 	// key�߿� �Է��� id�� �ִ��� Ȯ��
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է��ϼ���");
				continue;
			}
			
			if(!(map.get(id)).equals(password)) { 	// id�� password�� ���� ������
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���");
			} else { 	// ������
				System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�");
				break; 	// ��й�ȣ�� ��ġ�� �� �ݺ������� ��������
			}
		} // while
	} // main
}
