// 4�� ��������
// �������� 0~25������ ������ �޾� ���� A�� ���ϱ� ������ �ؼ� A~Z���� ����ϴ� ���α׷�
import java.util.Random;
public class ex4 {

	public static void main(String[] args) {
		Random r = new Random(); 		// ���� ��ü ����
		int num = r.nextInt(26);		// 0~25�� ���� ����
		System.out.println("�������� " + num + "�Դϴ�.");
		System.out.println(num + " + 5 = " + (char)('A'+num));	// ���ڿ� A�� ������ ���� ���ڷ� ��ȯ �� A~Z������ ���ĺ��� ���
		
	}

}
