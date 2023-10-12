// p.213

package p220218;

public class ObjectEx {

	public static void main(String[] args) {
		
		allObject(new GraphicCard());
		allObject(new Amd());
		allObject(new Nvidia());
		allObject("¾È³ç");
	}
	
	public static void allObject(Object obj) {
		System.out.println(obj.toString());
	}

}
