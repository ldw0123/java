// �߻�Ŭ������ �߻�޼���

abstract class Player {				// �߻� Ŭ���� (�̿ϼ� Ŭ����, �̿ϼ� ���赵)
	abstract void play(int pos);	// �߻� �޼���	( �̿ϼ� �޼���. ����θ� �ְ� ������{}�� ���� �޼���)
	abstract void stop();			// �߻� �޼���
}

// �߻� Ŭ������ ����� ���� �ϼ��ؾ� ��ü ���� ����
class AudioPlayer extends Player {  // �ϼ� Ŭ����
	void play(int pos) { System.out.println(pos + "��ġ���� play�մϴ�."); }			// �ϼ� �޼���
	void stop() { System.out.println("����� ����ϴ�."); }					// �ϼ� �޼���
}

public class PlayerTest {

	public static void main(String[] args) {
//		Player p = new Player(); 	// �߻� Ŭ������ ��ü�� ����. ����
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer();		// ������
		ap.play(100);
		ap.stop();
	}

}
