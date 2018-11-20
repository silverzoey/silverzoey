package Ball;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public class BallFrame extends JFrame {
	/**
	 * 小球运动
	 */
	public static void main(String[] args) {
		BallFrame bl = new BallFrame();
		bl.initUI();
	}

	private int x, y, r;

	private void initUI() {
		JFrame jf = new JFrame("小球运动");
		jf.setLayout(new FlowLayout());
		jf.setSize(900, 700);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(3);
		jf.setVisible(true);

		final Graphics g = jf.getGraphics();
		final BallFrame bf = new BallFrame();
		final ArrayList<Ball> list = new ArrayList<Ball>();

		BallThread bt = new BallThread(x, y, g, bf, list);
		bt.start();
		jf.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				Random rand = new Random();
				int vx = rand.nextInt(8)*2 - 8;
				int vy = rand.nextInt(8)*2 - 8;
				int r = rand.nextInt(20)*2 + 30;
				Ball ball = new Ball(x, y, vx, vy, g, bf, r);
				list.add(ball);
				int count = list.size();
				System.out.println("你已经画了"+count+"个小球");
				// System.out.println(x+"    "+y);

			}
		});
	}

}
