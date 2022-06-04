package thread;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable 
{
	private long delay; 
	
	public FlickeringLabel(String text, long delay) 
	{
		super(text);
		this.delay = delay;
		setOpaque(true);
		Thread th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() 
	{
		Boolean onoff= false;
		while(true) {
			if(onoff) 
			{
				setBackground(Color.YELLOW);
				onoff=false;
			} 
			else 
			{
				setBackground(Color.GREEN);
				onoff=true;
			}
		try 
		{
			Thread.sleep(delay); 
		}
		catch(InterruptedException e) 
		{
			return;
			}
		}
	}
}
		public class FlickeringLabelEx extends JFrame {
			
			public FlickeringLabelEx() {
				setTitle("FlickeringLabelEx 예제");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Container c = getContentPane();
				c.setLayout(new FlowLayout());
				// 깜박이는 레이블 생성
				FlickeringLabel fLabel = new FlickeringLabel("깜박",500);
				// 깜박이지 않는 레이블 생성
				JLabel label = new JLabel("안깜박");
				// 깜박이는 레이블 생성
				FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜박",300);
				c.add(fLabel);
				c.add(label);
				c.add(fLabel2);
				setSize(300,150);
				setVisible(true);
			}
			public static void main(String[] args) {
				new FlickeringLabelEx();
			}
		}