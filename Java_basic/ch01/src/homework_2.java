// Song Ŭ���� ����
class Song {
	String title; 		// �뷡 ����
	String artist;		// ����
	String album;		// �ٹ�
	int year;			// �뷡�� ��ǥ�� ����
	
	Song() { 	// �⺻ ������
		
	}

	Song(String a, String b, String c, int d) {		// �Ű������� �ִ� ������
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