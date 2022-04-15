package swing_mouse_tracking;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MouseTracking extends JFrame implements MouseMotionListener, MouseListener {
	private Container c = getContentPane();
	 
	
	
	MouseTracking(){
		setTitle("마우스 따라 레이블 트래킹");
		
		JLabel la = new JLabel("김예성");
		c.setLayout(null);
		la.setOpaque(true);
		la.setBackground(Color.GREEN);
		Border border = BorderFactory.createLineBorder(Color.red, 5);
		la.setBorder(border);
		la.setLocation(50,50);
		la.setSize(50,20);
		c.add(la);
		
		c.addMouseMotionListener(this);
		c.addMouseListener(this);

		
		

		this.setSize(300,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
//		la.setLocation(e.getX(),e.getY());		
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent e) {
		JLabel j = new JLabel("김예성");
		j.setOpaque(true);
		j.setBackground(Color.GREEN);
		
		Border border = BorderFactory.createLineBorder(Color.red, 5);
		
		j.setBorder(border);
		j.setSize(50,20);
		j.setLocation(e.getX(),e.getY());
		c.add(j);
		c.revalidate();
		c.repaint();
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				new MouseTracking();
	}
}