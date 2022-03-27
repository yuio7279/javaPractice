package _0311;

import java.util.Scanner;


public class PersonManager2 {
	static int count = 0;
	static Scanner input = new Scanner(System.in);
	static Person[] persons = new Person[10];
	
	
	public static void main(String[] args) { 
		
		
		callMenu();	
		
		
	}
	
	
	
	
	
	public static void callMenu()
	{
		while(true)
		{
			System.out.println("--------------------------------------");
			System.out.println("1.�ο��߰� 2.���̼��� 3.��ü����Ʈ 4.����");
			System.out.println("--------------------------------------");
			System.out.println("�޴�?");
			int ans = input.nextInt();
			
			switch(ans)
			{
			case 1:addPerson();break;
			case 2:modifyAge();break;
			case 3:seeList();break;
			case 4:System.out.println("���α׷�����");break;
			default: {System.out.println("����");break;}
			}
		}
	}
	
	
	
	
	public static void addPerson()
	{
		System.out.println("�̸��Է�");
		String name = input.next(); 
		System.out.println("�����Է�");
		int age = input.nextInt();
		if(count >= 10)
		{
			System.out.println("��� ����Ʈ(10)�� ��á���ϴ�. ��� �Ұ��մϴ�.");
		}
		else 
		{
			persons[count] = new Person(name,age);
			System.out.println("��� �Ϸ�Ǿ����ϴ�.");
			count++;
		}
	}
	
	
	
	
	public static void modifyAge()
	{
		System.out.println("������ ����� �̸��� �Է��ϼ���");
		for(int i=0; i<count; i++)
		{
			System.out.println(persons[i]);
		}
		
		String fName = input.next();
			for (int i=0; i<count; i++)
			{
				if(persons[i].getName().equals(fName))
				{
					System.out.println("������ ���̸� �Է��ϼ���");
					int cAge = input.nextInt();
					persons[i].setAge(cAge);
					System.out.println("���� �Ϸ� �Ǿ����ϴ�.");
				}
				else 
				{
					System.out.println("�ش� ������ �����ϴ�.");
					break;
				};
			}
		}
	
	
	
	public static void seeList()
	{
		System.out.println("���� ��ϵ� ��� ����Ʈ�� �����ݴϴ�.");
		for(int i=0; i<count; i++)
		{
			System.out.println(persons[i]);
		}
	}	
}