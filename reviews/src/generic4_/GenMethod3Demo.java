package generic4_;

public class GenMethod3Demo {

	public static <T extends Comparable> int countGT (T[] a,T compElem)
	{
		int count = 0;
		
		for(T a1 : a)
			if(a1.compareTo(compElem)>0)
				++count;
				
		return count;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ticket[] t = {new Ticket(4),new Ticket(5),new Ticket(6),new Ticket(7),new Ticket(8)};
		
		System.out.println(countGT(t,t[0]));
		
	}

}
