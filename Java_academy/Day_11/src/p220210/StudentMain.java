// p.172 생성자 오버로딩

package p220210;

public class StudentMain {

	public static void main(String[] args) {
				
		Student stu1 = new Student(); 	// 1번 생성자
		
		System.out.println("========= 1번 생성자 =========");
		System.out.println(stu1.name);
		System.out.println(stu1.grade);
		System.out.println(stu1.department);
		
		Student stu2 = new Student("홍길동"); // 2번 생성자
		
		System.out.println("========= 2번 생성자 =========");
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
		
		Student stu3 = new Student("홍길동", 4); // 3번 생성자
		
		System.out.println("========= 3번 생성자 =========");
		System.out.println(stu3.name);
		System.out.println(stu3.grade);
		System.out.println(stu3.department);
		
		Student stu4 = new Student("홍길동", 4, "소프트웨어공학"); // 4번 생성자
		System.out.println("========= 4번 생성자 =========");
		System.out.println(stu4.name);
		System.out.println(stu4.grade);
		System.out.println(stu4.department);
		
	}

}
