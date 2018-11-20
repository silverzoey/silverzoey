package chess4.copy;

import java.util.HashMap;

public class getvalue {
	public int r, c;
	private int[][] array;
	private int[][] weightArray = new int[15][15];

	public getvalue(int r, int c, int array[][]) {
		this.r = r;
		this.c = c;
		this.array = array;
	}

	public void get() {
		HashMap<String, Integer> mape = new HashMap<String, Integer>(); // 简单模式
		mape.put("010", 10); // 白
		mape.put("0-10", 10); // 黑
		mape.put("0110", 100); // 白
		mape.put("0-1-10", 100); // 黑
		mape.put("01110", 1000); // 白
		mape.put("0-1-1-10", 1000); // 黑
		mape.put("011110", 10000); // 白
		mape.put("0-1-1-1-10", 10000); // 黑
		mape.put("1-10", 1); // 黑
		mape.put("-110", 1); // 白
		mape.put("01-1", 1); // 白
		mape.put("0-11", 1); // 黑
		mape.put("1-1-10", 5); // 黑
		mape.put("-1110", 5); // 白
		mape.put("011-1", 5); // 白
		mape.put("0-1-11", 5); // 黑
		mape.put("1-1-1-10", 50); // 黑
		mape.put("-11110", 50); // 白
		mape.put("0-1-1-11", 50); // 黑
		mape.put("0111-1", 50); // 白
		mape.put("1-1-1-1-10", 10000); // 黑
		mape.put("-111110", 10000); // 白
		mape.put("01111-1", 10000); // 白
		mape.put("0-1-1-1-11", 10000); // 黑

		for (r = 0; r < array.length; r++) {
			for (c = 0; c < array[r].length; c++) {
				if (array[r][c] == 0) {
					String code = countHL(r, c);
					Integer value = mape.get(code);
					if (value != null) {
						weightArray[r][c] += value;
					}
					code = countHR(r, c);
					value = mape.get(code);
					if (value != null) {
						weightArray[r][c] += value;
					}
					code = countSN(r, c);
					value = mape.get(code);
					if (value != null) {
						weightArray[r][c] += value;
					}
					code = countSS(r, c);
					value = mape.get(code);
					if (value != null) {
						weightArray[r][c] += value;
					}
					code = countZS(r, c);
					value = mape.get(code);
					if (value != null) {
						weightArray[r][c] += value;
					}
					code = countYX(r, c);
					value = mape.get(code);
					if (value != null) {
						weightArray[r][c] += value;
					}
					code = countZX(r, c);
					value = mape.get(code);
					if (value != null) {
						weightArray[r][c] += value;
					}
					code = countYS(r, c);
					value = mape.get(code);
					if (value != null) {
						weightArray[r][c] += value;
					}
					// System.out.println("weightArray="+weightArray[r][c]);
				}
			}
		}
		int max = weightArray[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				// System.out.print(weightArray[i][j]+"\t");
				if (weightArray[i][j] > max) {
					max = weightArray[i][j];
					r = i;
					c = j;
				}
			}
			// System.out.println();
		}
		for (int i = 0; i < weightArray.length; i++) {
			for (int j = 0; j < weightArray[i].length; j++) {
				weightArray[i][j] = 0;
			}
		}
		// System.out.println("r="+r+"     c="+c);
	}

	public String countHL(int r, int c) { // 向左，原点无子
		String code = "0";
		int chess = 0;
		for (int c1 = c - 1; c1 >= 0; c1--) {
			if (array[r][c1] == 0) {
				if (c1 == c - 1) { // 相邻无子
					break;
				} else {
					code = array[r][c1] + code;
					break;
				}
			} else {
				if (chess == 0) {
					code = array[r][c1] + code; // 10
					chess = array[r][c1];
				} else if (chess == array[r][c1]) {
					code = array[r][c1] + code; // ...110
				} else {
					code = array[r][c1] + code; // -110
					break;
				}
			}
		}
		return code;
	}

	public String countHR(int r, int c) { // 向右，原点无子
		String code = "0";
		int chess = 0;
		for (int c1 = c + 1; c1 < array[r].length; c1++) {
			if (array[r][c1] == 0) {
				if (c1 == c + 1) { // 相邻无子
					break;
				} else {
					code = code + array[r][c1];
					break;
				}
			} else {
				if (chess == 0) {
					code = code + array[r][c1]; // 01
					chess = array[r][c1];
				} else if (chess == array[r][c1]) {
					code = code + array[r][c1]; // 011...
				} else {
					code = code + array[r][c1]; // 01-1
					break;
				}
			}
		}
		return code;
	}

	public String countSN(int r, int c) { // 向上，原点无子
		String code = "0";
		int chess = 0;
		for (int r1 = r - 1; r1 >= 0; r1--) {
			if (array[r1][c] == 0) {
				if (r1 == r - 1) { // 相邻无子
					break;
				} else {
					code = array[r1][c] + code;
					break;
				}
			} else {
				if (chess == 0) {
					code = array[r1][c] + code; // 10
					chess = array[r1][c];
				} else if (chess == array[r1][c]) {
					code = array[r1][c] + code; // ...110
				} else {
					code = array[r1][c] + code; // -110
					break;
				}
			}
		}
		return code;
	}

	public String countSS(int r, int c) { // 向下，原点无子
		String code = "0";
		int chess = 0;
		for (int r1 = r + 1; r1 < array.length; r1++) {
			if (array[r1][c] == 0) {
				if (r1 == r + 1) { // 相邻无子
					break;
				} else {
					code = code + array[r1][c];
					break;
				}
			} else {
				if (chess == 0) {
					code = code + array[r1][c]; // 01
					chess = array[r1][c];
				} else if (chess == array[r1][c]) {
					code = code + array[r1][c]; // 011...
				} else {
					code = code + array[r1][c]; // 01-1
					break;
				}
			}
		}
		return code;
	}

	public String countZS(int r, int c) { // 向左上，原点无子
		String code = "0";
		int chess = 0;
		for (int r1 = r - 1, c1 = c - 1; r1 >= 0 && c1 >= 0; r1--, c1--) {
			if (array[r1][c1] == 0) {
				if (r1 == r - 1 && c1 == c - 1) { // 相邻无子
					break;
				} else {
					code = array[r1][c1] + code;
					break;
				}
			} else {
				if (chess == 0) {
					code = array[r1][c1] + code; // 10
					chess = array[r1][c1];
				} else if (chess == array[r1][c1]) {
					code = array[r1][c1] + code; // ...110
				} else {
					code = array[r1][c1] + code; // -110
					break;
				}
			}
		}
		return code;
	}

	public String countYX(int r, int c) { // 向右下，原点无子
		String code = "0";
		int chess = 0;
		for (int r1 = r + 1, c1 = c + 1; r1 < array.length
				&& c1 < array[r].length; r1++, c1++) {
			if (array[r1][c1] == 0) {
				if (r1 == r + 1 && c1 == c + 1) { // 相邻无子
					break;
				} else {
					code = code + array[r1][c1];
					break;
				}
			} else {
				if (chess == 0) {
					code = code + array[r1][c1]; // 01
					chess = array[r1][c1];
				} else if (chess == array[r1][c1]) {
					code = code + array[r1][c1]; // 011...
				} else {
					code = code + array[r1][c1]; // 01-1
					break;
				}
			}
		}
		return code;
	}

	public String countZX(int r, int c) { // 向左下，原点无子
		String code = "0";
		int chess = 0;
		for (int r1 = r + 1, c1 = c - 1; r1 < array.length && c1 >= 0; r1++, c1--) {
			if (array[r1][c1] == 0) {
				if (r1 == r + 1 && c1 == c - 1) { // 相邻无子
					break;
				} else {
					code = array[r1][c1] + code;
					break;
				}
			} else {
				if (chess == 0) {
					code = array[r1][c1] + code; // 10
					chess = array[r1][c1];
				} else if (chess == array[r1][c1]) {
					code = array[r1][c1] + code; // ...110
				} else {
					code = array[r1][c1] + code; // -110
					break;
				}
			}
		}
		return code;
	}

	public String countYS(int r, int c) { // 向右上，原点无子
		String code = "0";
		int chess = 0;
		for (int r1 = r - 1, c1 = c + 1; r1 >= 0 && c1 < array[r].length; r1--, c1++) {
			if (array[r1][c1] == 0) {
				if (r1 == r - 1 && c1 == c + 1) { // 相邻无子
					break;
				} else {
					code = code + array[r1][c1];
					break;
				}
			} else {
				if (chess == 0) {
					code = code + array[r1][c1]; // 01
					chess = array[r1][c1];
				} else if (chess == array[r1][c1]) {
					code = code + array[r1][c1]; // 011...
				} else {
					code = code + array[r1][c1]; // 01-1
					break;
				}
			}
		}
		return code;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

}
