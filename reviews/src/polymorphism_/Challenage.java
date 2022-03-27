package polymorphism_;

class Girl
{
	protected String name="초보자";
	
	String show()
	{
		return "자바 초보자인 그녀";
	}
//	Girl()
//	{
//		
//	}
	Girl(String name)
	{
		this.name = name;
	}
}
class GoodGirl extends Girl
{
	public GoodGirl(String name) { //생성자는 부모 
		super(name);		//super는 부모객체의 생성자에 접근한다.
	}
	@Override
	String show()
	{
		return"자바를 잘 아는 그녀";
	}
}
class BestGirl extends GoodGirl
{
	BestGirl(String name)
	{
		super(name);
	}
	@Override
	String show()
	{
		return "자바를 정말 잘 아는 그녀!";
	}
}








public class Challenage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Girl g1 = new Girl();
//		
//		Girl g2 = new GoodGirl("둘째");
//		
//		BestGirl gg = new BestGirl("셋째"); //흐름을 보면 3->2->1->name필드가 모두 셋째로 바뀐다. 따라서 2번째 BestGirl클래스의 name 도한 셋째이다
//		
//		System.out.println(g1.name);
//		System.out.println(g2.name);
//		System.out.println(gg.name);
//		//g2.show(); //Girl 타입에는 show 메서드가 없기때문
//		gg.show();
		
		Girl[] girls = {new Girl("김"),new GoodGirl("이"),new BestGirl("박")};
		
		for(Girl g : girls)
			System.out.println(String.format("%s 의 실력은 %s 입니다.",g.name,g.show()));
		
		
	}

}
