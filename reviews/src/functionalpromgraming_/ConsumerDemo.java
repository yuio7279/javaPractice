package functionalpromgraming_;
import java.util.function.*;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> c1 = x -> System.out.println(x.toLowerCase());
		c1.accept("HIHIHI");
		
		BiConsumer<String, String> c2 = (x,y) -> System.out.println(x+" : "+y);
		c2.accept("Java","Lambda");
		
		try {
			ObjIntConsumer<String> c3 = (s, x) -> {
				int a = Integer.parseInt(s) + x;
				System.out.println(a);
			};
			
			c3.accept("dd",2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: 숫자관련 String값을 입력하세요");
			e.printStackTrace();
		}
		
		IntConsumer c4 = x -> System.out.printf("%d + %d = %d\n",x,x,x*x);
//		IntConsumer c5 = c4.andThen(c5);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
