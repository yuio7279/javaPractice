package lambda_;

import java.util.Arrays;
import java.util.Comparator;
interface Nagative {int neg(int i);}
interface Printable {void print();}


public class ComparatorDemo {

	public static void main(String[] args) {
		
		String[] strings = {"로마에 가면 로마법을 따르라.","시간은 금이다.","펜은 칼보다 강하다."};
		//String은 정렬을 할 때에 final 클래스로써 새로운 Comparable 인터페이스를 구현할 수 없다,
		//이때 Comparator 인터페이스를 매개변수로 사용하는 sort메소드를 사용하여 정렬할 수 있다.
		
//		Arrays.sort(strings,new Comparator<String>() //Comparator인터페이스안의 compare메서드를 구현하였다
//				{	@Override
//					public int compare(String first,String second)
//					{
//						return first.length() - second.length();
//					}
//				});
//		
//		for (String s : strings)
//		{
//			System.out.println(s);
//		}
		Arrays.sort(strings,(first,second) -> first.length()-second.length());
		for (String s : strings)
		{
			System.out.println(s);
		}
		
		Nagative n;
		Printable p;
		
		n = x -> -x;
		p = () -> System.out.println("안녕");
		
		System.out.println(n.neg(45));
		p.print();
	}

}
