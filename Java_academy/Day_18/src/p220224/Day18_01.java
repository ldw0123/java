package p220224;

public class Day18_01 {

	public static void main(String[] args) {

		SutdaCard card1 = new SutdaCard(3, false);
		//����� �����ڸ� �̿��Ͽ� ��ü ����
		SutdaCard card2 = new SutdaCard();
		//����� �⺻ �����ڸ� �̿��Ͽ� ��ü ����
		System.out.println(card1.info());
		// card1���������� ����Ű�� ��ü�� �ɹ��޼ҵ带 ȣ����
		System.out.println(card2.info());
		// card2���������� ����Ű�� ��ü�� �ɹ��޼ҵ带 ȣ����

	}

}
