package polymorphism_;

class SportsCar extends Car
{
	@Override
	void whoami()
	{
		System.out.println("���� ������ �ڵ���!");
	}
}


public class polymorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle[] vehicles = new Vehicle[2]; //Vehicle Ÿ������ �迭�� �����Ͽ���.
		
		vehicles[0] = new Car(); //�ش� �迭�� CarŸ�� ��ĳ��Ʈ �Ͽ���.
		vehicles[1] = new SportsCar();
		
		for(Vehicle v : vehicles)
		{
			v.whoami();
		}
		
		//�� �ٸ� �����
		Vehicle[] vehicles2 = {new Car(),new SportsCar()};
		for (Vehicle v2 : vehicles2)
		{
			v2.whoami();
		}
		
		
		
		
		
		
	}

}
