package java0325;


public class DataInit {
	public DataInit()
	{	BookDAO B = new BookDAO();
		CustomerDAO C = new CustomerDAO();
		OrdersDAO O = new OrdersDAO();
		
		System.out.println("초기 설정 중입니다.");
		for(Book b : books) 
			
		B.insertBook(b);
		for(Customer c : customers)
		C.insertCust(c);
		for(Orders o : orders)
		O.orders(o);
	}
	
	Book[] books = {
		new Book("축구의 역사","굿스포츠",7000), new Book("축구 아는 여자","나무수",13000),
		new Book("축구의 이해","대한미디오",22000),new Book("골프 바이블","대한미디어",35000),
		new Book("피겨 교본","굿스포츠",8000),new Book("역도 단계별 기술","굿스포츠",6000),
		new Book("야구의 추억","이상미디어",20000),new Book("야구를 부탁해","이상미디어",13000),
		new Book("올림픽 이야기","삼성당",75000),new Book("Olympic Champions","Pearson",13000)};
	
	Customer[] customers = {
		new Customer("박지성","영국 맨체스터","00050000001"),new Customer("김연아","대한민국 서울","00060000001"),
		new Customer("장미란","대한민국 강원도","00070000001"),new Customer("추신수","미국 클리블랜드","00080000001"),
		new Customer("박세리","대한민국 대전",null)};

	Orders[] orders = {
		new Orders(1,1,5),new Orders(1,3,5),new Orders(2,5,8000),new Orders(3,6,6000),
		new Orders(4,7,20000),new Orders(1,2,5),new Orders(4,8,13000),
		new Orders(3,10,12000),new Orders(2,10,7000),new Orders(3,8,13000)};
			
	
}

