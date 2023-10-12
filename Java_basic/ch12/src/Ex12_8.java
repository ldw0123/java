// �ֳ����̼��� Ȱ�� ����

import java.lang.annotation.*;

@Deprecated
@SuppressWarnings("1111") 	// ��ȿ���� ���� �ֳ����̼��� ���õȴ�
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="160101", hhmmss="235959"))
class Ex12_8 {
	public static void main(String[] args) {
		// Ex12_8�� Class��ü�� ��´�
		Class<Ex12_8> cls = Ex12_8.class;
		
		TestInfo anno = cls.getAnnotation(TestInfo.class); 	// @TestInfo �ֳ����̼��� ���� ��
		System.out.println("anno.testedBy()=" + anno.testedBy()); 	// �ֳ����̼��� ���� �մ� testedBy()�޼��� ȣ��
		System.out.println("anno.testDate().yymmdd()=" + anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()=" + anno.testDate().hhmmss());
		
		for (String str : anno.testTools())
			System.out.println("testTools=" + str);
		
		System.out.println();
		
		// Ex12_8�� ����� ��� �ֳ����̼��� ���� �´�
		Annotation[] annoArr = cls.getAnnotations();
		
		for(Annotation a : annoArr)
			System.out.println(a);
	} // main
}

@Retention(RetentionPolicy.RUNTIME) 	// ���� �ÿ� ��� �����ϵ��� ����
@interface TestInfo {
	int 	 count() 	 	default 1;
	String	 testedBy();
	String[] testTools()	default "JUnit";
	TestType testType() 	default TestType.FIRST;
	DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME) 	// ���� �ÿ� ��� �����ϵ��� ����
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

enum TestType { FIRST, FINAL }