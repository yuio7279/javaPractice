package swing_mouse_tracking;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseTracking extends JFrame implements MouseMotionListener, MouseListener {

	private JLabel la = new JLabel("김예성");
	private JLabel j;
	private Container c = getContentPane();
	
	
	MouseTracking(){
		setTitle("마우스 따라 레이블 트래킹");
		setSize(300,300);
		
		c.setLayout(null);
		
		
		la.setLocation(50,50);
		la.setSize(100,20);
		c.add(la);
		
		c.addMouseMotionListener(this);
		c.addMouseListener(this);
		
		
		
		
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
		j = new JLabel("김예성");
		j.setSize(100,20);
		j.setLocation(e.getX(),e.getY());
		c.add(j);
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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