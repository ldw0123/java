// �Ű������� ������
class Product {
	int price;		 // ��ǰ�� ����
	int bonusPoint;	 // ��ǰ ���� �� �����ϴ� ����Ʈ
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); 	// ����Ʈ�� ��ǰ ������ 10%
	}
}

class Tv1 extends Product {
	Tv1() {
		// ����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�
		super(100);  // Tv�� ������ 100�������� �Ѵ�
	}
	
	// ObjectŬ������ toString()�� �������̵��Ѵ�
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);  // Computer�� ������ 200�������� �Ѵ�
	}
	public String toString() {
		return "Computer";
	}
}

class Buyer {      	// ��
	int money = 1000; 	// ���� �ݾ�
	int bonusPoint = 0;	// ����Ʈ
	
	void buy(Product p) {	// new Tv1()�� new Computer()�� ����
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�");
			return;
		}
		money -= p.price;			// ���� ������ ������ ��ǰ�� ������ ����
		bonusPoint += p.bonusPoint; // ��ǰ�� ����Ʈ�� �߰��Ѵ�
		System.out.println(p + "��/�� �����ϼ̽��ϴ�");		// p�� p.toString()�� ����
	}
}

public class Ex7_8 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1()); 	// Product p = new Tv1; b.buy(p);
		b.buy(new Computer());
		
		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ����Ʈ�� " + b.bonusPoint + "���Դϴ�.");
	}

}
