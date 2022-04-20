package midterm_prac;

public class Book {

	String bookName;
	String publisher;
	int price;
	int bookID;
	
	public Book(String bookName, String publisher, int price) {
		super();
		this.bookName = bookName;
		this.publisher = publisher;
		this.price = price;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
}
