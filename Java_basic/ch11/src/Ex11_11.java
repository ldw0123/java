// HashSet 예제3
import java.util.*;

public class Ex11_11 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");		// 중복이라 저장 안 됨
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);
	}
}

// equals()와 hashCode()를 오버라이딩해야 HashSet이 올바르게 동작
class Person {
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		
		Person p = (Person)obj;
		
		// 나 자신(this)의 이름과 나이를 p와 비교
		return this.name.equals(p.name) && this.age == p.age;
	}

	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() { return name + ":" + age; }
}