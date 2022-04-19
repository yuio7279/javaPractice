package binarysearch;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		System.out.println("ã���ǰ��� �Է��ϼ��� : ");
		int key = sc.nextInt();
	
		int idx = binarySearch(a,key);
		if(idx < 0)
		{
			System.out.println("ã�°��� �����ϴ�.");
		}
		else
		{
			System.out.printf("%d��°, %d���Դϴ�.",idx,a[idx]);
		}
		
	}
	
	//���̳ʸ� ��ġ �ε����� ����
	public static int binarySearch(int[]a, int key)
	{
		int high = a.length - 1;
		int low = 0;
		
		while(low <= high)
		{
			int mid = (low + high) / 2;
			if(a[mid] > key)
			{
				high = mid-1;
			}
			else if(a[mid] < key)
			{
				low = mid + 1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
}
