package mysql_;

import java.util.ArrayList;
import java.util.Scanner;

public  class PersonDAO {

	ArrayList<Person> person = new ArrayList<>();

	Scanner sc = new Scanner(System.in);
	
	public void insertPerson()
	{
		
		System.out.println("����� ������ �Է��ϼ���");
		String name = sc.next();
		System.out.println("name : "+name);
		System.out.println("����� ���̸� �Է��ϼ���");
		int age = sc.nextInt();
		System.out.println("name: "+name+" age : "+age);
		System.out.println("�޴�����ȣ�� �Է��ϼ���");
		String phone = sc.next();
		
		person.add(new Person(name,age,phone));
		System.out.println("��ϵǾ����ϴ�.");
		
	}

	public void deletePerson()
	{
		
		System.out.println("������ ������ �Է��ϼ���");
		for(Person p : person)
		{
			System.out.println(p.getName());
		}
		String d_name = sc.next();
		
		for(int i=0; i<person.size(); i++)
		{
			try {
				if((person.get(i).name).equals(d_name))
				{
					System.out.println("���� �Ͻðڽ��ϱ�? 1: y   2: n");
					int menu = sc.nextInt();
					switch(menu)
					{
						case 1:{person.remove(i);System.out.println("�����Ǿ����ϴ�."); break;}
						case 2:{System.out.println("��ҵǾ����ϴ�.");break;}
						default:{System.out.println("�߸��� �Է�");break;}
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("�߸��� �Է�");
			}
		}
		
	}
	
	public void updatePerson() {
		

		System.out.println("�����ϽǺ� ������ �Է��ϼ���");
		for(Person p : person)
		{
			System.out.println(p.getName());
		}
		String u_name = sc.next();
		for(int i=0; i<person.size(); i++)
		{
			if((person.get(i).name).equals(u_name))
			{
				System.out.println("������ ���� �Է�");
				int u_age = sc.nextInt();
				System.out.println("������ �޴�����ȣ �Է�");
				String u_phone = sc.next();
				person.get(i).name = u_name;
				person.get(i).age = u_age;
				person.get(i).phone = u_phone;
				System.out.println("�����Ϸ�");
			}
		}
	}
	
	public void showList()
	{
		for(Person p : person)
		{
			System.out.println(p.getName()+" "+p.getAge()+" "+p.getPhone());
		}
	}
		
}

