package polymorphism_;

class Person
{
	 String name="사람";
	 
	 void whoami()
	 {
		 System.out.println("im 사람");
	 }
}
class Student extends Person
{
	int num = 7;

	void work()
	{
		System.out.println("공부중");
	}
}

public class UpcastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p;
		Student s = new Student();
		
		p = s; //Student 객체가 Person 객체로 업캐스팅 되었다..Person 멤버만 사용 할 수 있다.  
	}

}
