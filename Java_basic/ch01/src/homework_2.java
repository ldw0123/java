// Song 클래스 구현
class Song {
	String title; 		// 노래 제목
	String artist;		// 가수
	String album;		// 앨범
	int year;			// 노래가 발표된 연도
	
	Song() { 	// 기본 생성자
		
	}

	Song(String a, String b, String c, int d) {		// 매개변수가 있는 생성자
		title = a;
		artist = b;
		album = c;
		year = d;
	}

	void show() {
	    System.out.println(title + " " + artist + " " + album + " " + year);
	}
	
}



public class homework_2 {

	public static void main(String[] args) {
		Song s1 = new Song();
		s1.title = "LoveDive";
		s1.artist = "IVE";
		s1.album = "LD";
		s1.year = 2022;
		
		s1.show();
		
		Song s2 = new Song("Blueming", "IU", "LovePoem", 2019);
		System.out.println(s2.title + " " + s2.artist + " " + s2.album + " " + s2.year);

	}

}