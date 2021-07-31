package array;

import java.util.ArrayList;

public class StudentBook {
	int studentID;
	String studentName;
	ArrayList<Book1> bookList;
	
	public StudentBook(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		bookList = new ArrayList<Book1>();
	}
	
	public void addBook(String name, String author) {
		Book1 book = new Book1(name, author);
		
		bookList.add(book);
	}
	
	public void showInfo() {
		System.out.print(studentName + "학생이 읽은 책은 : " );
		for(Book1 book1 : bookList) {
			System.out.print(book1.getName() + " ");
		}
		System.out.println("입니다");
	}
	
	
	
}
