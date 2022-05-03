package swing;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DialogTest extends JFrame {

	
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("이름을 입력하시오");
		
		System.out.println(name+"님 반갑습니다.");
		
		String age = JOptionPane.showInputDialog("나이를 입력하세요");
		
		//--나이가 20미만
		try {
			if(Integer.parseInt(age) < 20)
			{
				System.out.println("어리군요");
			}
			else
				System.out.println(age+"살이군요");
		} catch (NumberFormatException e) {
			
			System.out.println("나이가 이상하시네요");
		}
		
	}
}
