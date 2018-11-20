package chess4.copy;

import java.awt.Graphics2D;

import javax.swing.JOptionPane;

public class win {
	Graphics2D g;

	public void judgeH(int[][] array, int r, int c,board bd,listener l) {
		int count =1;
		for (int c1 = c - 1; c1 >= 0; c1--) {
			if (array[r][c1] == array[r][c]) {
				count++;
			} else {
				break;
			}
		}
		for (int c1 = c + 1; c1 < array[r].length; c1++) {
			if (array[r][c1] == array[r][c]) {
				count++;
			} else {
				break;
			}
		}
		if (count >= 5) {
			if (array[r][c] == -1) {
					JOptionPane.showMessageDialog(null, "游戏结束：黑棋获胜");
				} else if (array[r][c] == 1) {
					JOptionPane.showMessageDialog(null, "游戏结束：白棋获胜");
				}
			bd.removeMouseListener(l);
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++) {
					array[i][j] = 0;
				}
			}
			}
	}

	public void judgeS(int[][] array, int r, int c,board bd,listener l) {
		int count =1;
		for (int r1 = r - 1; r1 >= 0; r1--) {
			if (array[r1][c] == array[r][c]) {
				count++;
			} else {
				break;
			}
		}
		for (int r1 = r + 1; r1 < array.length; r1++) {
			if (array[r1][c] == array[r][c]) {
				count++;
			} else {
				break;
			}
		}
		if (count >= 5) {
			if (array[r][c] == -1) {
				JOptionPane.showMessageDialog(null, "游戏结束：黑棋获胜");
			} else if (array[r][c] == 1) {
				JOptionPane.showMessageDialog(null, "游戏结束：白棋获胜");
			}
			bd.removeMouseListener(l);
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++) {
					array[i][j] = 0;
				}
			}
		}
	}

	public void judgeP(int[][] array, int r, int c,board bd,listener l) {
		int count =1;
		for (int r1 = r + 1, c1 = c - 1; r1 < array.length && c1 >= 0; r1++, c1--) {
			if (array[r1][c1] == array[r][c]) {
				count++;
			} else {
				break;
			}
		}
		for (int r1 = r - 1, c1 = c + 1; r1 >= 0 && c1 < array[r].length; r1--, c1++) {
			if (array[r1][c1] == array[r][c]) {
				count++;
			} else {
				break;
			}
		}
		if (count >= 5) {
			if (array[r][c] == -1) {
				JOptionPane.showMessageDialog(null, "游戏结束：黑棋获胜");
			} else if (array[r][c] == 1) {
				JOptionPane.showMessageDialog(null, "游戏结束：白棋获胜");
			}
			bd.removeMouseListener(l);
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++) {
					array[i][j] = 0;
				}
			}
		}
	}

	public void judgeN(int[][] array, int r, int c,board bd,listener l) {
		int count =1;
		for (int r1 = r + 1, c1 = c + 1; r1 < array.length
				&& c1 < array[r].length; r1++, c1++) {
			if (array[r1][c1] == array[r][c]) {
				count++;
			} else {
				break;
			}
		}
		for (int r1 = r - 1, c1 = c - 1; r1 >= 0 && c1 >= 0; r1--, c1--) {
			if (array[r1][c1] == array[r][c]) {
				count++;
			} else {
				break;
			}
		}
		if (count >= 5) {
			if (array[r][c] == -1) {
				JOptionPane.showMessageDialog(null, "游戏结束：黑棋获胜");
			} else if (array[r][c] == 1) {
				JOptionPane.showMessageDialog(null, "游戏结束：白棋获胜");
			}
			bd.removeMouseListener(l);
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++) {
					array[i][j] = 0;
				}
			}
		}
	}

}
