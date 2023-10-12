// 쓰레드의 I/O 블락킹 예제1
import javax.swing.JOptionPane;

public class Ex13_4 {
	public static void main(String[] args) throws Exception {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		System.out.println("로켓 발사 카운트다운");
		for(int i = 10; i > 0; i--) {
			System.out.println(i); 	// 카운트다운
			try {
				Thread.sleep(1000); // 1초간 시간을 지연한다
			} catch(Exception e) {}
		}
		System.out.println("로켓 발사");
	}
}