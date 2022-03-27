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
	}
	
	
	
	
	public static void addPerson()
	{
		System.out.println("이름입력");
		String name = input.next(); 
		System.out.println("나이입력");
		int age = input.nextInt();
		if(count >= 10)
		{
			System.out.println("등록 리스트(10)가 꽉찼습니다. 등록 불가합니다.");
		}
		else 
		{
			persons[count] = new Person(name,age);
			System.out.println("등록 완료되었습니다.");
			count++;
		}
	}
	
	
	
	
	public static void modifyAge()
	{
		System.out.println("수정할 사람의 이름을 입력하세요");
		for(int i=0; i<count; i++)
		{
			System.out.println(persons[i]);
		}
		
		String fName = input.next();
			for (int i=0; i<count; i++)
			{
				if(persons[i].getName().equals(fName))
				{
					System.out.println("수정할 나이를 입력하세요");
					int cAge = input.nextInt();
					persons[i].setAge(cAge);
					System.out.println("수정 완료 되었습니다.");
				}
				else 
				{
					System.out.println("해당 정보가 없습니다.");
					break;
				};
			}
		}
	
	
	
	public static void seeList()
	{
		System.out.println("현재 등록된 사람 리스트를 보여줍니다.");
		for(int i=0; i<count; i++)
		{
			System.out.println(persons[i]);
		}
	}	
}