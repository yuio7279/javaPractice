package lambda_;
interface UseThis {void use();}

public class UseThisDemo {

	public void lambda()
	{
		String hi = "hi";
		
		UseThis u1 = new UseThis(){
				public void use()
				{
					System.out.println(this);
				}};
		
		UseThis u2 = ()->{System.out.println(this);};
		u2.use();
	}
	public String toString() {return"UseThisDemo";}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int one = -1;
		
		new UseThisDemo().lambda();
	}
}
