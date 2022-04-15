package event;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {

	private JLabel la = new JLabel();

	Container c;

	public KeyCodeEx() {
		setTitle("Key Code 예제 : F1키 초록색,,, %키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		MyKeyListener listener = new MyKeyListener();
		
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
		class MyKeyListener implements KeyListener {
			@Override
			public void keyPressed(KeyEvent e) {

				Container contentPane = getContentPane();
					if(e.getKeyCode() == KeyEvent.VK_F1) 
					{
						contentPane.setBackground(Color.GREEN);
					}
					else if(e.getKeyChar() == ('%'))
					{
						contentPane.setBackground(Color.YELLOW);
					}
					
					System.out.println(e.getKeyCode());
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
	
	
	public static void main(String[] args) {
		
		new KeyCodeEx();
	}

}
