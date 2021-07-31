package array;

public class book1Test {

	public static void main(String[] args) {
		StudentBook studentBookLee = new StudentBook(1001, "Lee");
		studentBookLee.addBook("태백산맥1", "조정래");
		studentBookLee.addBook("태백산맥2", "조정래");
		
		StudentBook studentBookKim = new StudentBook(1002, "Kim");
		studentBookKim.addBook("토지1", "박경리");
		studentBookKim.addBook("토지2", "박경리");
		studentBookKim.addBook("토지3", "박경리");
		
		StudentBook studentBookCho = new StudentBook(1003, "Cho");
		studentBookCho.addBook("해리포터1", "조앤 롤링");
		studentBookCho.addBook("해리포터2", "조앤 롤링");
		studentBookCho.addBook("해리포터3", "조앤 롤링");
		studentBookCho.addBook("해리포터4", "조앤 롤링");
		studentBookCho.addBook("해리포터5", "조앤 롤링");
		
		studentBookLee.showInfo();
		studentBookKim.showInfo();
		studentBookCho.showInfo();
		

	}

}
