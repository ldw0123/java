package p220224;

public class SutdaCard {

	int num = 10;            //�ʵ弱�� �� �ʱ�ȭ
	boolean isKwang;        //�ʵ弱�� 

	public SutdaCard() {    //����� �⺻������ 
		this(1, true);        //�ٸ� ����� �����ڸ� ȣ���� 
	}

	public SutdaCard(int i, boolean isKwang) { //����� ������
		this.num = i;            // �Ű������� �ʵ忡 �Ҵ���
		this.isKwang = isKwang;    // �Ű������� �ʵ忡 �Ҵ���
	}

	String info() {// �޼ҵ� ���� 
		if (isKwang == false) {    
			// ���� isKwang�ʵ��� ���� ���� �� ���� ��ȯ���� ����
			String result = num + "";
			return result;
		} else {
			String result = num + "K";
			return result;
		}
	}

}
