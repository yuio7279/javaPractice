package polymorphism_;

public class DowncastInstanceOf {

	public static void main(String[] args) {
		
		Student s = new Student();
		Person p = new Person();
		
		System.out.println(s instanceof Person); //s�� Person ��üŸ���ΰ�? ��ӹ޾����Ƿ� true
		System.out.println(p instanceof Student); //p�� Student ��üŸ���ΰ�? false
		System.out.println("-----------------");
		
		
		downcast(s); //downcast�޼ҵ�ȣ��
		downcast(p);
		
		Person p2 = new Student(); //���� Student ��ü�̹Ƿ� p2�� �ٿ� ĳ���� �����̴�.
		
		downcast(p2);
	}

	static void downcast(Object o) //�ڽİ�ü�� ������ �Ǿ��־�߸� �ٿ�ĳ������ �����ϴ� (������üŸ������ �����ϴ� ����)
	{
		if(o instanceof Student)
		{
			Student c = (Student) o;
			System.out.println("�Ϸ�");
		}
		else
		{
			System.out.println("����");
		}
	}
}
