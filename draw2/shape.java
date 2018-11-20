package draw2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;

public class shape implements java.io.Serializable{

	private int x1, x2, x3, y1, y2, y3, x4, y4, i, j;
	private String str;
	private Color c;
	private Color color;
	private String type;
	private int value;

	public shape(String str, Color c, Color color, String type, int value,
			int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4,
			int i, int j) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;
		this.i = i;
		this.j = j;
		this.str = str;
		this.c = c;
		this.color = color;
		this.type = type;
		this.value = value;
	}

	public void drawRect(int x, int y, int width, int height,Graphics2D g) {
		if ((width < 0) || (height < 0)) {
			g.drawLine(x, y, x + width - 1, y);
			g.drawLine(x + width, y, x + width, y + height - 1);
			g.drawLine(x + width, y + height, x + 1, y + height);
			g.drawLine(x, y + height, x, y + 1);
		}

		if (height == 0 || width == 0) {
			g.drawLine(x, y, x + width, y + height);
		} else {
			g.drawLine(x, y, x + width - 1, y);
			g.drawLine(x + width, y, x + width, y + height - 1);
			g.drawLine(x + width, y + height, x + 1, y + height);
			g.drawLine(x, y + height, x, y + 1);
		}
	}

	public void draw(Graphics2D g,MouseEvent e) {
		g.setColor(color);
		g.setStroke(new BasicStroke(value));
		if (type.equals("ֱ��")) {
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g.setStroke(new BasicStroke(value));
			g.drawLine(x1, y1, x2, y2); // ����
		} else if (type.equals("����")) {
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g.setStroke(new BasicStroke(value));
			drawRect(x1, y1, x2 - x1, y2 - y1,g); // ���Σ�Ϊʲô���ܴ����������ϻ��� ������ı���������ʽ
			// g.draw3DRect(x1, y1, x2-x1, y2-y1, true);
			// //3D���Σ���ν��3D��ֻ�����˸�����ǳ����ɫ����������߶��ѡ�����
		} else if (type.equals("������")) {
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g.setStroke(new BasicStroke(value));
			g.fillRect(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1)); // ʵ�ľ���
			// g.fill3DRect(x1, y1, x2-x1, y2-y1, true); //���3D����
			// http://tieba.baidu.com/p/1604045329
		} else if (type.equals("��Բ")) {
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g.setStroke(new BasicStroke(value));
			g.drawOval(x1, y1, x2 - x1, y2 - y1); // ��Բ
		} else if (type.equals("�����Բ")) {
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g.setStroke(new BasicStroke(value));
			g.fillOval(x1, y1, x2 - x1, y2 - y1); // ʵ����Բ
		} else if (type.equals("Բ�Ǿ���")) {
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g.setStroke(new BasicStroke(value));
			g.drawRoundRect(x1, y1, x2 - x1, y2 - y1, 10, 10); // Բ�Ǿ���
		} else if (type.equals("���Բ�Ǿ���")) {
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g.setStroke(new BasicStroke(value));
			g.fillRoundRect(x1, y1, x2 - x1, y2 - y1, 10, 10); // ʵ��Բ�Ǿ���
		} else if (type.equals("Բ��")) {
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g.setStroke(new BasicStroke(value));
			g.drawArc(x1, y1, x2 - x1, y2 - y1, 270, 180); // Բ��������ԲԲ��
		} else if (type.equals("����")) {
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g.setStroke(new BasicStroke(value));
			g.fillArc(x1, y1, x2 - x1, y2 - y1, 270, 180); // ʵ��Բ��������
		}
//		if (type.equals("�����")) {
//			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
//					RenderingHints.VALUE_ANTIALIAS_ON);
//			g.setStroke(new BasicStroke(value));
//			if (x4 == 0 && y4 == 0) {
//				i = e.getX();
//				j = e.getY();
//				x2 = i;
//				y2 = j;
//				x4 = x2;
//				y4 = y2;
//				g.drawLine(i, j, x2, y2);
//			} else {
//				x2 = x4;
//				y2 = y4;
//				x4 = e.getX();
//				y4 = e.getY();
//				g.drawLine(x2, y2, x4, y4);
//				if (e.getClickCount() == 2) {
//					g.drawLine(i, j, x4, y4);
//					x4 = 0;
//					y4 = 0;
//				}
//			}
//		}
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Color getC() {
		return c;
	}

	public void setC(Color c) {
		this.c = c;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getY3() {
		return y3;
	}

	public void setY3(int y3) {
		this.y3 = y3;
	}

	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

	public int getX4() {
		return x4;
	}

	public void setX4(int x4) {
		this.x4 = x4;
	}

	public int getY4() {
		return y4;
	}

	public void setY4(int y4) {
		this.y4 = y4;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
}
