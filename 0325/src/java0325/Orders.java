package java0325;

public class Orders {

	private int orderID;
	private int custID;
	private int bookID;
	private int salePrice;
	private String orderDate;
	public Orders(int custID, int bookID, int salePrice) {
		super();
		this.custID = custID;
		this.bookID = bookID;
		this.salePrice = salePrice;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public int getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}
	public String getOrderDate() {
		return orderDate;
	}
	
}
