package generic3_;

import java.util.ArrayList;

import generic_.*;

public class GenericInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Beverage> arr1 =new ArrayList<>();
		
		arr1.add(new Beer());
		arr1.add(new Boricha());
		
		ArrayList<Beer> arr2 = new ArrayList<>();
		
		arr2.add(new Beer());
		
		BeverageTest(arr1);
//		BeverageTest(arr2);
		
	}
	public static void BeverageTest(ArrayList<Beverage> b)
	{
		
	}
}
