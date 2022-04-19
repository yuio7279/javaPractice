package mysql_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookManager {
	
	
	
	public static void callMenu()
	{
		boolean flag = true;
		BookDAO b = new BookDAO();
		Scanner sc = new Scanner(System.in);
		
		try {
			while(flag)
			{
				System.out.println("BookManager입니다. 메뉴를 선택하세욧");
				System.out.println("1. 등록 2. 삭제 3. 수정 4. 리스트 5. 종료");
				int menu = sc.nextInt();
				
				switch(menu)
				{
					case 1:{b.insertBook();break;}
					case 2:{b.deleteBook();break;}
//					case 3:{b.updateBook();break;}
					case 4:{b.showList();break;}
					case 5:{System.out.println("종료합니다.");flag = false;break;}
					default:{System.out.println("잘못된 입력입니다.");break;}
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해주세요");
			callMenu();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		callMenu();
		
		
	}

}
