package stringclass_;

public class String4Demo {

	public static void main(String[] args) {
		
		
		String version = String.format("%s,%d","JDK",14); // �־��� ���信 ���� ���ڿ��� ��ȯ
		System.out.println(version);
		
		String fruits = String.join(", ", "a p p l e","banana","cherry"); //ù��° ���ڸ� �����ڷ� �ΰ� �ι�° value ���� �������´�.
		System.out.println(fruits);
		
		String pi = String.valueOf(3.14); //����Ÿ���̶� ��ü�� ���ڿ��� ��ȯ
		System.out.println(pi);
		
		System.out.println(pi.length());
		
	}
	

}
