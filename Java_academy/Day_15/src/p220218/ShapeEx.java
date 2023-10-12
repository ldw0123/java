// p.216
package p220218;

public class ShapeEx {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5, 5);
		for (Shape s : shapes) {
			System.out.println(s);
			System.out.println("≥–¿Ã: " + s.area() + " µ—∑π: " + s.length());
		}
	}

}
