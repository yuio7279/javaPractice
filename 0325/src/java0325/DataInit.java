package java0325;


public class DataInit {
	public DataInit()
	{	BookDAO B = new BookDAO();
		CustomerDAO C = new CustomerDAO();
		OrdersDAO O = new OrdersDAO();
		
		System.out.println("�ʱ� ���� ���Դϴ�.");
		for(Book b : books) 
			
		B.insertBook(b);
		for(Customer c : customers)
		C.insertCust(c);
		for(Orders o : orders)
		O.orders(o);
	}
	
	Book[] books = {
		new Book("�౸�� ����","�½�����",7000), new Book("�౸ �ƴ� ����","������",13000),
		new Book("�౸�� ����","���ѹ̵��",22000),new Book("���� ���̺�","���ѹ̵��",35000),
		new Book("�ǰ� ����","�½�����",8000),new Book("���� �ܰ躰 ���","�½�����",6000),
		new Book("�߱��� �߾�","�̻�̵��",20000),new Book("�߱��� ��Ź��","�̻�̵��",13000),
		new Book("�ø��� �̾߱�","�Ｚ��",75000),new Book("Olympic Champions","Pearson",13000)};
	
	Customer[] customers = {
		new Customer("������","���� ��ü����","00050000001"),new Customer("�迬��","���ѹα� ����","00060000001"),
		new Customer("��̶�","���ѹα� ������","00070000001"),new Customer("�߽ż�","�̱� Ŭ������","00080000001"),
		new Customer("�ڼ���","���ѹα� ����",null)};

	Orders[] orders = {
		new Orders(1,1,5),new Orders(1,3,5),new Orders(2,5,8000),new Orders(3,6,6000),
		new Orders(4,7,20000),new Orders(1,2,5),new Orders(4,8,13000),
		new Orders(3,10,12000),new Orders(2,10,7000),new Orders(3,8,13000)};
			
	
}

