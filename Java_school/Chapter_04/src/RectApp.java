// �ʺ�� ���̸� �Է¹޾� �簢���� ���� ����ϴ� ���α׷�
import java.util.Scanner;

class Rectangle {
	int width;		// �ʵ�
	int heigth;
	public int getArea() {		// �������� ����ϴ� �޼���
		return width*heigth;
	}
}
public class RectApp {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); 		// ��ü ����
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		rect.width = scanner.nextInt();
		rect.heigth = scanner.nextInt();
		System.out.println("�簢���� ������ " + rect.getArea());
		scanner.close();
	}

}
