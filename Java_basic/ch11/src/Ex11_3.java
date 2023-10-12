// Stack & Queue 활용 예제1
import java.util.*;

public class Ex11_3 {
	public static void main(String[] args) {
//		if (args.length != 1) {
//			System.out.println("Usage:java Ex11_3 \"EXPRESSION\"");
//			System.out.println("Example:java Ex11_3 \"((2+3)*1)+3\"");
//			System.exit(0);
//		}
		
		Stack st = new Stack();
		String expression = "((3+5)*7)+3";	// args[0];
		
		System.out.println("expression:" + expression);
		
		try {
			for(int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i); 	// 문자열에서 한 글자씩 꺼냄
				
				if (ch == '(') {
					st.push(ch + "");
				} else if (ch == ')') {
					st.pop();
				}
			}
		
			if (st.isEmpty()) { 	// 스택이 비어있으면
				System.out.println("괄호가 일치합니다");
			} else {
				System.out.println("괄호가 일치하지 않습니다");
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다");
		} // try
	}

}
