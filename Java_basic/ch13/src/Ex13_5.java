// 쓰레드의 I/O 블락킹 예제2
import javax.swing.JOptionPane;

public class Ex13_5 {
	public static void main(String[] args) throws Exception{
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();

		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다");
	}
}

class ThreadEx5_1 extends Thread {
	public void run() {
		System.out.println("로켓 발사 카운트다운");
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch(Exception e) {}
		}
		System.out.println("로켓 발사");
	} // run()
}