package mysql_;

import java.util.ArrayList;
import java.util.Scanner;

public  class PersonDAO {

	ArrayList<Person> person = new ArrayList<>();

	Scanner sc = new Scanner(System.in);
	
	public void insertPerson()
	{
		
		System.out.println("등록할 성함을 입력하세요");
		String name = sc.next();
		System.out.println("name : "+name);
		System.out.println("등록할 나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("name: "+name+" age : "+age);
		System.out.println("휴대폰번호를 입력하세요");
		String phone = sc.next();
		
		person.add(new Person(name,age,phone));
		System.out.println("등록되었습니다.");
		
	}

	public void deletePerson()
	{
		
		System.out.println("삭제할 성함을 입력하세요");
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
					System.out.println("삭제 하시겠습니까? 1: y   2: n");
					int menu = sc.nextInt();
					switch(menu)
					{
						case 1:{person.remove(i);System.out.println("삭제되었습니다."); break;}
						case 2:{System.out.println("취소되었습니다.");break;}
						default:{System.out.println("잘못된 입력");break;}
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("잘못된 입력");
			}
		}
		
	}
	
	public void updatePerson() {
		

		System.out.println("수정하실분 성함을 입력하세요");
		for(Person p : person)
		{
			System.out.println(p.getName());
		}
		String u_name = sc.next();
		for(int i=0; i<person.size(); i++)
		{
			if((person.get(i).name).equals(u_name))
			{
				System.out.println("수정할 나이 입력");
				int u_age = sc.nextInt();
				System.out.println("수정할 휴대폰번호 입력");
				String u_phone = sc.next();
				person.get(i).name = u_name;
				person.get(i).age = u_age;
				person.get(i).phone = u_phone;
				System.out.println("수정완료");
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

