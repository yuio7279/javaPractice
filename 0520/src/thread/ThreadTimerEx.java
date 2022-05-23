package thread;
import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {
	private JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel) {	//TimerThread생성할때의 라벨을 넘긴다.
		this.timerLabel = timerLabel;
	}
	
	public void run() {
		int cnt = 0;
		while(true)
		{
			try {
				timerLabel.setText(""+cnt);	//해당 라벨의 내부 텍스트값을 증가
				Thread.sleep(1);
				cnt++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				break;
			}
		}
	}
	
}



public class ThreadTimerEx extends JFrame {

	public ThreadTimerEx() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		c.add(timerLabel);
		
		
		
		
		
		TimerThread th = new TimerThread(timerLabel);
		setSize(300, 170);
		setVisible(true);
		th.start();
		
		JButton endBtn = new JButton("종료");
		endBtn.addActionListener((e)->{
			if(e.getActionCommand().equals("종료")) {
				th.stop();
				}
		});
		c.add(endBtn);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadTimerEx();
		
	}

}