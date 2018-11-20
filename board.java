package chess4.copy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * 
 * �������������
 * 
 */

@SuppressWarnings("serial")
public class board extends JPanel {

	// int i=90;

	public static void main(String[] args) {
		board bo = new board();
		bo.initUI();
		// int a = 999;
		// bo.f();
		// System.out.println(bo.i);
	}

	// public void f(){
	// i = 9;
	// System.out.println(i);
	// }

	public void initUI() {
		JFrame jf = new JFrame();
		jf.setTitle("������");
		jf.setSize(900, 660);
		jf.setDefaultCloseOperation(3);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);

		// �м�����
		BorderLayout bl = new BorderLayout();
		jf.setLayout(bl);
		this.setBackground(new Color(220, 184, 121));
		jf.add(this, BorderLayout.CENTER);

		// �ұ�����
		JPanel east = new JPanel();
		east.setPreferredSize(new Dimension(200, 0));
		east.setBackground(new Color(129, 199, 212));
		east.setLayout(new FlowLayout());
		String[] array = { "��ʼ����Ϸ", "����", "����", "�뿪", "��սģʽѡ��",
				"��Ĭ����Ҷ�ս����ѡ���˻���ս��", "�������ʼ����Ϸ�������˻���ս��", "��ѡ����Ҷ�ս��",
				"ֱ�ӵ������ʼ����Ϸ����", "�˻���ս", "��Ҷ�ս", "�Ѷ�ѡ��Ĭ�ϼ�ģʽ��", "��", "һ��" };
		listener l = new listener();
		ButtonGroup bg = new ButtonGroup();
		for (int i = 0; i < array.length; i++) {
			if (i < 4) {
				JButton jb = new JButton(array[i]);
				jb.setPreferredSize(new Dimension(130, 60));
				east.add(jb);
				jb.setBackground(new Color(102, 186, 183));
				jb.addActionListener(l);
			} else if (i == 4 || i == 5 || i == 6 || i == 7 || i == 8
					|| i == 11) {
				JLabel jl = new JLabel(array[i]);
				east.add(jl);
			} else if (i == 12 || i == 13) {
				JButton jb = new JButton(array[i]);
				jb.setPreferredSize(new Dimension(70, 40));
				east.add(jb);
				jb.setBackground(new Color(93, 172, 129));
				jb.addActionListener(l);
			} else {
				JRadioButton jr = new JRadioButton(array[i]);
				jr.setPreferredSize(new Dimension(120, 60));
				jr.setOpaque(false); // ����͸����
				east.add(jr);
				bg.add(jr);
				jr.setSelected(true); // ��������һ����ѡ��ť
				jr.addActionListener(l);
			}
		}
		jf.add(east, BorderLayout.EAST);

		jf.setVisible(true);

		Graphics g = this.getGraphics();

		l.setG(g);
		l.setarray(this.array); // ������
		l.setboard(this);
		// l.setmap(map); //��mapֵ

		// this.addMouseListener(l);
		// g.setColor(Color.BLACK);
		// g.drawLine(100, 50, 500, 50); //���ܵõ�ͼ�񣬱���Ҫ�ػ淽���л�ͼ
	}

	private int[][] array = new int[15][15];
	private int a = 40, b = 30;

	public void paint(Graphics g) {
		super.paint(g);

		for (int i = 0; i < 15; i++) {
			g.drawLine(30, 30 + i * 40, 30 + 40 * 14, 30 + i * 40);
			g.drawLine(30 + i * 40, 30, 30 + i * 40, 30 + 40 * 14);
			g.setColor(Color.black);
			g.fillOval(30 + 40 * 3 - 5, 30 + 40 * 3 - 5, 10, 10);
			g.fillOval(30 + 40 * 11 - 5, 30 + 40 * 3 - 5, 10, 10);
			g.fillOval(30 + 40 * 3 - 5, 30 + 40 * 11 - 5, 10, 10);
			g.fillOval(30 + 40 * 11 - 5, 30 + 40 * 11 - 5, 10, 10);
		}
		// System.out.println(">>>>>>>>>>>");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == -1) {
					Image black = new ImageIcon("E:\\picture\\data\\black.jpg")
							.getImage();
					g.drawImage(black, b + a * j - a / 2, b + a * i - a / 2, a,
							a, null);
				} else if (array[i][j] == 1) {
					Image white = new ImageIcon("E:\\picture\\data\\white2.jpg")
							.getImage();
					g.drawImage(white, b + a * j - a / 2, b + a * i - a / 2, a,
							a, null);
				}
			}
		}
	}
}
