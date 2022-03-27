package generictest_;

public class MathScore implements Comparable<MathScore> {

	String name;
	int score;
	
	
	public MathScore(String name, int score) {
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
		return "���� �̸� : "+name+"\t ���� : "+score;
	}
	@Override
	public int compareTo(MathScore e)
	{
		return e.score>score? 1:e.score<score? -1:0;
	}

	
}