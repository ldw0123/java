// this()로 다른 생성자 호출
public class Book2 {
	String title;
	String author;
	void show()	{
		System.out.println(title + " " + author);
	}

	public Book2() {
		this(" ", " ");
		System.out.println("생성자 호출됨");

	}
	public Book2(String title) {
		this(title, "작자 미상");
	}
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public static void main(String[] args) {
		Book2 javaBook = new Book2("어린왕자", "생텍쥐페리");
		Book2 bible = new Book2("춘향전");
		Book2 emptyBook = new Book2();
		bible.show();
	}
}
