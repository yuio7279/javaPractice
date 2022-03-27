package polymorphism_;

public class DowncastInstanceOf {

	public static void main(String[] args) {
		
		Student s = new Student();
		Person p = new Person();
		
		System.out.println(s instanceof Person); //s는 Person 객체타입인가? 상속받았으므로 true
		System.out.println(p instanceof Student); //p는 Student 객체타입인가? false
		System.out.println("-----------------");
		
		
		downcast(s); //downcast메소드호출
		downcast(p);
		
		Person p2 = new Student(); //본래 Student 객체이므로 p2는 다운 캐스팅 성공이다.
		
		downcast(p2);
	}

	static void downcast(Object o) //자식객체로 선언이 되어있어야만 다운캐스팅이 가능하다 (원래객체타입으로 복귀하는 느낌)
	{
		if(o instanceof Student)
		{
			Student c = (Student) o;
			System.out.println("완료");
		}
		else
		{
			System.out.println("실패");
		}
	}
}
