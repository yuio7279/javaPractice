package polymorphism_;

class Person
{
	 String name="���";
	 
	 void whoami()
	 {
		 System.out.println("im ���");
	 }
}
class Student extends Person
{
	int num = 7;

	void work()
	{
		System.out.println("������");
	}
}

public class UpcastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p;
		Student s = new Student();
		
		p = s; //Student ��ü�� Person ��ü�� ��ĳ���� �Ǿ���..Person ����� ��� �� �� �ִ�.  
	}

}
