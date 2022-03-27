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
				System.out.println("�ȳ��޽��� >> ȯ���մϴ�.");
				System.out.println("----------------------------");
				System.out.println("1.�������� 2.������ 3.�ֹ����� 4.���� :::-1.��� ������ ����");
				System.out.println("----------------------------");
				int ans = in.nextInt();
				int ans2; // 2��° �޴�
				System.out.println("�޴� : " + ans);
				switch (ans) {
				case 1: { // ��������
					System.out.println("������>> ���� ���� �ȳ� ������");
					System.out.println("----------------------------");
					System.out.println("1.������� 2.�������� 3.���� 4.��ü����Ʈ 5.�����޴� ");
					System.out.println("----------------------------");

					ans2 = in.nextInt();
					switch (ans2) {
					case 1:
						String bName;
						String pub;
						int price;

						System.out.println("����� ������ å�̸� : ");
						bName = in.next();
						System.out.println("����� ������ ���ǻ�� : ");
						pub = in.next();
						System.out.println("����� ������ ���� : ");
						price = in.nextInt();
						B.insertBook(new Book(bName, pub, price));
						break;

					case 2:
						B.showBookList(0);
						System.out.println("������ åID �Է�");
						int id = in.nextInt();
						System.out.println(id+"���� �����Ϸ��� å�̸� �Է� : ");
						bName = in.next();
						System.out.println(id + "���� ������ ���ǻ�� �Է� : ");
						pub = in.next();
						System.out.println(id+ "���� ������ ���� �Է� : ");
						price = in.nextInt();
						B.updateBook(id ,bName, pub, price);
						break;

					case 3:
						B.showBookList(0);
						System.out.println("������ ������ ���̵� : ");
						int bookID = in.nextInt();
						B.deleteBook(bookID);
						break;

					case 4:
						B.showBookList();
						break;

					case 5:
						System.out.println("�����޴��� ���ư��ϴ�.");
						break;
					default:
						System.out.println("�߸��� ����Դϴ�.");
						callMenu();
						break;
					}
				}
					break;

				case 2: { // ������
					System.out.println("������>> �� ���� �ȳ� ������");
					System.out.println("----------------------------");
					System.out.println("1.����� 2.������ 3.���� 4.��ü����Ʈ 5.�����޴�");
					System.out.println("----------------------------");
					ans2 = in.nextInt();
					switch (ans2) {
					case 1:
						String cName;
						String address;
						String phone;

						System.out.println("����� ���� �̸� : ");
						cName = in.next();
						System.out.println("����� ���� �ּ�: ");
						address = in.next();
						System.out.println("����� ���� �޴��� ��ȣ[01012345678] : ");
						phone = in.next();
						C.insertCust(new Customer(cName, address, phone));
						break;

					case 2:
						C.showCustList(0);
						System.out.println("������ ID : ");
						int cCustID = in.nextInt();
						System.out.println(cCustID + "���� �����Ϸ��� �̸� : ");
						cName = in.next();
						System.out.println(cCustID + "���� �����Ϸ��� �ּ� : ");
						address = in.next();
						System.out.println(cCustID + "���� �����Ϸ��� �޴��� ��ȣ[ex -01012345678] : ");
						phone = in.next();
						C.updateCust(cName, address, phone,cCustID);
						break;
					case 3:
						C.showCustList(0);
						System.out.println("������ ���� ���̵� : ");
						int custID = in.nextInt();
						C.deleteCust(custID);
						break;
					case 4:
						C.showCustList();
						break;
					case 5:
						System.out.println("�����޴��� ���ư��ϴ�.");
						break;
					default:
						System.out.println("�߸��� ����Դϴ�.");
						callMenu();
						break;
					}
					break;

				}
				case 3: { // �ֹ��ϱ�
					System.out.println("������>> �ֹ� ���� �ȳ� ������");
					System.out.println("----------------------------");
					System.out.println("1.�ֹ��ϱ� 2.�ֹ����� 3.�ֹ���� 4.��ü �ֹ� ����Ʈ 5.�����޴�");
					System.out.println("----------------------------");
					ans2 = in.nextInt();
					switch (ans2) {
					case 1: {
						B.showBookList(0);
						System.out.println("�ֹ����� åID �Է�");
						int oBookID = in.nextInt();
						C.showCustList(0);
						System.out.println("�ֹ��Ͻ� ��ID �Է�");
						int oCID = in.nextInt();
						System.out.println("�Ǹűݾ� �Է�");
						int oSalePrice = in.nextInt();
						O.orders(new Orders(oBookID, oCID, oSalePrice));
						break;
					}
					case 2: {
						O.showOrdersList(0);
						System.out.println("������ orderID �Է� : ");
						int oOrderID = in.nextInt();
						System.out.println(oOrderID+"���� custID ������ ���� �Է� : ");
						int oCustID = in.nextInt();
						System.out.println(oOrderID+"���� bookID �Է� : ");
						int oBookID = in.nextInt();
						System.out.println(oOrderID+"���� ������ �Ǹ� ���� �Է� : ");
						int oSalePrice = in.nextInt();
						O.updateOrders(oOrderID,oCustID,oBookID,oSalePrice);
						break;
					}
					case 3: {
						O.showOrdersList(0);
						System.out.println("������ orderID �Է� : ");
						int oOrderID = in.nextInt();
						O.deleteOrders(oOrderID);
						break;
					}
					case 4: {
						O.showOrdersList();
						break;
					}
					case 5:
						System.out.println("�����޴��� ���ư��ϴ�.");
						break;
					default:
						System.out.println("�߸��� ����Դϴ�.");
						callMenu();
						break;
					}
				}
					break;
				case 4: {
					System.out.println("�����մϴ�.");
					flag = false;
					break;
				}
				case -1: {
					deleteAll();
					break;
				}
				default:
					System.out.println("�߸��� �Է��Դϴ�.2");
					break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("�߸��� �Է��Դϴ�.1");
//				e.printStackTrace();
				break;
			}
		}
	}

//��� �����ϴ� �޼���
	public static void deleteAll() {
		MakeConnection m = new MakeConnection();
		System.out.println("��� �����Ͱ� ���� �˴ϴ�. ����Ͻðڽ��ϱ�? [y/n]");
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
				System.out.println("��� �ڷ� ���� �Ϸ�");
				con.close();
			} catch (SQLException e) {
				System.out.println("���� ����.. �����ڿ��� �����ϼ��� error:SQLException");
			}
		} else
			System.out.println("��ҵǾ����ϴ�.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���絵���� ������ ���� ���α׷��Դϴ�." + "\n�ƹ�Ű�� �����ּ���(init �Է½� �ʱⰪ�� �Էµ˴ϴ�.) :");
		if ((BookManager.in.nextLine()).equals("init")) {
			new DataInit();
			callMenu();
		} else
			callMenu();
	}
}
