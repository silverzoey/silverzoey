package draw2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSlider;

public class listener extends MouseAdapter implements MouseListener,
		ActionListener ,java.io.Serializable{
	private int x1, x2, x3, y1, y2, y3, x4, y4, i, j, a, b;
	private Graphics2D g;
	private String str = "我是文本�?";
	private Color c;
	private Color color = Color.black;
	private String type = "直线";
	private int value = 1;
	private int index = 0;
	private boolean flag = true;
	private ArrayList<shape> list;
	File file = new File("src\\draw\\copy.png");
	
	public void setG(Graphics gr) {
		g = (Graphics2D) gr;
	}

	public void setcolor(Color color) {
		c = color;
	}
	public void setshapearray(ArrayList<shape> list) {
		this.list = list;
	}

	private frame dr;

	public void setdr(frame dr) {
		this.dr = dr;
	}

	public void setlist(ArrayList<shape> list) {
		this.list = list;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("")) {
			JButton button = (JButton) e.getSource();
			color = button.getBackground();
			System.out.println("颜色是：" + color);
		} else {
			type = e.getActionCommand();
			System.out.println("选择的图形是�?" + type);
		}
		if (type.equals("清空")) {

			list.clear();
			type = "直线";
			color = Color.black;
			dr.repaint();
		} else if (type.equals("保存图片")) {
			System.out.println("sss");
			try {
				// 根据要保存的文件创建对象输出�?
				FileOutputStream fs = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fs);
				// 将容器中�?绘制的图形利用对象流全部写入选中的文件中
				oos.writeObject(list);
				oos.close();
				fs.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

		} else if (type.equals("读取图片")) {
			System.out.println("ssss");
			try {
				// 选中了相应的文件，则柑橘选中的文件创建对象输入流
				InputStream is = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(is);
				// 将读出来的对象转换成父类对象的容器进行接�?
				dr.list = (ArrayList<shape>) ois.readObject();
				// 遍历容器里面的具体对象，将取出来的对象保存到容器里面
				for (int i = 0; i < list.size(); i++) {
					shape shape = (shape) list.get(i);
					list.add(shape);
					// 调用中心画板的repaint()方法，将容器s里面的图形绘制出�?
				}
				dr.repaint();
				ois.close();
				is.close();

			} catch (Exception e1) {
				e1.printStackTrace();
			}
			type = "直线";
		}
	}

	public void mousePressed(MouseEvent e) {
		// TODO 按下
		x1 = e.getX();
		y1 = e.getY();
		g.setColor(color);
	}

	// public void drawRect(int x, int y, int width, int height) {
	// if ((width < 0) || (height < 0)) {
	// g.drawLine(x, y, x + width - 1, y);
	// g.drawLine(x + width, y, x + width, y + height - 1);
	// g.drawLine(x + width, y + height, x + 1, y + height);
	// g.drawLine(x, y + height, x, y + 1);
	// }
	//
	// if (height == 0 || width == 0) {
	// g.drawLine(x, y, x + width, y + height);
	// } else {
	// g.drawLine(x, y, x + width - 1, y);
	// g.drawLine(x + width, y, x + width, y + height - 1);
	// g.drawLine(x + width, y + height, x + 1, y + height);
	// g.drawLine(x, y + height, x, y + 1);
	// }
	// }
	public void mouseClicked(MouseEvent e) {
		// TODO 点击
		x4 = e.getX();
		y4 = e.getY();
		// double x = 0,y = 0;
		// double a = -1.7,b = -2.5,c = -2,d = -2;
		// for(int i = 0;i < 1000000;i++){
		// x = d*Math.sin(a*x)-Math.sin(b*y);
		// y = c*Math.cos(a*x)-Math.cos(b*y);
		// int m = (int) ((d*Math.sin(a*x)-Math.sin(b*y))*100+350);
		// int n = (int) ((c*Math.cos(a*x)-Math.cos(b*y))*100+350);
		// g.setColor(new Color(250,i%255,i%155));
		// g.drawLine(m, n, m, n);
		// } //分形1
		// double x = 0,y = 0;
		// double a = -2,b = -2,c = -1.2,d = 2;
		// for(int i = 0;i < 1000000;i++){
		// x = Math.sin(a*y)-Math.cos(b*x);
		// y = Math.sin(c*x)-Math.cos(d*y);
		// int m = (int) ((Math.sin(a*y)-Math.cos(b*x))*100+350);
		// int n = (int) ((Math.sin(c*x)-Math.cos(d*y))*100+350);
		// g.setColor(new Color(250,i%255,i%155));
		// g.drawLine(m, n, m, n);
		// } //分形2
		// double x = 0,y = 0;
		// double a = 1.40,b = 1.56,c = 1.40,d = -5.56;
		// for(int i = 0;i < 1000000;i++){
		// x = d*Math.sin(a*x)-Math.sin(b*y);
		// y = c*Math.cos(a*x)-Math.cos(b*y);
		// int m = (int) ((Math.sin(a*y)-Math.sin(b*x))*100+350);
		// int n = (int) ((Math.cos(c*x)-Math.cos(d*y))*100+350);
		// g.setColor(new Color(250,i%255,i%155));
		// g.drawLine(m, n, m, n);
		// } //分形3
	}

	public void mouseReleased(MouseEvent e) {
		// TODO 释放
		if (e.getSource() instanceof JSlider) {
			JSlider slider = (JSlider) e.getSource();
			value = slider.getValue();
			System.out.println("画笔粗细为：" + value);
		} else {
			x2 = e.getX();
			y2 = e.getY();
			// if(type.equals("直线")){
			// g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
			// g.setStroke(new BasicStroke(value));
			// g.drawLine(x1, y1, x2, y2); //划线
			// }
			if (type.equals("多边�?")) {
				g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
						RenderingHints.VALUE_ANTIALIAS_ON);
				g.setStroke(new BasicStroke(value));
				if (flag) {
					g.drawLine(x1, y1, x2, y2);
					flag = false;
					a = x2;
					b = y2;
					i = x1;
					j = y1;
				} else {
					g.drawLine(a, b, x4, y4);
					a = x4;
					b = y4;
					g.drawLine(a, b, x4, y4);
				}
				if (e.getClickCount() == 2) {
					g.drawLine(a, b, i, j);
					flag = true;
				}
				// if (x4 == 0 && y4 == 0) {
				// i = e.getX();
				// j = e.getY();
				// x2 = i;
				// y2 = j;
				// x4 = x2;
				// y4 = y2;
				// g.drawLine(i, j, x2, y2);
				// } else {
				// x2 = x4;
				// y2 = y4;
				// x4 = e.getX();
				// y4 = e.getY();
				// g.drawLine(x2, y2, x4, y4);
				// if (e.getClickCount() == 2) {
				// g.drawLine(i, j, x4, y4);
				// x4 = 0;
				// y4 = 0;
				// }
				// }
			}
			// else if(type.equals("矩形")){
			// g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
			// g.setStroke(new BasicStroke(value));
			// //
			// g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
			// drawRect(x1, y1,x2-x1,y2-y1); //矩形，为�?么不能从右下�?左上画？ 解决：改变类的输出方�?
			// // g.draw3DRect(x1, y1, x2-x1, y2-y1, true);
			// //3D矩形：所谓的3D，只是用了更深或更浅的颜色来描绘两条边�?�已。噗�?
			// }
			// else if(type.equals("填充矩形")){
			// g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
			// g.setStroke(new BasicStroke(value));
			// g.fillRect(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1)); //实心矩形
			// // g.fill3DRect(x1, y1, x2-x1, y2-y1, true); //填充3D矩形
			// http://tieba.baidu.com/p/1604045329
			// }
			// else if(type.equals("椭圆")){
			// g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
			// g.setStroke(new BasicStroke(value));
			// g.drawOval(x1, y1, x2-x1, y2-y1); //椭圆
			// }
			// else if(type.equals("填充椭圆")){
			// g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
			// g.setStroke(new BasicStroke(value));
			// g.fillOval(x1, y1, x2-x1, y2-y1); //实心椭圆
			// }
			// else if(type.equals("圆角矩形")){
			// g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
			// g.setStroke(new BasicStroke(value));
			// g.drawRoundRect(x1, y1, x2-x1, y2-y1, 10, 10); //圆角矩形
			// }
			// else if(type.equals("填充圆角矩形")){
			// g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
			// g.setStroke(new BasicStroke(value));
			// g.fillRoundRect(x1, y1, x2-x1, y2-y1, 10, 10); //实心圆角矩形
			// }
			// else if(type.equals("圆弧")){
			// g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
			// g.setStroke(new BasicStroke(value));
			// g.drawArc(x1, y1, x2-x1, y2-y1, 270, 180); //圆弧：内切圆圆弧
			// }
			// else if(type.equals("扇形")){
			// g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
			// g.setStroke(new BasicStroke(value));
			// g.fillArc(x1, y1, x2-x1, y2-y1, 270, 180); //实心圆弧：扇�?
			// }
			if (type.equals("文本�?")) {
				g.setFont(new Font("宋体", 1, 15));
				g.setBackground(color);
				g.drawString(str, x1, y1); // 绘制�?段文本，其中 (x, y) 坐标指的是文本序列的 左下�?
											// 的位�?
			} else if (type.equals("图片")) {
				Image img = new ImageIcon("E:\\picture\\silverzoe\\shoot.png")
						.getImage();
				g.drawImage(img, x1, y1, x2 - x1, y2 - y1, null); // 绘制图片
			}

			shape s = new shape(str, c, color, type, value, x1, x2, x3, x4, y1,
					y2, y3, y4, i, j);
			s.draw(g, e);
			if (index <= 999) {
				list.add(s);
				index++;
				System.out.println("你已经绘制了" + index + "个图�?");
			}
		}
	}

	public void mouseEntered(MouseEvent e) {
		// System.out.println("进入");
	}

	public void mouseExited(MouseEvent e) {
		// System.out.println("离开");
	}

	public void mouseDragged(MouseEvent e) { // 拖动
		x3 = e.getX();
		y3 = e.getY();
		// System.out.println("x3="+x3+"      y3="+y3);
		int m;
		if (type.equals("曲线")) {
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g.setStroke(new BasicStroke(value));
			g.setColor(color);
			g.drawLine(x1, y1, x3, y3); // 曲线
			x1 = x3;
			y1 = y3;
		} else if (type.equals("喷漆")) {
			Random rand = new Random();
			for (int i = 0; i < 15; i++) {
				int emptx = rand.nextInt(20);
				int empty = rand.nextInt(20);
				g.setStroke(new BasicStroke(value));
				g.setColor(color);
				g.drawLine(x3 + emptx, y3 + empty, x3 + emptx, y3 + empty);
			} // 喷漆
		} else if (type.equals("刷子")) {
			g.setStroke(new BasicStroke(10));
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g.setColor(color);
			g.drawLine(x1, y1, x3, y3);
			x1 = x3;
			y1 = y3; // 刷子
		} else if (type.equals("擦子")) {
			g.setStroke(new BasicStroke(20));
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g.setColor(c);
			g.drawLine(x1, y1, x3, y3);
			x1 = x3;
			y1 = y3; // 擦子
		} else if (type.equals("七彩")) {
			g.setStroke(new BasicStroke(20));
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			for (m = 0; m < 50; m++) {
				g.fillOval(x3 - 50 + m / 2, y3 - 50 + m / 2, 100 - m, 100 - m);
				g.setColor(new Color(5 * m++, 5 * m++, 5 * m++));
			}
			// g.setColor(new Color(x3 * y3 * x3 * y3));
			// g.setColor(new Color(m*3,0,0));

		}
	}

}
