// int 타입의 필드를 가지는 Rect클래스를 작성하고, 면적이 같으면 두 Rect 객체가 같은 것으로 판별하는 equals() 클래스
class Rect {
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Object obj) { 	// 사각형 면적 비교
		Rect p = (Rect)obj; 	// obj를 Rect로 다운캐스팅
		if (width*height == p.width*p.height) 
			return true;
		else
			return false;
	}
}
public class RectEx {
	public static void main(String[] args) {
		Rect a = new Rect(2, 3); 	// 면적 6
		Rect b = new Rect(3, 2); 	// 면적 6
		Rect c = new Rect(3, 4); 	// 면적 12
		if(a.equals(b))		// a와 b의 객체의 내용이 같으면
			System.out.println("a is equal to b");	// a와 b는 면적이 같으므로, equals()는 같다고 판단
		if(a.equals(c))
			System.out.println("a is equal to c");
		if(b.equals(c))		// b와 c의 객체의 내용이 같으면
			System.out.println("b is equal to c");
	}

}
