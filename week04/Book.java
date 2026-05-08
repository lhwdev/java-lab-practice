package week04;


public class Book {
	private boolean borrowed = false;
	
	
	public Book() {}
	
	
	boolean borrowSelf() {
		if(borrowed) return false;
		
		borrowed = true;
		return true;
	}
	
	boolean returnSelf() {
		if(!borrowed) return false;
		
		borrowed = false;
		return true;
	}
}
