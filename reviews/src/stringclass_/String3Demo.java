package stringclass_;

public class String3Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hi,");
		String s2 = new String(" Java");
		
		System.out.println(s1.charAt(1)); //인덱스에 해당하는 char 반환
		s1 = s1.concat(s2); //s1뒤에 s2붙이기
		System.out.println(s1);
		
		System.out.println(s1.substring(4,5)); //인덱스 4~5-1까지
		
		String s3 = " ";
		System.out.println(s3.isBlank()); // 길이가 0 or 공백이 있다면 true
		System.out.println(s3.isEmpty()); // 길이가 0이어야만 true
		
		
		String s4 = "";
		System.out.println(s4.isBlank()); 
		System.out.println(s4.isEmpty());
		

		String s5 = "*-*";
		System.out.println(s5.repeat(10));
		
		
		System.out.println(s2.trim()); //indexOf: v에 해당하는 인덱스 반환
										//trim : 앞뒤에 있는 공백 제거
	}

}
