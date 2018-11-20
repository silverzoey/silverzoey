package Ball;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Random;

public class Ball {
	int x, y;
	private int vx, vy, r;
	private BallFrame bf;
	private Graphics2D g;

	public Ball(int x, int y, int vx, int vy, Graphics g, BallFrame bf, int r) {
		this.x = x;
		this.y = y;
		this.g = (Graphics2D) g;
		this.vx = vx;
		this.vy = vy;
		this.setR(r);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getvx() {
		return vx;
	}

	public void setvx(int vx) {
		this.vx = vx;
	}

	public int getvY() {
		return vy;
	}

	public void setvY(int vy) {
		this.vy = vy;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	// 清除小球的方法
	public void clear(Graphics g, BallFrame bf) {
		g.setColor(bf.getBackground());
		// g.fillRect(x-vx, y-vy, 60, 60);
		g.fillOval(x - vx-1, y - vy-1, r+2, r+2);
		
		// System.out.println("  ssss");
	}

	// 移动小球的方法

	public void move(Graphics g) {
		x += vx;
		y += vy;
		// System.out.println("vx="+vx+"       vy="+vy);
	}

	// 绘制小球的方法
	public void draw(Graphics2D g, BallFrame bf) {
		if (x < 10 || x > 900 - r) {
			vx = -vx;
		}
		if (y < 40 || y > 700 - r) {
			vy = -vy;
		}
		/**
		 * 两个圆叠加，画圆环
		 */
//		 g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
//		 RenderingHints.VALUE_ANTIALIAS_ON);
		 g.setColor(new Color(x * y * x * y));
		 // System.out.println(x+"    "+y);
		 g.fillOval(x, y, r, r);
		 
		 g.setColor(bf.getBackground());
		 g.fillOval(x + 5, y + 5, r-10, r-10);

		/**
		 * 圆环，控制线条粗细
		 */
//		g.setColor(new Color(x * y * x * y));
//		g.drawOval(x, y, r, r);
//		g.setStroke(new BasicStroke(5));
//		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
//				RenderingHints.VALUE_ANTIALIAS_ON);
	}

}
