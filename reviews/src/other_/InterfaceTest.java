package other_;

interface Runnable
{
	void turnOn();
	void turnOff();
	
	default void repair()	//오버라이딩 선택 가능
	{
		System.out.println("제품을 수리합니다.");
	}
	static void reset()	//reset 메서드는 오버라이딩할 필요가 없다.
	{
		System.out.println("공장초기화합니다.");
	}
}

interface RemoteControllable extends Runnable
{
	void remoteOn();
	void remoteOff(); //default 오버라이딩 할 필요 없어서 쓰지 않았다.
}

class Electric implements Runnable
{
	@Override
	public void turnOn() //interface에는 public abstract가 생략되어있다. 범위를 같거나 더 크게 잡아준다.
	{
		System.out.println("Com를 킵니다.");
	}
	@Override
	public void turnOff()
	{
		System.out.println("Com를 끕니다.");
	}
}

class Tv extends Electric //구현
{
	@Override
	public void turnOn() //interface에는 public abstract가 생략되어있다. 범위를 같거나 더 크게 잡아준다.
	{
		System.out.println("TV를 킵니다.");
	}
	@Override
	public void turnOff()
	{
		System.out.println("TV를 끕니다.");
	}
}

class Computer extends Electric
{
	@Override
	public void turnOn() //interface에는 public abstract가 생략되어있다. 범위를 같거나 더 크게 잡아준다.
	{
		System.out.println("Com를 킵니다.");
	}
	@Override
	public void turnOff()
	{
		System.out.println("Com를 끕니다.");
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Tv tv = new Tv();
			Computer com = new Computer();
			
			tv.turnOff(); tv.turnOn(); tv.repair();
			com.turnOff(); com.turnOn(); com.repair();
			Runnable.reset(); //static 메서드는 해당 객체를 먼저 쓴 후 호출
			//tv.reset(); 안됌..
		
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
