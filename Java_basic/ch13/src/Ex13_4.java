// �������� I/O ���ŷ ����1
import javax.swing.JOptionPane;

public class Ex13_4 {
	public static void main(String[] args) throws Exception {
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		
		System.out.println("���� �߻� ī��Ʈ�ٿ�");
		for(int i = 10; i > 0; i--) {
			System.out.println(i); 	// ī��Ʈ�ٿ�
			try {
				Thread.sleep(1000); // 1�ʰ� �ð��� �����Ѵ�
			} catch(Exception e) {}
		}
		System.out.println("���� �߻�");
	}
}