// ���̺귯�� Ŭ����1: �θ�

package p220222;

public class Product {
	
	int price;							// �ʵ� ����
	int bonusPoint;
	
	public Product() {					// �⺻ �����ڸ� ��������� ����
										// �̿� ���� JAVA�� �ڵ������� �����ϴ� ���� '������ ����'�̶�� ��
	}
	
	public Product(int price) { 		// ������ ����
		this.price = price;
		bonusPoint = (int)(price/10.0);
		
	}
}
