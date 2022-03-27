package generic_;


public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Cup c1 = new Cup();
//		
//		c1.setBeverage(new Beer()); //이것은 실질적으로 Beer타입이 아닌 Object 타입이다
		
		
//		Beer b1 = (Beer) c1.getBeverage();
//		System.out.println(b1);
		
//		Cup c2 = new Cup();
//		
//		c2.setBeverage(new Boricha());
//		
//		Beer b2 = (Beer) c2.getBeverage();

//		Cup<Beer> c2 = new Cup<>(); 
//		c2.setBeverage(new Beer());
//		
//		System.out.println(c2.getBeverage());
		
		
		Cup<Beer> c1 = new Cup<>();
		Beer b1 = c1.getBeverage();
		
		Cup<Boricha> c2 = new Cup<>();
		Boricha b2 = c2.getBeverage();
		
//		Cup<String> c3 = new Cup<>();
//		String s1 = c3.getBeverage();
		
		
		
		
		
		
		
	}

}
