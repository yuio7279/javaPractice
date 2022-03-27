package other_;
import java.util.ArrayList; //java.util 패키지에 포함


public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> i = new ArrayList<>();
		i.add(3);
		i.add(4); //동적배열의 추가 메서드
		i.add(5);
		
		System.out.println(i.get(0)); //불러오기
		
		System.out.println(i.size()); //갯수
		i.remove(1); //해당 인덱스번호의 value 값을 제거
		System.out.println();
		
		for(int a =0; a<i.size(); a++)
			System.out.println(i.get(a)); 
		
	}

}
