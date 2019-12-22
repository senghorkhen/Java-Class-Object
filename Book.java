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
	public String isBorrowed() {
		 String status = "";
		 if(isBorrowed) {
			 status = "Not available";
		
		 }else {
			 status = "Available";
		 }
		 return status;
	}
	
	// toString
	public String toString() {
	
		isBorrowed();
		
		return ("Title: " + title + "\n" + " by " + auther + "--published " + publishYear + "\n" + "Status: " + isBorrowed() + "to Borrow");
	}
}
