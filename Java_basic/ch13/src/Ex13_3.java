//  멀티 쓰레드
public class Ex13_3 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEx3_1 th1 = new ThreadEx3_1();
		th1.start();
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 1000; i++)
			System.out.printf("%s", new String(" - "));
		
		System.out.println("소요시간1: " + (System.currentTimeMillis() - Ex13_3.startTime) + "ms");
	}
}

class ThreadEx3_1 extends Thread {
	public void run() {
		for(int i = 0 ; i < 1000; i++)
			System.out.printf("%s", new String("|"));
		
		System.out.println("소요시간2:" + (System.currentTimeMillis() - Ex13_3.startTime) + "ms");
	}
}