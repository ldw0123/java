// 너비와 높이를 입력받아 사각형의 합을 출력하는 프로그램
import java.util.Scanner;

class Rectangle {
	int width;		// 필드
	int heigth;
	public int getArea() {		// 면적값을 계산하는 메서드
		return width*heigth;
	}
}
public class RectApp {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); 		// 객체 생성
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		rect.width = scanner.nextInt();
		rect.heigth = scanner.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		scanner.close();
	}

}
