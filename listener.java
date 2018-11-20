package chess4.copy;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class listener extends MouseAdapter implements ActionListener {
	private Graphics2D g;
	private int x1, y1, r, c;
	private int a = 40, b = 30;
	private boolean flag = true;
	private int[][] array;
	private String mode = "玩家对战";
	private String choose = "开始新游戏";

	private int index = 0;

	private int[][] arrayp = new int[16][16];

	private board bd;

	public void setG(Graphics gr) {
		g = (Graphics2D) gr;
	}

	public void setarray(int[][] array) {
		this.array = array;
	}

	public void PVP(int r, int c, int x1, int y1) {
		if (r >= 0 && r < 15 && c >= 0 && c < 15 && array[r][c] == 0) {
			if (flag) {
				array[r][c] = -1;
				Image black = new ImageIcon("E:\\picture\\data\\black.jpg")
						.getImage();
				g.drawImage(black, x1 - a / 2, y1 - a / 2, a, a, null);
				flag = !flag;
			} else {
				array[r][c] = 1;
				Image white = new ImageIcon("E:\\picture\\data\\white2.jpg")
						.getImage();
				g.drawImage(white, x1 - a / 2, y1 - a / 2, a, a, null);
				flag = !flag;
			}
			index++;
			System.out.println("已经落子" + index + "颗");
			arrayp[r][c] = index;
			// System.out.println("r="+r+"c="+c);
			// System.out.println("arrayp="+arrayp[r][c]);

		} else {
			System.out.println("请重新落子");
		}

		win w = new win();
		if (r >= 0 && r < 15 && c >= 0 && c < 15) {
			w.judgeH(array, r, c, bd, this);
			w.judgeS(array, r, c, bd, this);
			w.judgeP(array, r, c, bd, this);
			w.judgeN(array, r, c, bd, this);
		}
	}
	
	public void PVE1(int r, int c, int x1, int y1) { // 玩家执黑子，电脑执白子
		if (flag) {
			if (r >= 0 && r < 15 && c >= 0 && c < 15 && array[r][c] == 0) {
				array[r][c] = -1;
				Image black = new ImageIcon("E:\\picture\\data\\black.jpg")
						.getImage();
				g.drawImage(black, x1 - a / 2, y1 - a / 2, a, a, null);
				index++;
				System.out.println("已经落子" + index + "颗");
				arrayp[r][c] = index;
				flag = !flag;
			} else {
				System.out.println("请重新落子");
			}
			win w = new win();
			if (r >= 0 && r < 15 && c >= 0 && c < 15) {
				w.judgeH(array, r, c, bd, this);
				w.judgeS(array, r, c, bd, this);
				w.judgeP(array, r, c, bd, this);
				w.judgeN(array, r, c, bd, this);
			}
		} else if (index == 1) {
			Image white = new ImageIcon("E:\\picture\\data\\white2.jpg")
					.getImage();
			r = r + 1;
			c = c + 1;
			array[r][c] = 1;
			g.drawImage(white, x1 + a / 2, y1 + a / 2, a, a, null);
			index++;
			System.out.println("已经落子" + index + "颗");
			arrayp[r][c] = index;
			flag = !flag;
		} else {
			getvalue value = new getvalue(r, c, array);						//简单模式
			value.get();
//			getvalueMiddle value = new getvalueMiddle(r, c, array);			//一般模式
//			value.get();
			r = value.r;
			c = value.c;
			x1 = b + a * c;
			y1 = b + a * r;
			// System.out.println("r="+r+"     c="+c);
			if (r < 15 && c < 15 && array[r][c] == 0) {
				array[r][c] = 1;
				Image white = new ImageIcon("E:\\picture\\data\\white2.jpg")
						.getImage();
				g.drawImage(white, x1 - a / 2, y1 - a / 2, a, a, null);
				index++;
				System.out.println("已经落子" + index + "颗");
				arrayp[r][c] = index;
				flag = !flag;
			} else {
				flag = !flag;
			}
			win w = new win();
			if (r >= 0 && r < 15 && c >= 0 && c < 15) {
				w.judgeH(array, r, c, bd, this);
				w.judgeS(array, r, c, bd, this);
				w.judgeP(array, r, c, bd, this);
				w.judgeN(array, r, c, bd, this);
			}
		}
	}

	public void PVE2(int r, int c, int x1, int y1) { // 玩家执黑子，电脑执白子
		if (flag) {
			if (r >= 0 && r < 15 && c >= 0 && c < 15 && array[r][c] == 0) {
				array[r][c] = -1;
				Image black = new ImageIcon("E:\\picture\\data\\black.jpg")
						.getImage();
				g.drawImage(black, x1 - a / 2, y1 - a / 2, a, a, null);
				index++;
				System.out.println("已经落子" + index + "颗");
				arrayp[r][c] = index;
				flag = !flag;
			} else {
				System.out.println("请重新落子");
			}
			win w = new win();
			if (r >= 0 && r < 15 && c >= 0 && c < 15) {
				w.judgeH(array, r, c, bd, this);
				w.judgeS(array, r, c, bd, this);
				w.judgeP(array, r, c, bd, this);
				w.judgeN(array, r, c, bd, this);
			}
		} else if (index == 1) {
			Image white = new ImageIcon("E:\\picture\\data\\white2.jpg")
					.getImage();
			r = r + 1;
			c = c + 1;
			array[r][c] = 1;
			g.drawImage(white, x1 + a / 2, y1 + a / 2, a, a, null);
			index++;
			System.out.println("已经落子" + index + "颗");
			arrayp[r][c] = index;
			flag = !flag;
		} else {
//			getvalue value = new getvalue(r, c, array);						//简单模式
//			value.get();
			getvalueMiddle value = new getvalueMiddle(r, c, array);			//一般模式
			value.get();
			r = value.r;
			c = value.c;
			x1 = b + a * c;
			y1 = b + a * r;
			// System.out.println("r="+r+"     c="+c);
			if (r < 15 && c < 15 && array[r][c] == 0) {
				array[r][c] = 1;
				Image white = new ImageIcon("E:\\picture\\data\\white2.jpg")
						.getImage();
				g.drawImage(white, x1 - a / 2, y1 - a / 2, a, a, null);
				index++;
				System.out.println("已经落子" + index + "颗");
				arrayp[r][c] = index;
				flag = !flag;
			} else {
				flag = !flag;
			}
			win w = new win();
			if (r >= 0 && r < 15 && c >= 0 && c < 15) {
				w.judgeH(array, r, c, bd, this);
				w.judgeS(array, r, c, bd, this);
				w.judgeP(array, r, c, bd, this);
				w.judgeN(array, r, c, bd, this);
			}
		}
	}
	
	public void mouseReleased(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();

		r = (y1 - b + a / 2) / a;
		c = (x1 - b + a / 2) / a;

		x1 = b + a * c;
		y1 = b + a * r;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		if (mode.equals("玩家对战")) {
			PVP(r, c, x1, y1);
		} else if (mode.equals("人机对战")) {
			PVE1(r, c, x1, y1);
		} else if (mode.equals("简单")){
			PVE1(r, c, x1, y1);
		} else if(mode.equals("一般")){
			PVE2(r, c, x1, y1);
		}
	}

	public void setboard(board bd) {
		this.bd = bd;
	}

	public void actionPerformed(ActionEvent e) {
//		choose = e.getActionCommand();
		System.out.println("你选择：" + choose);
		if(e.getActionCommand().equals("人机对战") || e.getActionCommand().equals("玩家对战")){
			mode = e.getActionCommand();
		}else{
			choose = e.getActionCommand();
		}
		if (array[r][c] == 0) {
			bd.addMouseListener(this);
		}
		if (choose.equals("开始新游戏")) {
			flag = true;
			index = 0;
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++) {
					array[i][j] = 0;
				}
			}
			choose = "玩家对战";
			bd.repaint();
		} else if (choose.equals("悔棋")) {
			if(mode =="玩家对战"){
			for (int r = 0; r < 15; r++) {
				for (int c = 0; c < 15; c++) {
					if (arrayp[r][c] == index) {
						array[r][c] = 0;
					}
				}
			}
			index--;
			System.out.println("已经落子" + index + "颗");
			bd.repaint();
			flag = !flag;
//			choose = "玩家对战";
			}else if(mode == "人机对战"){
				for (int r = 0; r < 15; r++) {
					for (int c = 0; c < 15; c++) {
						if (arrayp[r][c] == index || arrayp[r][c] == index-1) {
							array[r][c] = 0;
						}
					}
				}
				index-=2;
				System.out.println("已经落子" + index + "颗");
				bd.repaint();
//				flag = !flag;
			}
		} else if (choose.equals("认输")) {
			if (!flag) {
				JOptionPane.showMessageDialog(null, "黑棋胜利");
			} else {
				JOptionPane.showMessageDialog(null, "白棋胜利");
			}
			bd.removeMouseListener(this);
		} else if (choose.equals("离开")) {
			System.exit(0);
		}
	}
}
