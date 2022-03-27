package generic2_;

public class EntryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entry<String,Integer> e1 = new Entry<>("¾È³ç",55);
		System.out.println(e1.getKey()+e1.getValue());
		
		Entry<Integer,Integer> e2 = new Entry<>(1,55);
		
		System.out.println(e2.getValue());
		
		
	}

}
