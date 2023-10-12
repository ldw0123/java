package p220214;

public class Human {

	int age = 0;
	Human(int a) {
		this.age = a;
	}
	@Override
	public String toString() {
		return " 나이는 : " + age + "살 입니다.";
	}

}
