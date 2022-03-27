package _0311;
import java.util.Arrays;


public class TestBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {10,20,30,60,80};
		
		int key = 10;
		
		
		int idx = Arrays.binarySearch(a,key);
		
		
		if(idx < 0)
		{
			System.out.println("값이 존재하지 않습니다.");		
		}
		else
			System.out.printf("%d위치의 %d값이 있습니다.",idx,a[idx]);
	}
}