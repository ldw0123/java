// p.172 ������ �����ε�

package p220210;

public class StudentMain {

	public static void main(String[] args) {
				
		Student stu1 = new Student(); 	// 1�� ������
		
		System.out.println("========= 1�� ������ =========");
		System.out.println(stu1.name);
		System.out.println(stu1.grade);
		System.out.println(stu1.department);
		
		Student stu2 = new Student("ȫ�浿"); // 2�� ������
		
		System.out.println("========= 2�� ������ =========");
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
		
		Student stu3 = new Student("ȫ�浿", 4); // 3�� ������
		
		System.out.println("========= 3�� ������ =========");
		System.out.println(stu3.name);
		System.out.println(stu3.grade);
		System.out.println(stu3.department);
		
		Student stu4 = new Student("ȫ�浿", 4, "����Ʈ�������"); // 4�� ������
		System.out.println("========= 4�� ������ =========");
		System.out.println(stu4.name);
		System.out.println(stu4.grade);
		System.out.println(stu4.department);
		
	}

}
