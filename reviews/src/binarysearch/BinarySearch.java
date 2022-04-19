package binarysearch;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으실값을 입력하세요 : ");
		int key = sc.nextInt();
	
		int idx = binarySearch(a,key);
		if(idx < 0)
		{
			System.out.println("찾는값이 없습니다.");
		}
		else
		{
			System.out.printf("%d번째, %d값입니다.",idx,a[idx]);
		}
		
	}
	
	//바이너리 서치 인덱스값 리턴
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
