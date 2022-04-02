package swing_calculator;
import java.awt.FlowLayout;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = {"Backspace","","","CE","C",
								"7","8","9","/","sqrt","4",
								"5","6","*","%","1","2","3",
								"-","1/x","0","+/-",".","+","="};
	
	public Calculator() {
		this.setTitle("Calculator");
		tField = new JTextField();
		panel = new JPanel();
		buttons = new JButton[labels.length];
		for(int i=0; i<this.labels.length; i++)
		{
			panel.add(buttons[i] = new JButton(labels[i]));
		}

		tField.setColumns(20);
		add(tField,"North");
		add(panel,"Center");
		panel.setLayout(new GridLayout(5,5));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
		
	}

}
