package functionalpromgraming_;
import java.util.function.*;


public class PredicateDemo {

	public static void main(String[] args) {

		IntPredicate even = x-> x % 2 == 0;
		System.out.println(even.test(3));
		
		IntPredicate one = x-> x ==1;
		System.out.println(one.test(4));
		
		Predicate<String> p = Predicate.isEqual("Java Lambda");
		System.out.println(p.test("Java Lambda"));
		
		
	}

}
