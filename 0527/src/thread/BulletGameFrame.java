package thread;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BulletGameFrame extends JFrame {

	public BulletGameFrame() {
		setTitle("사격 게임");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		BGamePanel p = new BGamePanel();
		this.setContentPane(p);
		this.setSize(500, 500);
		this.setResizable(false);
		this.setVisible(true); // 패널들 설정
		p.startGame();
	}

	class BGamePanel extends JPanel {
		JLabel bullet;
		JLabel dak;
		JLabel balsa;

		// 쓰레드 1 쓰레드 2 , space바 누르면 쓰레드2실행 ,

		public BGamePanel() {
			setLayout(null);

			dak = new JLabel(new ImageIcon("./images/dak.jpg"));
			dak.setBounds(20, 20, 50, 50);
			dak.setOpaque(true);
			add(dak);

			Target target = new Target(dak);
			target.start();

			this.setFocusable(true);

			this.addKeyListener(new KeyListener() {

				@Override
				public void keyTyped(KeyEvent e) {
				}

				@Override
				public void keyPressed(KeyEvent e) {

					bullet = new JLabel(new ImageIcon("./images/bullet.jpg"));
					Shot shot = new Shot(bullet, dak, target);
					bullet.setBounds(230, 380, 20, 20);

					bullet.setOpaque(true);
					add(bullet);
					shot.start();
				}

				@Override
				public void keyReleased(KeyEvent e) {
				}

			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.black);
			g.fillRect(230, 430, 30, 30);
		}

		public void startGame() {

		}
	}

	class Shot extends Thread {
		JLabel bullet;
		JLabel dak;
		Thread target;

		Shot(JLabel bullet, JLabel dak, Thread target) {
			this.bullet = bullet;
			this.target = target;
			this.dak = dak;
		}

		boolean hit() {
			int x = bullet.getX();
			int y = bullet.getY();
			int w = bullet.getWidth();
			int h = bullet.getHeight();

			if (targetContains(x, y) || targetContains(x + w - 1, y) || targetContains(x + w - 1, y + h - 1)
					|| targetContains(x, y + h - 1))
				return true;
			else
				return false;
		}

		boolean targetContains(int x, int y) {
			//가로세로 넓이 구하기..
			if (((dak.getX() <= x) && (x < dak.getX() + dak.getWidth()))&& ((dak.getY() <= y) && (y < dak.getY() + dak.getHeight())))
				return true;

			else
				return false;
		}

		@Override
		public void run() {
			int corY = bullet.getY();
			while (corY > 20) {
				try {
					if (hit()) {
						target.interrupt();
					}
					corY = bullet.getY() - 5;
					bullet.setLocation(bullet.getX(), corY);

					Thread.sleep(7);
				} catch (InterruptedException e) {
					System.out.println("ㅎㅎ");
				}
			}
			bullet.setVisible(false);
			this.interrupt();

		}
	}

	class Target extends Thread {
		JLabel dak;
		public boolean stop;

		Target(JLabel dak) {
			this.dak = dak;
		}

		@Override
		public void run() {

			while (!stop) {
				try {
					int corX = dak.getX() + 5;
					dak.setLocation(corX, dak.getY());
					repaint();
					if (corX > 450) {
						dak.setLocation(0, dak.getY());
						corX = 0;
						repaint();
					}

					Thread.sleep(15);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("10점!");
					dak.setLocation(0, dak.getY());
				}
			}
		}
	}

	public static void main(String[] args) {
		new BulletGameFrame();

	}

}
