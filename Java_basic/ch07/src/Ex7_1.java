// ���

class Tv {
	boolean power; 		// �������� (on/off)
	int channel;		// ä��
	void power() 		{ 	power = !power; }
	void channelUp()	{	++channel;		}
	void channelDown()  { 	--channel;		}
}

// �θ� Ŭ���� Tv�� ����� �ڽ� Ŭ���� SmartTv�� ���
class SmartTv extends Tv {	// SmartTv�� Tv�� ĸ��(�ڸ�)�� �����ִ� ����� �߰�
	boolean caption; 		// ĸ�ǻ��� (on/off)
	void displayCaption(String text) {
		if (caption) {		// ĸ�� ���� on(true)�� ���� text�� ���� �ش�.
			System.out.println(text);
		}
	}
}

public class Ex7_1 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;				// ���� Ŭ�����κ��� ��ӹ��� ���
		stv.channelUp();				// ���� Ŭ�����κ��� ��ӹ��� ���
		System.out.println(stv.channel);		// ä�� ���
		stv.displayCaption("Hello, World"); 	// ĸ���� true�� �ƴϱ� ������ ��µ��� ����
		stv.caption = true;						// ĸ��(�ڸ�)����� �Ҵ�.
		stv.displayCaption("Hello, World");		// ĸ���� ��µ�
	}

}
