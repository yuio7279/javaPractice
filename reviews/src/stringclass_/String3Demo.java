package stringclass_;

public class String3Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hi,");
		String s2 = new String(" Java");
		
		System.out.println(s1.charAt(1)); //�ε����� �ش��ϴ� char ��ȯ
		s1 = s1.concat(s2); //s1�ڿ� s2���̱�
		System.out.println(s1);
		
		System.out.println(s1.substring(4,5)); //�ε��� 4~5-1����
		
		String s3 = " ";
		System.out.println(s3.isBlank()); // ���̰� 0 or ������ �ִٸ� true
		System.out.println(s3.isEmpty()); // ���̰� 0�̾�߸� true
		
		
		String s4 = "";
		System.out.println(s4.isBlank()); 
		System.out.println(s4.isEmpty());
		

		String s5 = "*-*";
		System.out.println(s5.repeat(10));
		
		
		System.out.println(s2.trim()); //indexOf: v�� �ش��ϴ� �ε��� ��ȯ
										//trim : �յڿ� �ִ� ���� ����
	}

}
