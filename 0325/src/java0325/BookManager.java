package java0325;

import java.sql.*;
import java.util.Scanner;

public class BookManager {
	static Scanner in = new Scanner(System.in);
	static boolean flag = true;

	public static void callMenu() {
		BookDAO B = new BookDAO();
		CustomerDAO C = new CustomerDAO();
		OrdersDAO O = new OrdersDAO();
		while (flag) {
			try {
				System.out.println("안내메시지 >> 환영합니다.");
				System.out.println("----------------------------");
				System.out.println("1.도서관리 2.고객관리 3.주문관리 4.종료 :::-1.모든 데이터 삭제");
				System.out.println("----------------------------");
				int ans = in.nextInt();
				int ans2; // 2번째 메뉴
				System.out.println("메뉴 : " + ans);
				switch (ans) {
				case 1: { // 도서관리
					System.out.println("실행결과>> 도서 관리 안내 페이지");
					System.out.println("----------------------------");
					System.out.println("1.도서등록 2.도서수정 3.삭제 4.전체리스트 5.이전메뉴 ");
					System.out.println("----------------------------");

					ans2 = in.nextInt();
					switch (ans2) {
					case 1:
						String bName;
						String pub;
						int price;

						System.out.println("등록할 도서의 책이름 : ");
						bName = in.next();
						System.out.println("등록할 도서의 출판사명 : ");
						pub = in.next();
						System.out.println("등록할 도서의 가격 : ");
						price = in.nextInt();
						B.insertBook(new Book(bName, pub, price));
						break;

					case 2:
						B.showBookList(0);
						System.out.println("수정할 책ID 입력");
						int id = in.nextInt();
						System.out.println(id+"번의 변경하려는 책이름 입력 : ");
						bName = in.next();
						System.out.println(id + "번의 변경할 출판사명 입력 : ");
						pub = in.next();
						System.out.println(id+ "번의 변경할 가격 입력 : ");
						price = in.nextInt();
						B.updateBook(id ,bName, pub, price);
						break;

					case 3:
						B.showBookList(0);
						System.out.println("삭제할 도서의 아이디 : ");
						int bookID = in.nextInt();
						B.deleteBook(bookID);
						break;

					case 4:
						B.showBookList();
						break;

					case 5:
						System.out.println("이전메뉴로 돌아갑니다.");
						break;
					default:
						System.out.println("잘못된 양식입니다.");
						callMenu();
						break;
					}
				}
					break;

				case 2: { // 고객관리
					System.out.println("실행결과>> 고객 관리 안내 페이지");
					System.out.println("----------------------------");
					System.out.println("1.고객등록 2.고객수정 3.삭제 4.전체리스트 5.이전메뉴");
					System.out.println("----------------------------");
					ans2 = in.nextInt();
					switch (ans2) {
					case 1:
						String cName;
						String address;
						String phone;

						System.out.println("등록할 고객의 이름 : ");
						cName = in.next();
						System.out.println("등록할 고객의 주소: ");
						address = in.next();
						System.out.println("등록할 고객의 휴대폰 번호[01012345678] : ");
						phone = in.next();
						C.insertCust(new Customer(cName, address, phone));
						break;

					case 2:
						C.showCustList(0);
						System.out.println("수정할 ID : ");
						int cCustID = in.nextInt();
						System.out.println(cCustID + "번의 변경하려는 이름 : ");
						cName = in.next();
						System.out.println(cCustID + "번의 변경하려는 주소 : ");
						address = in.next();
						System.out.println(cCustID + "번의 변경하려는 휴대폰 번호[ex -01012345678] : ");
						phone = in.next();
						C.updateCust(cName, address, phone,cCustID);
						break;
					case 3:
						C.showCustList(0);
						System.out.println("삭제할 고객의 아이디 : ");
						int custID = in.nextInt();
						C.deleteCust(custID);
						break;
					case 4:
						C.showCustList();
						break;
					case 5:
						System.out.println("이전메뉴로 돌아갑니다.");
						break;
					default:
						System.out.println("잘못된 양식입니다.");
						callMenu();
						break;
					}
					break;

				}
				case 3: { // 주문하기
					System.out.println("실행결과>> 주문 관리 안내 페이지");
					System.out.println("----------------------------");
					System.out.println("1.주문하기 2.주문수정 3.주문취소 4.전체 주문 리스트 5.이전메뉴");
					System.out.println("----------------------------");
					ans2 = in.nextInt();
					switch (ans2) {
					case 1: {
						B.showBookList(0);
						System.out.println("주문들어온 책ID 입력");
						int oBookID = in.nextInt();
						C.showCustList(0);
						System.out.println("주문하신 고객ID 입력");
						int oCID = in.nextInt();
						System.out.println("판매금액 입력");
						int oSalePrice = in.nextInt();
						O.orders(new Orders(oBookID, oCID, oSalePrice));
						break;
					}
					case 2: {
						O.showOrdersList(0);
						System.out.println("수정할 orderID 입력 : ");
						int oOrderID = in.nextInt();
						System.out.println(oOrderID+"번의 custID 변경할 값을 입력 : ");
						int oCustID = in.nextInt();
						System.out.println(oOrderID+"번의 bookID 입력 : ");
						int oBookID = in.nextInt();
						System.out.println(oOrderID+"번의 수정할 판매 가격 입력 : ");
						int oSalePrice = in.nextInt();
						O.updateOrders(oOrderID,oCustID,oBookID,oSalePrice);
						break;
					}
					case 3: {
						O.showOrdersList(0);
						System.out.println("삭제할 orderID 입력 : ");
						int oOrderID = in.nextInt();
						O.deleteOrders(oOrderID);
						break;
					}
					case 4: {
						O.showOrdersList();
						break;
					}
					case 5:
						System.out.println("이전메뉴로 돌아갑니다.");
						break;
					default:
						System.out.println("잘못된 양식입니다.");
						callMenu();
						break;
					}
				}
					break;
				case 4: {
					System.out.println("종료합니다.");
					flag = false;
					break;
				}
				case -1: {
					deleteAll();
					break;
				}
				default:
					System.out.println("잘못된 입력입니다.2");
					break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("잘못된 입력입니다.1");
//				e.printStackTrace();
				break;
			}
		}
	}

//모두 삭제하는 메서드
	public static void deleteAll() {
		MakeConnection m = new MakeConnection();
		System.out.println("모든 데이터가 삭제 됩니다. 계속하시겠습니까? [y/n]");
		if (in.next().equals("y") || (in.next().equals("Y"))) {
			Connection con = m.makeConnection();

			final String[] sql = new String[8];
			sql[0] = "SET FOREIGN_KEY_CHECKS = 0";
			sql[1] = "delete from book";
			sql[2] = "delete from customer";
			sql[3] = "delete from orders";
			sql[4] = "ALTER TABLE book AUTO_INCREMENT = 1";
			sql[5] = "ALTER TABLE customer AUTO_INCREMENT = 1";
			sql[6] = "ALTER TABLE orders AUTO_INCREMENT = 1";
			sql[7] = "SET FOREIGN_KEY_CHECKS = 1";
			try {
				for (int i = 0; i < sql.length; i++) {
					PreparedStatement pstmt = con.prepareStatement(sql[i]);
					pstmt.executeUpdate();
				}
				System.out.println("모든 자료 삭제 완료");
				con.close();
			} catch (SQLException e) {
				System.out.println("삭제 실패.. 관리자에게 문의하세요 error:SQLException");
			}
		} else
			System.out.println("취소되었습니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("마당도서관 데이터 관리 프로그램입니다." + "\n아무키를 눌러주세요(init 입력시 초기값이 입력됩니다.) :");
		if ((BookManager.in.nextLine()).equals("init")) {
			new DataInit();
			callMenu();
		} else
			callMenu();
	}
}
