package swing;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DialogTest extends JFrame {

	
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("�̸��� �Է��Ͻÿ�");
		
		System.out.println(name+"�� �ݰ����ϴ�.");
		
		String age = JOptionPane.showInputDialog("���̸� �Է��ϼ���");
		
		//--���̰� 20�̸�
		try {
			if(Integer.parseInt(age) < 20)
			{
				System.out.println("�����");
			}
			else
				System.out.println(age+"���̱���");
		} catch (NumberFormatException e) {
			
			System.out.println("���̰� �̻��Ͻó׿�");
		}
		
	}
}
