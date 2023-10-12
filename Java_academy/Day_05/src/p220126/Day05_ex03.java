package p220126;

public class Day05_ex03 {

	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 95;
		int eng = 90;
		int math = 85;
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor + "점");
		System.out.println("영어: " + eng + "점");
		System.out.println("수학: " + math + "점");
		System.out.println("총점: " + (kor+eng+math) + "점");
		System.out.println("평균: " + (kor+eng+math)/3.0 + "점");
	}

}
