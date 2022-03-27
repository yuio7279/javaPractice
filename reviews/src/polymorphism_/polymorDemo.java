package polymorphism_;

class SportsCar extends Car
{
	@Override
	void whoami()
	{
		System.out.println("나는 스포츠 자동차!");
	}
}


public class polymorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle[] vehicles = new Vehicle[2]; //Vehicle 타입으로 배열을 선언하였다.
		
		vehicles[0] = new Car(); //해당 배열에 Car타입 업캐스트 하였다.
		vehicles[1] = new SportsCar();
		
		for(Vehicle v : vehicles)
		{
			v.whoami();
		}
		
		//또 다른 선언법
		Vehicle[] vehicles2 = {new Car(),new SportsCar()};
		for (Vehicle v2 : vehicles2)
		{
			v2.whoami();
		}
		
		
		
		
		
		
	}

}
