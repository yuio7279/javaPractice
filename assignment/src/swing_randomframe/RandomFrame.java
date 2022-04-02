package swing_randomframe;

import java.awt.Color;
import java.util.Random;
import javax.swing.*;

public class RandomFrame extends JFrame{

	JPanel p = new JPanel();
	JLabel[] labels = new JLabel[30];
	Random random = new Random();
	
	public RandomFrame() {
		setTitle("RandomFrame");
		p.setLayout(null);
		p.setBackground(Color.YELLOW);
		for(int i=0; i<30; i++)
		{
			labels[i] = new JLabel(String.valueOf(i));
			labels[i].setForeground(Color.red);
			labels[i].setBounds(random.nextInt(500), random.nextInt(300), 20, 20);
			p.add(labels[i]);
		}
		
		setSize(500,300);
		p.setSize(500,300);
		
		add(p);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RandomFrame();
		
	}

}
