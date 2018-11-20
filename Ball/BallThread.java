package Ball;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

public class BallThread extends Thread{
	private Graphics g;
	private int x,y,vx,vy;
	private BallFrame bf;
	private ArrayList<Ball> list;
	public boolean Pauseflag=true;
	
	public BallThread(int x,int y,Graphics g,BallFrame bf,ArrayList<Ball> list){
		this.x =x;
		this.y = y;
		this.g = g;
		this.bf = bf;
		this.list = list;
	}
	
	public void run(){
		while(Pauseflag){
			for(int i =0;i<list.size();i++){
				for(int j = 0;j<list.size()&&j!=i;j++){
					
				}
				Ball ball = (Ball)list.get(i);
				int x1 = ball.x;
				int y1 = ball.y;
				ball.clear(g, bf);
				ball.draw((Graphics2D)g,bf);
				ball.move(g);
				
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			}
		}
	}
	

