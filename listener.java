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
	private String mode = "��Ҷ�ս";
	private String choose = "��ʼ����Ϸ";

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
			System.out.println("�Ѿ�����" + index + "��");
			arrayp[r][c] = index;
			// System.out.println("r="+r+"c="+c);
			// System.out.println("arrayp="+arrayp[r][c]);

		} else {
			System.out.println("����������");
		}

		win w = new win();
		if (r >= 0 && r < 15 && c >= 0 && c < 15) {
			w.judgeH(array, r, c, bd, this);
			w.judgeS(array, r, c, bd, this);
			w.judgeP(array, r, c, bd, this);
			w.judgeN(array, r, c, bd, this);
		}
	}
	
	public void PVE1(int r, int c, int x1, int y1) { // ���ִ���ӣ�����ִ����
		if (flag) {
			if (r >= 0 && r < 15 && c >= 0 && c < 15 && array[r][c] == 0) {
				array[r][c] = -1;
				Image black = new ImageIcon("E:\\picture\\data\\black.jpg")
						.getImage();
				g.drawImage(black, x1 - a / 2, y1 - a / 2, a, a, null);
				index++;
				System.out.println("�Ѿ�����" + index + "��");
				arrayp[r][c] = index;
				flag = !flag;
			} else {
				System.out.println("����������");
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
			System.out.println("�Ѿ�����" + index + "��");
			arrayp[r][c] = index;
			flag = !flag;
		} else {
			getvalue value = new getvalue(r, c, array);						//��ģʽ
			value.get();
//			getvalueMiddle value = new getvalueMiddle(r, c, array);			//һ��ģʽ
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
				System.out.println("�Ѿ�����" + index + "��");
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

	public void PVE2(int r, int c, int x1, int y1) { // ���ִ���ӣ�����ִ����
		if (flag) {
			if (r >= 0 && r < 15 && c >= 0 && c < 15 && array[r][c] == 0) {
				array[r][c] = -1;
				Image black = new ImageIcon("E:\\picture\\data\\black.jpg")
						.getImage();
				g.drawImage(black, x1 - a / 2, y1 - a / 2, a, a, null);
				index++;
				System.out.println("�Ѿ�����" + index + "��");
				arrayp[r][c] = index;
				flag = !flag;
			} else {
				System.out.println("����������");
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
			System.out.println("�Ѿ�����" + index + "��");
			arrayp[r][c] = index;
			flag = !flag;
		} else {
//			getvalue value = new getvalue(r, c, array);						//��ģʽ
//			value.get();
			getvalueMiddle value = new getvalueMiddle(r, c, array);			//һ��ģʽ
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
				System.out.println("�Ѿ�����" + index + "��");
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
		if (mode.equals("��Ҷ�ս")) {
			PVP(r, c, x1, y1);
		} else if (mode.equals("�˻���ս")) {
			PVE1(r, c, x1, y1);
		} else if (mode.equals("��")){
			PVE1(r, c, x1, y1);
		} else if(mode.equals("һ��")){
			PVE2(r, c, x1, y1);
		}
	}

	public void setboard(board bd) {
		this.bd = bd;
	}

	public void actionPerformed(ActionEvent e) {
//		choose = e.getActionCommand();
		System.out.println("��ѡ��" + choose);
		if(e.getActionCommand().equals("�˻���ս") || e.getActionCommand().equals("��Ҷ�ս")){
			mode = e.getActionCommand();
		}else{
			choose = e.getActionCommand();
		}
		if (array[r][c] == 0) {
			bd.addMouseListener(this);
		}
		if (choose.equals("��ʼ����Ϸ")) {
			flag = true;
			index = 0;
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++) {
					array[i][j] = 0;
				}
			}
			choose = "��Ҷ�ս";
			bd.repaint();
		} else if (choose.equals("����")) {
			if(mode =="��Ҷ�ս"){
			for (int r = 0; r < 15; r++) {
				for (int c = 0; c < 15; c++) {
					if (arrayp[r][c] == index) {
						array[r][c] = 0;
					}
				}
			}
			index--;
			System.out.println("�Ѿ�����" + index + "��");
			bd.repaint();
			flag = !flag;
//			choose = "��Ҷ�ս";
			}else if(mode == "�˻���ս"){
				for (int r = 0; r < 15; r++) {
					for (int c = 0; c < 15; c++) {
						if (arrayp[r][c] == index || arrayp[r][c] == index-1) {
							array[r][c] = 0;
						}
					}
				}
				index-=2;
				System.out.println("�Ѿ�����" + index + "��");
				bd.repaint();
//				flag = !flag;
			}
		} else if (choose.equals("����")) {
			if (!flag) {
				JOptionPane.showMessageDialog(null, "����ʤ��");
			} else {
				JOptionPane.showMessageDialog(null, "����ʤ��");
			}
			bd.removeMouseListener(this);
		} else if (choose.equals("�뿪")) {
			System.exit(0);
		}
	}
}
