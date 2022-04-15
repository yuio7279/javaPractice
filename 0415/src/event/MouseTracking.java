package event;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseTracking extends JFrame implements MouseMotionListener, MouseListener {

	private JLabel la = new JLabel("�迹��");
	
	//Ŭ���� ���� �̵��մϴ�.
	//���콺 �����ӿ����� ���� �̵��ϴ� �޼���� �ּ�ó���Ǿ��ֽ��ϴ� 48~
	
	MouseTracking(){
		setTitle("���콺 ���� ���̺� Ʈ��ŷ");
		setSize(300,300);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		
		la.setLocation(50,50);
		la.setSize(100,20);
		c.addMouseMotionListener(this);
		c.addMouseListener(this);
		c.add(la);
		
		
		
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
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				new MouseTracking();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		la.setLocation(e.getX(),e.getY());
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
}
