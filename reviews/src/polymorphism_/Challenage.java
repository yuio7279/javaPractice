package polymorphism_;

class Girl
{
	protected String name="�ʺ���";
	
	String show()
	{
		return "�ڹ� �ʺ����� �׳�";
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
	public GoodGirl(String name) { //�����ڴ� �θ� 
		super(name);		//super�� �θ�ü�� �����ڿ� �����Ѵ�.
	}
	@Override
	String show()
	{
		return"�ڹٸ� �� �ƴ� �׳�";
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
		return "�ڹٸ� ���� �� �ƴ� �׳�!";
	}
}








public class Challenage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Girl g1 = new Girl();
//		
//		Girl g2 = new GoodGirl("��°");
//		
//		BestGirl gg = new BestGirl("��°"); //�帧�� ���� 3->2->1->name�ʵ尡 ��� ��°�� �ٲ��. ���� 2��° BestGirlŬ������ name ���� ��°�̴�
//		
//		System.out.println(g1.name);
//		System.out.println(g2.name);
//		System.out.println(gg.name);
//		//g2.show(); //Girl Ÿ�Կ��� show �޼��尡 ���⶧��
//		gg.show();
		
		Girl[] girls = {new Girl("��"),new GoodGirl("��"),new BestGirl("��")};
		
		for(Girl g : girls)
			System.out.println(String.format("%s �� �Ƿ��� %s �Դϴ�.",g.name,g.show()));
		
		
	}

}
