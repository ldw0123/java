// 싱글쓰레드
public class Ex13_2 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i < 1000; i++)
			System.out.printf("%s", new String("-"));
		
		System.out.println("소요시간1: " + (System.currentTimeMillis() - startTime) + "ms");
		
		for(int i=0; i < 1000; i++)
			System.out.printf("%s", new String("|"));
		
		System.out.println("소요시간2: " + (System.currentTimeMillis() - startTime)  + "ms");
	}
}
