package thread;
import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {
	private JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel) {	//TimerThread�����Ҷ��� ���� �ѱ��.
		this.timerLabel = timerLabel;
	}
	
	public void run() {
		int cnt = 0;
		while(true)
		{
			try {
				timerLabel.setText(""+cnt);	//�ش� ���� ���� �ؽ�Ʈ���� ����
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
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
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
		
		JButton endBtn = new JButton("����");
		endBtn.addActionListener((e)->{
			if(e.getActionCommand().equals("����")) {
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