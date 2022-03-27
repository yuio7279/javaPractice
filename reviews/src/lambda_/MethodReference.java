package lambda_;

interface Mathematical {double calculate(double d);}
interface Pickable { char pick(String s, int i);}
interface Computable { int compute(int x, int y);}
interface NewObject<T> {T getObject(T o);}
interface NewArray<T> {T[] getArray(int Size);}


class Utils
{
	int add(int a, int b)
	{
		return a+b;
	}
}
public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mathematical m;
		Pickable p;
		Computable c;
		
		m = Math::abs;
		
		System.out.println(m.calculate(-22));
		
		p = String::charAt;
		System.out.println(p.pick("반갑습니다.", 2));
		
		Utils utils = new Utils();
		c = utils::add;
		System.out.println(c.compute(3, 5));
		
		
		NewObject<String> o;
		NewArray<Integer> a;
		
		o = String::new;
		String str = o.getObject("사과");
		System.out.println(str);
		
		a = Integer[]::new;
		Integer[] arr = a.getArray(2);
		
		arr[0] = 10;
		arr[1] = 20;
		
	}

}
