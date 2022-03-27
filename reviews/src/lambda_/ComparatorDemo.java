package lambda_;

import java.util.Arrays;
import java.util.Comparator;
interface Nagative {int neg(int i);}
interface Printable {void print();}


public class ComparatorDemo {

	public static void main(String[] args) {
		
		String[] strings = {"�θ��� ���� �θ����� ������.","�ð��� ���̴�.","���� Į���� ���ϴ�."};
		//String�� ������ �� ���� final Ŭ�����ν� ���ο� Comparable �������̽��� ������ �� ����,
		//�̶� Comparator �������̽��� �Ű������� ����ϴ� sort�޼ҵ带 ����Ͽ� ������ �� �ִ�.
		
//		Arrays.sort(strings,new Comparator<String>() //Comparator�������̽����� compare�޼��带 �����Ͽ���
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
		p = () -> System.out.println("�ȳ�");
		
		System.out.println(n.neg(45));
		p.print();
	}

}
