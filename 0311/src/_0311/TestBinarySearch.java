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
			System.out.println("���� �������� �ʽ��ϴ�.");		
		}
		else
			System.out.printf("%d��ġ�� %d���� �ֽ��ϴ�.",idx,a[idx]);
	}
}