package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue bookQueue = new BookShelf();
		bookQueue.enQueu("태백산맥1");
		bookQueue.enQueu("태백산맥2");
		bookQueue.enQueu("태백산맥3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());

	}

}
