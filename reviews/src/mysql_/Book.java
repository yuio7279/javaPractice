package mysql_;

public class Book {

	int bookID;
	String bookName;
	String publisher;
	int price;
	
	public Book (String bookName, String publisher, int price)
	{
		this.bookName = bookName;
		this.publisher = publisher;
		this.price = price;
	}
	
	
	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
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

	
}
