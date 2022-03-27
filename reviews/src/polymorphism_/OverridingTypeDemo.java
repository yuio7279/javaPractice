package polymorphism_;

class Vehicle
{
	String name ="Ż��"; //�ʵ�� ��ӵ��� �ʴ´�. 
	
	void whoami()
	{
		System.out.println("���� Ż ���Դϴ�.");
	}
	
	static void move() //static �޼����̹Ƿ� �ڽ�Ŭ������ ��ӵ��� �ʴ´�.
	{
		System.out.println("�̵��ϴ� �� �Դϴ�.");
	}
}

class Car extends Vehicle
{
	String name="�ڵ���";
	
	@Override
	void whoami()
	{
		System.out.println("���� �ڵ��� �Դϴ�.");
	}
	
	static void move() //Car ��ü�� ��쿡�� line:28�� move�޼��带 ȣ�� �� �� �ִ�.
	{
		System.out.println("�޸��� �ֽ��ϴ�!");
	}
}

public class OverridingTypeDemo { //�������ε�? --> ����ܰ迡�� ����(��ü)�� ���� ������(�޼���)�� �����ϰ� Ȯ���Ͽ� �����ϴ� ��

	public static void main(String[] args) {
		
		Vehicle v = new Car(); //Car��ü�� Vehicle��üŸ������ ��ĳ���� �Ͽ���..Vehicle������ ������� ȣ�� �� �� �ִ�.
		System.out.println(v.name); //�������̵� �� �� ���⶧���� Vehicle��ü�� �ʵ尡 ȣ�� �ȴ�.
		v.whoami();		//�������̵� �� �޼���
		v.move();		//�������̵� �� �� ���� ������ Vehicle��ü�� �޼��尡 ȣ�� �ȴ�.
		
		Car c = (Car) v;	//v�� ���� ��ü�� Car��ü�̱⶧���� ���ο� �ش� �����͵��� ����ִ�. �ٿ�ĳ������ �ϸ� �������ִ� �����͵��� ���´�.
		System.out.println(c.name);
		c.whoami();
		c.move();
	}
	
}
