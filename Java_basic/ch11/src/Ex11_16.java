// HashMap 예제1
import java.util.*;

public class Ex11_16 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); 	// OK. 이미 존재하는 키 추가 가능. 기존 값은 없어짐
		
		Scanner s = new Scanner(System.in); 	// 라인단위로 입력받음
		
		while(true) { 	// 무한반복문
			System.out.println("id와 password를 입력하세요");
			System.out.println("id: ");
			String id  = s.nextLine().trim();
			
			System.out.println("password: ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) { 	// key중에 입력한 id가 있는지 확인
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력하세요");
				continue;
			}
			
			if(!(map.get(id)).equals(password)) { 	// id와 password가 같지 않으면
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요");
			} else { 	// 같으면
				System.out.println("id와 비밀번호가 일치합니다");
				break; 	// 비밀번호가 일치할 때 반복문에서 빠져나옴
			}
		} // while
	} // main
}
