// ���� ������
public class Ex13_7 implements Runnable { 		// Runnable �������̽� ����
	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new Ex13_7()); 	// ������ Thread(Runnable r). ������ ����
		t.setDaemon(true); 		// �� �κ��� ������ ������� �ʴ´�. �����带 ���󾲷���� ����
		t.start();

		for(int i = 1; i <= 15; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}	
			System.out.println(i);

			if(i == 5) autoSave = true; 	// 5�ʰ� �Ǳ� ������ autoSave�� false�̶� autoSave()�� ȣ����� ����
		}
		System.out.println("���α׷��� �����մϴ�");
	}


	public void run() {
		while(true) { 		// ���ѷ���
			try {
				Thread.sleep(3*1000); 	// 3�ʸ���
			} catch(InterruptedException e) {}

			// autoSave�� ���� true�̸� autoSave()�� ȣ���Ѵ�
			if(autoSave) autoSave(); 	// ���ǹ�
		}
	}

	public void autoSave() {
		System.out.println("�۾������� �ڵ�����Ǿ����ϴ�.");
	}
}