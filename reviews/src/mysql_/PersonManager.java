package mysql_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonManager {
	
	
	
	public static void callMenu()
	{
		boolean flag = true;
		PersonDAO p = new PersonDAO();
		Scanner sc = new Scanner(System.in);
		
		try {
			while(flag)
			{
				System.out.println("PersonManager�Դϴ�. �޴��� �����ϼ���");
				System.out.println("1. ��� 2. ���� 3. ���� 4. ����Ʈ 5. ����");
				int menu = sc.nextInt();
				
				switch(menu)
				{
					case 1:{p.insertPerson();break;}
					case 2:{p.deletePerson();break;}
					case 3:{p.updatePerson();break;}
					case 4:{p.showList();break;}
					case 5:{System.out.println("�����մϴ�.");flag = false;break;}
					default:{System.out.println("�߸��� �Է��Դϴ�.");break;}
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է����ּ���");
			callMenu();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		callMenu();
		
		
	}

}
