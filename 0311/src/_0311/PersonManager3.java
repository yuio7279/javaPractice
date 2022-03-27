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
					System.out.println("1.인원추가 2.나이수정 3.전체리스트 4.종료");
					System.out.println("--------------------------------------");
					System.out.println("메뉴?");
					int ans = input.nextInt();
					
					switch(ans)
					{
					case 1:addPerson();break;
					case 2:modifyAge();break;
					case 3:seeList();break;
					case 4:System.out.println("프로그램종료");break;
					default: {System.out.println("에러");break;}
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
		System.out.println("이름입력");
		String name = input.next(); 
		System.out.println("나이입력");
		int age = input.nextInt();
		person.add(new Person(name,age));
		System.out.println("등록 완료되었습니다.");
	}
	
	public static void modifyAge()
	{
		System.out.println("수정할 사람의 이름을 입력하세요");
		for(int i=0; i<person.size(); i++)
		{
			System.out.println(person.get(i).getName());
		}
		String fName = input.next();
		for(int i=0; i<person.size(); i++)
		{
			if(fName.equals(person.get(i).getName()))
			{
				System.out.println("수정할 나이를 입력하세요");
				int cAge = input.nextInt();
				person.get(i).setAge(cAge);
				System.out.println("수정 완료 되었습니다.");
			}
		}
	}
	
	public static void seeList()
	{
		System.out.println("현재 등록된 사람 리스트를 보여줍니다.");
		
//		for(Person a : person) foreach문으로 만든 seeLIST
//		{
//			System.out.println(a);
//		}
		Iterator<Person> it = person.iterator(); //iterator로 만든 seeList
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}
}
