package other_;

interface Runnable
{
	void turnOn();
	void turnOff();
	
	default void repair()	//�������̵� ���� ����
	{
		System.out.println("��ǰ�� �����մϴ�.");
	}
	static void reset()	//reset �޼���� �������̵��� �ʿ䰡 ����.
	{
		System.out.println("�����ʱ�ȭ�մϴ�.");
	}
}

interface RemoteControllable extends Runnable
{
	void remoteOn();
	void remoteOff(); //default �������̵� �� �ʿ� ��� ���� �ʾҴ�.
}

class Electric implements Runnable
{
	@Override
	public void turnOn() //interface���� public abstract�� �����Ǿ��ִ�. ������ ���ų� �� ũ�� ����ش�.
	{
		System.out.println("Com�� ŵ�ϴ�.");
	}
	@Override
	public void turnOff()
	{
		System.out.println("Com�� ���ϴ�.");
	}
}

class Tv extends Electric //����
{
	@Override
	public void turnOn() //interface���� public abstract�� �����Ǿ��ִ�. ������ ���ų� �� ũ�� ����ش�.
	{
		System.out.println("TV�� ŵ�ϴ�.");
	}
	@Override
	public void turnOff()
	{
		System.out.println("TV�� ���ϴ�.");
	}
}

class Computer extends Electric
{
	@Override
	public void turnOn() //interface���� public abstract�� �����Ǿ��ִ�. ������ ���ų� �� ũ�� ����ش�.
	{
		System.out.println("Com�� ŵ�ϴ�.");
	}
	@Override
	public void turnOff()
	{
		System.out.println("Com�� ���ϴ�.");
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Tv tv = new Tv();
			Computer com = new Computer();
			
			tv.turnOff(); tv.turnOn(); tv.repair();
			com.turnOff(); com.turnOn(); com.repair();
			Runnable.reset(); //static �޼���� �ش� ��ü�� ���� �� �� ȣ��
			//tv.reset(); �ȉ�..
		
			System.out.println("--------------");
			Electric[] trics = new Electric[2];
			trics[0] = new Tv();
			trics[1] = new Computer();
			
			for(Electric e : trics)
			{
				e.turnOff(); e.turnOn(); e.repair();
			}
			
	}

}
