// �������� I/O ���ŷ ����2
import javax.swing.JOptionPane;

public class Ex13_5 {
	public static void main(String[] args) throws Exception{
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();

		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�");
	}
}

class ThreadEx5_1 extends Thread {
	public void run() {
		System.out.println("���� �߻� ī��Ʈ�ٿ�");
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch(Exception e) {}
		}
		System.out.println("���� �߻�");
	} // run()
}