package generic4_;


public class getMethodDemo {
	
	static class Utils {
		
		public static <T extends Number> void showArray (T[] a) //T는 기초타입을 막는다
		{
			for (T z : a)
			{
				System.out.println(a);
			}
			
			
		}
		
		public static <T> T getLast (T[]a )
		{
			return a[a.length-1];
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Integer[] arr1 = {10,20,30}; 
		Character[] arr2= {'a','b','c'};
		
		Utils.showArray(arr1);
		System.out.println(Utils.getLast(arr1));
//		Utils.showArray(arr2);
		System.out.println(Utils.getLast(arr2));
		
	}	
}
