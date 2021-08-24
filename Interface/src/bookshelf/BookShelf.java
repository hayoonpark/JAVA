package bookshelf;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueu(String title) {
		shelf.add(title);
		
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

}
