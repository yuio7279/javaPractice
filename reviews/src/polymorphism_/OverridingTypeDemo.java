package polymorphism_;

class Vehicle
{
	String name ="탈것"; //필드는 상속되지 않는다. 
	
	void whoami()
	{
		System.out.println("나는 탈 것입니다.");
	}
	
	static void move() //static 메서드이므로 자식클래스에 상속되지 않는다.
	{
		System.out.println("이동하는 중 입니다.");
	}
}

class Car extends Vehicle
{
	String name="자동차";
	
	@Override
	void whoami()
	{
		System.out.println("나는 자동차 입니다.");
	}
	
	static void move() //Car 객체일 경우에만 line:28의 move메서드를 호출 할 수 있다.
	{
		System.out.println("달리고 있습니다!");
	}
}

public class OverridingTypeDemo { //동적바인딩? --> 실행단계에서 변수(객체)와 실제 데이터(메서드)를 연결하고 확인하여 실행하는 것

	public static void main(String[] args) {
		
		Vehicle v = new Car(); //Car객체를 Vehicle객체타입으로 업캐스팅 하였다..Vehicle내부의 멤버들을 호출 할 수 있다.
		System.out.println(v.name); //오버라이딩 될 수 없기때문에 Vehicle객체의 필드가 호출 된다.
		v.whoami();		//오버라이딩 된 메서드
		v.move();		//오버라이딩 될 수 없기 때문에 Vehicle객체의 메서드가 호출 된다.
		
		Car c = (Car) v;	//v의 실제 객체는 Car객체이기때문에 내부에 해당 데이터들이 들어있다. 다운캐스팅을 하면 숨겨져있던 데이터들이 나온다.
		System.out.println(c.name);
		c.whoami();
		c.move();
	}
	
}
