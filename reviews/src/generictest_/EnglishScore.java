package generictest_;

public class EnglishScore implements Comparable<EnglishScore> {

	String name;
	int score;
	
	public EnglishScore(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}



	public int getScore() {
		return score;
	}



	@Override
	public String toString()
	{
		return "영어 이름 : "+name+"\t 점수 : "+score;
	}
	@Override
	public int compareTo(EnglishScore e)
	{
//		EnglishScore es = (EnglishScore) e;
		return e.score>score? 1:e.score<score? -1:0;
	}
	
}