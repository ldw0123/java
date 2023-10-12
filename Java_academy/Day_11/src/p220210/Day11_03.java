// p.155

package p220210;

public class Day11_03 {

	public static void main(String[] args) {

		Return obj = new Return();
		
		String name = obj.getName();
		int age = obj.getAge();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());

	}

}

class Return {
	
	String getName() {
		return "ȫ�浿";
	}
	
	int getAge() {
		return 30;
	}
}