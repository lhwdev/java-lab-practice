package week04;


public class Library {
	private final Book[] books;
	
	public Library() {
		books = new Book[10];
		for(int i = 0; i < books.length; i++) {
			books[i] = new Book();
		}
	}
	
	// Could not meet required method names, as required name is 'return' which is keyword
	// renamed both 'borrow' and 'return' -> 'borrowBook', 'returnBook' for consistency
	void borrowBook(int index) {
		if(index <= 0 || index > books.length) {
			System.out.println("Error: Invalid book number.");
			return;
		}
		
		if(books[index - 1].borrowSelf()) {
			System.out.println("Book " + index + " borrowed.");
		} else {
			System.out.println("Error: Book " + index +" is already borrowed.");
		}
	}
	
	void returnBook(int index) {
		if(index <= 0 || index > books.length) {
			System.out.println("Error: Invalid book number.");
			return;
		}
		
		if(books[index - 1].returnSelf()) {
			System.out.println("Book " + index + " returned.");
		} else {
			System.out.println("Error: Book " + index + " is already returned.");
		}
	}
}
