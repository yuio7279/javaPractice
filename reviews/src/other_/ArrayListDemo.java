package other_;
import java.util.ArrayList; //java.util ��Ű���� ����


public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> i = new ArrayList<>();
		i.add(3);
		i.add(4); //�����迭�� �߰� �޼���
		i.add(5);
		
		System.out.println(i.get(0)); //�ҷ�����
		
		System.out.println(i.size()); //����
		i.remove(1); //�ش� �ε�����ȣ�� value ���� ����
		System.out.println();
		
		for(int a =0; a<i.size(); a++)
			System.out.println(i.get(a)); 
		
	}

}
