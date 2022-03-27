package _0311;

import java.util.*;
import java.util.Scanner;


public class PersonManager3 {

	static ArrayList<Person> person = new ArrayList<Person>();
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		callMenu();
		
	}
		public static void callMenu()
		{
			while(true)
			{
				try {
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
				catch (InputMismatchException e)
				{
					System.out.println("Input type error");
					break;
				}
			}
		}
	
	
	public static void addPerson()
	{
		System.out.println("�̸��Է�");
		String name = input.next(); 
		System.out.println("�����Է�");
		int age = input.nextInt();
		person.add(new Person(name,age));
		System.out.println("��� �Ϸ�Ǿ����ϴ�.");
	}
	
	public static void modifyAge()
	{
		System.out.println("������ ����� �̸��� �Է��ϼ���");
		for(int i=0; i<person.size(); i++)
		{
			System.out.println(person.get(i).getName());
		}
		String fName = input.next();
		for(int i=0; i<person.size(); i++)
		{
			if(fName.equals(person.get(i).getName()))
			{
				System.out.println("������ ���̸� �Է��ϼ���");
				int cAge = input.nextInt();
				person.get(i).setAge(cAge);
				System.out.println("���� �Ϸ� �Ǿ����ϴ�.");
			}
		}
	}
	
	public static void seeList()
	{
		System.out.println("���� ��ϵ� ��� ����Ʈ�� �����ݴϴ�.");
		
//		for(Person a : person) foreach������ ���� seeLIST
//		{
//			System.out.println(a);
//		}
		Iterator<Person> it = person.iterator(); //iterator�� ���� seeList
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}
}
