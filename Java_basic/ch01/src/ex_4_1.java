// 4-1�� ��������
// ���� ����
import java.util.Random;
public class ex_4_1 {

	public static void main(String[] args) {
		Random random = new Random(); 		// ���� ��ü ����
		for(int i = 0; i < 10; i++) {		// 10�� �ݺ�
			int num1 = random.nextInt(26); 	// 0~25���� int�� ���� ����
			System.out.print((char)('A'+num1));	// ���ڿ�A�� ������ ���� ���ڷ� ��ȯ
		}
		System.out.println(" ");
		
		for(int i = 0; i < 3; i++) {
		int num2 = random.nextInt(10);	 	// 0~10���� ���� ����
		System.out.print((char)(num2+65)); 	// ���ڸ� ���ڷ� ��ȯ
		}
	}

} 


