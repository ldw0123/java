//Stack & Queue 활용 예제2
import java.util.*;

public class Ex11_4 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; 	// Queue에 최대 5개까지만 저장되도록 한다

	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다");

		while(true) { 	// 무한반복문
			System.out.print(">>");
			try {
				// 화면으로부터 라인 단위로 입력받는다
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();

				if("".equals(input)) continue; 	// 입력 내용이 없으면 아래의 if-else문을 건너뛰고 맨 앞의 true로 이동

				if(input.equalsIgnoreCase("q")) { 	// q를 입력하면 종료
					// equalsIgnoreCase(): 대소문자 상관없이 비교
					System.out.println(" 프로그램을 종료합니다");
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다");
					System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다");
				} else if(input.equalsIgnoreCase("history")) {
					// 입력받은 명령어를 저장하고,
					save(input);

					//LinkedList의 내용을 보여준다
					LinkedList list = (LinkedList)q;  //Queue 타입에서 LinkedList 타입으로 참조변수 형변환

					final int SIZE = list.size();
					for(int i = 0; i < SIZE; i++)
						System.out.println((i+1) + "." + list.get(i));	// 차례대로 번호 붙이기
				} else {
					save(input);
					System.out.println(input);
				} // if(input.equalsIgnoreCase("q")) {
			} catch(Exception e) {
				System.out.println("입력 오류입니다");
			}
		} // while(true)
	} // main

	public static void save(String input) {
		// queue에 저장한다
		if(!"".equals(input)) 	// 빈 문자열이 아닐 때
			q.offer(input);

		// queue의 최대 크기를 넘으면 제일 처음 입력된 것을 삭제한다
		if(q.size() > MAX_SIZE) 	// size()는 Collection인터페이스에 정의
			q.remove(); 	// q.poll();과 같음
	}
} // end of class
