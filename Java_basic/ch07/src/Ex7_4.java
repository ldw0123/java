// super() 조상의 생성자

public class Ex7_4 {

	public static void main(String[] args) {
		Point3D_4 p = new Point3D_4(1, 2, 3);
		System.out.println("x=" + p.x + ", y=" + p.y + ", z=" + p.z); 
	}

}

class Point4 {
	int x, y;
	Point4(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D_4 extends Point4 {
	int z;
	Point3D_4(int x, int y, int z) {
		super(x, y); 	// Point(int x, int y)를 호출
						// 생성자의 첫 줄에는 반드시 생성자를 호출해야 한다
		this.z = z;		
	}
}