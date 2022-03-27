package java0325;

public class Customer {
	private int custID;
	private String name;
	private String address;
	private String phone;
	public Customer( String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
			
		String pphone =null;
		if(phone!=null)
		{
			String[] splitPhone = { phone.substring(0, 3), phone.substring(3, 7), phone.substring(7, 11) };
			pphone =splitPhone[0] + "-" + splitPhone[1] + "-" + splitPhone[2]; 
		}
		this.phone = pphone;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
