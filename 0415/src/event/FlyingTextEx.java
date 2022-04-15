package event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FlyingTextEx extends JFrame{
	private final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("HELLO");
	public FlyingTextEx() {
		setTitle("상,하,좌,우 키를 이용 텍스트를 움직이기");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(null);
		
		
		la.setLocation(50,50);
		la.setSize(100,20);
		c.add(la);
		c.addKeyListener(new MyKeyListener());
		setSize(300,300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
	}
	
	class MyKeyListener implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyCode());
			int gCode = e.getKeyCode();
			int la_locX = la.getX();
			int la_locY = la.getY();
				
			switch(gCode)
			{
				case 37 : 	
				{
					if(la_locX<=0)	return;
					
					else {
						la.setLocation(la_locX-FLYING_UNIT, la_locY);
					}
					return;
				}
				case 38 :	
				
				{
					if(la_locY<=0)	return;
					
					else {
						la.setLocation(la_locX, la_locY-FLYING_UNIT);
					}
					return;
				}
				case 39 : 
				{
					if(la_locX >= 240)	return;
					
					else {
						la.setLocation(la_locX+FLYING_UNIT, la_locY);
					}
					return;
				}	
				case 40 :
				{
					if(la_locY >= 240)	return;
					
					else {
						la.setLocation(la_locX, la_locY+FLYING_UNIT);
					}
					 return;
				}
			}
		}

		
		@Override
		public void keyReleased(KeyEvent e) {
			
			
		}
		
	}
	

	public static void main(String[] args) {
		
		new FlyingTextEx();
	}

}
