package stringclass_;

public class String4Demo {

	public static void main(String[] args) {
		
		
		String version = String.format("%s,%d","JDK",14); // 주어진 포멧에 맞춘 문자열을 반환
		System.out.println(version);
		
		String fruits = String.join(", ", "a p p l e","banana","cherry"); //첫번째 인자를 구분자로 두고 두번째 value 들을 구분짓는다.
		System.out.println(fruits);
		
		String pi = String.valueOf(3.14); //기초타입이라 객체를 문자열로 반환
		System.out.println(pi);
		
		System.out.println(pi.length());
		
	}
	

}
