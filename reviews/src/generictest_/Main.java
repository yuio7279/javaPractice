package generictest_;

public class Main {

	static <T extends Comparable>T getHScore (T[] a)
	{
		T best = a[0];
		for(T aa : a)
			if(aa.compareTo(best)<0)
				best = aa;
		
		return best;
	}
	
	static <T extends Comparable>String findScore(T[]a ,String name)
	{
		for(T aa: a)
		{
			if(aa.toString().substring(8,9).equals(name))
				return aa.toString();
		}
		return "ã�� �� �����ϴ�.";
	}
	
	static <T extends Comparable>String findScore(T[]a)
	{
		return "���ڰ� �����ϴ�.";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EnglishScore[] es = new EnglishScore[5];
		es[0] = new EnglishScore("��",55);
		es[1] = new EnglishScore("��",99);
		es[2] = new EnglishScore("��",88);
		es[3] = new EnglishScore("��",100);
		es[4] = new EnglishScore("��",66);
		System.out.println(getHScore(es));
		MathScore[] ms = new MathScore[5];
		ms[0] = new MathScore("��",77);
		ms[1] = new MathScore("��",3125);
		ms[2] = new MathScore("��",3);
		ms[3] = new MathScore("��",75);
		ms[4] = new MathScore("��",66);
		System.out.println(getHScore(ms));
		
		
			System.out.println(
					findScore(ms,ms[0].getName()));
			System.out.println(
					findScore(es,es[2].getName()));
			System.out.println(
					findScore(ms));
		
	}

}
