package p220209;

public class CarMain {

	public static void main(String[] args) {
		
		Car sonata = new Car(); 		// Car ��ü�� �����Ͽ� Car Ÿ���� sonata ��ü ������ ����
		Car k3 = new Car();				// Car ��ü�� �����Ͽ� Car Ÿ���� k3 ��ü ������ ����
		
		sonata.color = "��";
		sonata.company = "����";
		sonata.type = "����";
		
		k3.color = "��";
		k3.company = "���";
		k3.type = "����";
		
		sonata.go(); 		// go() �޼��� ȣ��
		k3.go();
		k3.back();
		System.out.println(sonata.color);
		System.out.println(sonata.company);
		System.out.println(sonata.type);
		System.out.println(k3.color);
		System.out.println(k3.company);
		System.out.println(k3.type);
	}

}
