package week04;


public class Main {
	public static void main(String[] args) {
		Library lib = new Library();
		
		lib.borrowBook(3);
		lib.borrowBook(3);
		lib.returnBook(3);
		lib.returnBook(3);
		lib.borrowBook(11);
	}
}
