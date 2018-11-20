package draw2;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class frame extends JFrame implements java.io.Serializable{

	public static void main(String[] args) {
		frame fr = new frame();
		fr.login();
	}
	listener dr = new listener();
	ArrayList<shape> list = new ArrayList<shape>();
	private shape[] array = new shape[1000];
	private MouseEvent e;
	public void login(){
		this.setTitle("Draw");											// 设置窗体的标题
		this.setSize(1300, 800);											// 设置窗体的大小
		this.setDefaultCloseOperation(3);								// 设置窗体的关闭操作，3表示关闭窗体退出程序
		this.setLocationRelativeTo(null);								// 设置窗体显示在屏幕的中央位置
		this.setLayout(new FlowLayout());
		
		//设置窗体背景色
		Color color = this.getBackground();

		String[] array = {"直线","矩形","填充矩形","椭圆","填充椭圆","圆角矩形","填充圆角矩形","圆弧","扇形","文本框",
				"图片","多边形","曲线","喷漆","刷子","擦子","七彩","清空","保存图片","读取图片"};
		for(int i = 0;i<array.length;i++){
			JButton button = new JButton(array[i]);
			add(button);
			button.addActionListener(dr);
		}
		Color[] colorarray = {Color.black,Color.blue,Color.red,Color.yellow,Color.green,color};
		for(int i = 0;i<colorarray.length;i++){
			JButton button = new JButton();
			button.setBackground(colorarray[i]);
			button.setPreferredSize(new Dimension(50,50));
			add(button);
			button.addActionListener(dr);
		}
		
		JSlider slider = new JSlider(1,50);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(7);
		add(slider);
		

		this.setVisible(true);											// 设置窗体为可见  ,必须放在前面否则会出错
		dr.setcolor(color);
		dr.setG(this.getGraphics());
		dr.setdr(this);
		dr.setlist(list);
		slider.addMouseListener(dr);
		this.addMouseListener(dr);
		this.addMouseMotionListener(dr);
	}
	/**
	 * 重绘方法
	 */
	public void paint(Graphics gr){
		super.paint(gr);
		Graphics2D g = (Graphics2D)gr;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		dr.setshapearray(list);//为了解决保存，读取时两边数组数据不同步，在传一次舒数组
		for(int i = 0;i<list.size();i++){
			shape s = list.get(i);
			if(s!=null){
				s.draw(g,e);
			}
			else{
				break;
			}
		}
	}
}
