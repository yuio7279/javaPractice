package mysql_;

public class Person {
	String name;
	String phone;
	int age;
	
	public Person (String name, int age, String phone){
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
