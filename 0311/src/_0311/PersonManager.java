package _0311;

import java.util.Scanner;

class Person
{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "이름:"+name+", 나이:"+age;
	}
}


public class PersonManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person p = new Person("홍길동",21);
		p.setAge(20);
		System.out.println(p);
	}

}
