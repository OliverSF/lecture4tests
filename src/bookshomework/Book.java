package bookshomework;

public class Book {
	
	//private instance variable
	private String title;
	
	//constructor
	public Book() {
		title = "unnassigned";
	}
	
	//methods (public setters and getters)
	public void setTitle(String t) {
		title = t;
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public void saying() {
		if (title.equals("Harry Potter")) {
		System.out.printf("I thought %s ", getTitle() + " was amazing!");
		}	
		else {
			System.out.printf("I thought %s ", getTitle() + " was okay");
		}
	}
	
	
}
