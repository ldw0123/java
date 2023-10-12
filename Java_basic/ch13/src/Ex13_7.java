// 데몬 쓰레드
public class Ex13_7 implements Runnable { 		// Runnable 인터페이스 구현
	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new Ex13_7()); 	// 생성자 Thread(Runnable r). 쓰레드 생성
		t.setDaemon(true); 		// 이 부분이 없으면 종료되지 않는다. 쓰레드를 데몬쓰레드로 변경
		t.start();

		for(int i = 1; i <= 15; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}	
			System.out.println(i);

			if(i == 5) autoSave = true; 	// 5초가 되기 전까진 autoSave가 false이라서 autoSave()가 호출되지 않음
		}
		System.out.println("프로그램을 종료합니다");
	}


	public void run() {
		while(true) { 		// 무한루프
			try {
				Thread.sleep(3*1000); 	// 3초마다
			} catch(InterruptedException e) {}

			// autoSave의 값이 true이면 autoSave()를 호출한다
			if(autoSave) autoSave(); 	// 조건문
		}
	}

	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}