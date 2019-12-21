package Chapter5;

public class Book {
	private String title;
	private String auther;
	private int publishYear;
	private boolean isBorrowed = true;
	
	// default constructor
	Book() {
		
	}
	
	// constructor three arguments
	Book(String title, String auther, int publishYear){
		this.title = title;
		this.auther = auther;
		this.publishYear = publishYear;
	}
	
	// getTitle
	String getTitle() {
		return title;
	}
	
	// getAuther
	String getAuther() {
		return auther;
	}
	
	// getPublishYear
	int getPublishYear() {
		return publishYear;
	}
	
	// borrow
	public void borrow() {
		isBorrowed = true;
	}
	
	// returnBack
	public void returnBack() {
		isBorrowed = false;
	}
	
	// isBorrowed
	public boolean isBorrowed() {
		return isBorrowed;
	}
	
	// toString
	public String toString() {
	 String status;
	 if(isBorrowed) {
		 status = "Not available to Borrow";
	
	 }else {
		 status = "Available to Borrowed";
	 }
		
		return ("Title: " + title + "\n" + " by " + auther + "--published " + publishYear + "\n" + "Status: " + status);
	}
}
