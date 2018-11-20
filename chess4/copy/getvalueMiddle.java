package chess4.copy;

import java.util.HashMap;

public class getvalueMiddle {
	public int r, c;
	private int[][] array;
	private int[][] weightArray = new int[15][15];

	public getvalueMiddle(int r, int c, int array[][]) {
		this.r = r;
		this.c = c;
		this.array = array;
	}

	public void get() {
		HashMap<String, Integer> mapm = new HashMap<String, Integer>(); // 一般模式
		mapm.put("0100", 4);
		mapm.put("0010", 4);
		mapm.put("010-1", 4);
		mapm.put("-1010", 4);
		mapm.put("010", 4);
		mapm.put("00-10100", 4);
		mapm.put("0-10100", 4);
		mapm.put("-10100", 4);
		mapm.put("00-1010", 4);
		mapm.put("00-1010-1", 4);
		mapm.put("0-1010-1", 4);
		mapm.put("-1010-1", 4);
		mapm.put("1-10100", 4);
		mapm.put("1-1010", 4);
		mapm.put("-10100", 4);
		mapm.put("1-1010-1", 4);
		mapm.put("10-10100", 4);
		mapm.put("10-1010", 4);
		mapm.put("10-1010-1", 4);
		mapm.put("0010-100", 4);
		mapm.put("010-100", 4);
		mapm.put("0010-10", 4);
		mapm.put("0010-1", 4);
		mapm.put("-1010-100", 4);
		mapm.put("-1010-10", 4);
		mapm.put("0010-11", 4);
		mapm.put("010-11", 4);
		mapm.put("-1010-11", 4);
		mapm.put("0010-101", 4);
		mapm.put("010-101", 4);
		mapm.put("-1010-101", 4);
		mapm.put("01", 1);
		mapm.put("10", 1);
		mapm.put("01-1", 1);
		mapm.put("-110", 1);

		mapm.put("01100", 16);
		mapm.put("0110-1", 16);
		mapm.put("00110", 16);
		mapm.put("-10110", 16);
		mapm.put("0110", 16);
		mapm.put("0010100", 16);
		mapm.put("-1010100", 16);
		mapm.put("001010-1", 16);
		mapm.put("-101010-1", 16);
		mapm.put("00-101100", 16);
		mapm.put("00-10110-1", 16);
		mapm.put("1-101100", 16);
		mapm.put("1-10110-1", 16);
		mapm.put("10-101100", 16);
		mapm.put("10-10110-1", 16);
		mapm.put("011", 4);
		mapm.put("110", 4);
		mapm.put("00101", 4);
		mapm.put("10100", 4);
		mapm.put("011-1", 4);
		mapm.put("-1110", 4);
		mapm.put("00101-1", 4);
		mapm.put("-110100", 4);

		mapm.put("011100", 1024);
		mapm.put("01110-1", 1024);
		mapm.put("001110", 1024);
		mapm.put("-101110", 1024);
		mapm.put("01110", 1024);
		mapm.put("00110100", 1024);
		mapm.put("-10110100", 1024);
		mapm.put("0011010-1", 1024);
		mapm.put("-1011010-1", 1024);
		mapm.put("00101100", 1024);
		mapm.put("-10101100", 1024);
		mapm.put("0010110-1", 1024);
		mapm.put("-1010110-1", 1024);
		mapm.put("0111", 256);
		mapm.put("1110", 256);
		mapm.put("0111-1", 256);
		mapm.put("-11110", 256);
		mapm.put("001011", 256);
		mapm.put("001101", 256);
		mapm.put("110100", 256);
		mapm.put("101100", 256);
		mapm.put("-1110100", 256);
		mapm.put("-1101100", 256);
		mapm.put("001011-1", 256);
		mapm.put("001101-1", 256);

		mapm.put("0111100", 16384);
		mapm.put("011110-1", 16384);
		mapm.put("0011110", 16384);
		mapm.put("-1011110", 16384);
		mapm.put("011110", 16384);
		mapm.put("001110100", 16384);
		mapm.put("-101110100", 16384);
		mapm.put("00111010-1", 16384);
		mapm.put("-10111010-1", 16384);
		mapm.put("001101100", 16384);
		mapm.put("-101101100", 16384);
		mapm.put("00110110-1", 16384);
		mapm.put("-10110110-1", 16384);
		mapm.put("001011100", 16384);
		mapm.put("-101011100", 16384);
		mapm.put("00101110-1", 16384);
		mapm.put("-10101110-1", 16384);
		mapm.put("-111110-100", 16384);
		mapm.put("-111110-101", 16384);
		mapm.put("-111110-11", 16384);
		mapm.put("00-101111-1", 16384);
		mapm.put("10-101111-1", 16384);
		mapm.put("1-101111-1", 16384);
		mapm.put("01111", 16384);
		mapm.put("11110", 16384);
		mapm.put("01111-1", 16384);
		mapm.put("-111110", 16384);
		mapm.put("0010111", 16384);
		mapm.put("0011011", 16384);
		mapm.put("0011101", 16384);
		mapm.put("1110100", 16384);
		mapm.put("1101100", 16384);
		mapm.put("1011100", 16384);
		mapm.put("0011101-1", 16384);
		mapm.put("0011011-1", 16384);
		mapm.put("0010111-1", 16384);
		mapm.put("-11110100", 16384);
		mapm.put("-11101100", 16384);
		mapm.put("-11011100", 16384);

		mapm.put("0010111100", 16384);
		mapm.put("001011110-1", 16384);
		mapm.put("-1010111100", 16384);
		mapm.put("00101111-1", 16384);
		mapm.put("-110111100", 16384);
		mapm.put("-101011110-1", 16384);
		mapm.put("-11011110-1", 16384);
		mapm.put("-10101111-1", 16384);
		mapm.put("-1101111-1", 16384);
		mapm.put("001011110", 16384);
		mapm.put("-101011110", 16384);
		mapm.put("-11011110", 16384);
		mapm.put("00101111-1", 16384);
		mapm.put("-10101111-1", 16384);
		mapm.put("-1101111-1", 16384);
		mapm.put("00101111", 16384);
		mapm.put("-10101111", 16384);
		mapm.put("-1101111", 16384);
		mapm.put("010111100", 16384);
		mapm.put("01011110-1", 16384);
		mapm.put("0101111-1", 16384);
		mapm.put("-110111100", 16384);
		mapm.put("-11011110-1", 16384);
		mapm.put("-1101111-1", 16384);
		mapm.put("10111100", 16384);
		mapm.put("1011110-1", 16384);
		mapm.put("101111-1", 16384);
		mapm.put("0011110100", 16384);
		mapm.put("-1011110100", 16384);
		mapm.put("001111010-1", 16384);
		mapm.put("-111110100", 16384);
		mapm.put("00111101-1", 16384);
		mapm.put("-101111010-1", 16384);
		mapm.put("-10111101-1", 16384);
		mapm.put("-11111010-1", 16384);
		mapm.put("-1111101-1", 16384);
		mapm.put("001111010", 16384);
		mapm.put("-101111010", 16384);
		mapm.put("-11111010", 16384);
		mapm.put("00111101-1", 16384);
		mapm.put("-10111101-1", 16384);
		mapm.put("-1111101-1", 16384);
		mapm.put("00111101", 16384);
		mapm.put("-10111101", 16384);
		mapm.put("-1111101", 16384);
		mapm.put("011110100", 16384);
		mapm.put("01111010-1", 16384);
		mapm.put("0111101-1", 16384);
		mapm.put("-111110100", 16384);
		mapm.put("-11111010-1", 16384);
		mapm.put("-1111101-1", 16384);
		mapm.put("11110100", 16384);
		mapm.put("1111010-1", 16384);
		mapm.put("111101-1", 16384);
		mapm.put("0011011100", 16384);
		mapm.put("001101110-1", 16384);
		mapm.put("-1011011100", 16384);
		mapm.put("00110111-1", 16384);
		mapm.put("-111011100", 16384);
		mapm.put("-101101110-1", 16384);
		mapm.put("-10110111-1", 16384);
		mapm.put("-11101110-1", 16384);
		mapm.put("-1110111-1", 16384);
		mapm.put("001101110", 16384);
		mapm.put("-101101110", 16384);
		mapm.put("-11101110", 16384);
		mapm.put("-10110111-1", 16384);
		mapm.put("-1110111-1", 16384);
		mapm.put("00110111-1", 16384);
		mapm.put("00110111", 16384);
		mapm.put("-10110111", 16384);
		mapm.put("-1110111", 16384);
		mapm.put("011011100", 16384);
		mapm.put("01101110-1", 16384);
		mapm.put("0110111-1", 16384);
		mapm.put("-111011100", 16384);
		mapm.put("-11101110-1", 16384);
		mapm.put("-1110111-1", 16384);
		mapm.put("11011100", 16384);
		mapm.put("1101110-1", 16384);
		mapm.put("110111-1", 16384);
		mapm.put("0011101100", 16384);
		mapm.put("001110110-1", 16384);
		mapm.put("-1011101100", 16384);
		mapm.put("-111101100", 16384);
		mapm.put("00111011-1", 16384);
		mapm.put("-101110110-1", 16384);
		mapm.put("-11110110-1", 16384);
		mapm.put("-10111011-1", 16384);
		mapm.put("-1111011-1", 16384);
		mapm.put("001110110", 16384);
		mapm.put("-101110110", 16384);
		mapm.put("-11110110", 16384);
		mapm.put("00111011-1", 16384);
		mapm.put("-10111011-1", 16384);
		mapm.put("-1111011-1", 16384);
		mapm.put("00111011", 16384);
		mapm.put("-10111011", 16384);
		mapm.put("-1111011", 16384);
		mapm.put("011101100", 16384);
		mapm.put("01110110-1", 16384);
		mapm.put("0111011-1", 16384);
		mapm.put("-111101100", 16384);
		mapm.put("-11110110-1", 16384);
		mapm.put("-1111011-1", 16384);
		mapm.put("11101100", 16384);
		mapm.put("1110110-1", 16384);
		mapm.put("111011-1", 16384);
		mapm.put("00110111100", 16384);
		mapm.put("0011011110-1", 16384);
		mapm.put("-10110111100", 16384);
		mapm.put("001101111-1", 16384);
		mapm.put("-1110111100", 16384);
		mapm.put("-1011011110-1", 16384);
		mapm.put("-111011110-1", 16384);
		mapm.put("-101101111-1", 16384);
		mapm.put("-11101111-1", 16384);
		mapm.put("0011011110", 16384);
		mapm.put("-1011011110", 16384);
		mapm.put("-111011110", 16384);
		mapm.put("001101111-1", 16384);
		mapm.put("-101101111-1", 16384);
		mapm.put("-11101111-1", 16384);
		mapm.put("001101111", 16384);
		mapm.put("-101101111", 16384);
		mapm.put("-11101111", 16384);
		mapm.put("0110111100", 16384);
		mapm.put("011011110-1", 16384);
		mapm.put("01101111-1", 16384);
		mapm.put("-1110111100", 16384);
		mapm.put("-111011110-1", 16384);
		mapm.put("-11101111-1", 16384);
		mapm.put("110111100", 16384);
		mapm.put("11011110-1", 16384);
		mapm.put("1101111-1", 16384);
		mapm.put("00111101100", 16384);
		mapm.put("0011110110-1", 16384);
		mapm.put("-10111101100", 16384);
		mapm.put("-1111101100", 16384);
		mapm.put("001111011-1", 16384);
		mapm.put("-1011110110-1", 16384);
		mapm.put("-111110110-1", 16384);
		mapm.put("-101111011-1", 16384);
		mapm.put("-11111011-1", 16384);
		mapm.put("0011110110", 16384);
		mapm.put("-1011110110", 16384);
		mapm.put("-111110110", 16384);
		mapm.put("001111011-1", 16384);
		mapm.put("-101111011-1", 16384);
		mapm.put("-11111011-1", 16384);
		mapm.put("001111011", 16384);
		mapm.put("-101111011", 16384);
		mapm.put("-11111011", 16384);
		mapm.put("0111101100", 16384);
		mapm.put("011110110-1", 16384);
		mapm.put("01111011-1", 16384);
		mapm.put("-1111101100", 16384);
		mapm.put("-111110110-1", 16384);
		mapm.put("-11111011-1", 16384);
		mapm.put("111101100", 16384);
		mapm.put("11110110-1", 16384);
		mapm.put("1111011-1", 16384);
		mapm.put("00111011100", 16384);
		mapm.put("0011101110-1", 16384);
		mapm.put("-10111011100", 16384);
		mapm.put("001110111-1", 16384);
		mapm.put("-1111011100", 16384);
		mapm.put("-1011101110-1", 16384);
		mapm.put("-101110111-1", 16384);
		mapm.put("-111101110-1", 16384);
		mapm.put("-11110111-1", 16384);
		mapm.put("0011101110", 16384);
		mapm.put("-1011101110", 16384);
		mapm.put("-111101110", 16384);
		mapm.put("001110111-1", 16384);
		mapm.put("-101110111-1", 16384);
		mapm.put("-11110111-1", 16384);
		mapm.put("001110111", 16384);
		mapm.put("-101110111", 16384);
		mapm.put("-11110111", 16384);
		mapm.put("0111011100", 16384);
		mapm.put("011101110-1", 16384);
		mapm.put("01110111-1", 16384);
		mapm.put("-111101110-1", 16384);
		mapm.put("-1111011100", 16384);
		mapm.put("-11110111-1", 16384);
		mapm.put("111011100", 16384);
		mapm.put("11101110-1", 16384);
		mapm.put("1110111-1", 16384);
		mapm.put("001111011100", 16384);
		mapm.put("00111101110-1", 16384);
		mapm.put("-101111011100", 16384);
		mapm.put("-11111011100", 16384);
		mapm.put("0011110111-1", 16384);
		mapm.put("-10111101110-1", 16384);
		mapm.put("-1111101110-1", 16384);
		mapm.put("-111110111-1", 16384);
		mapm.put("-1011110111-1", 16384);
		mapm.put("00111101110", 16384);
		mapm.put("-10111101110", 16384);
		mapm.put("-1111101110", 16384);
		mapm.put("0011110111-1", 16384);
		mapm.put("-1011110111-1", 16384);
		mapm.put("-111110111-1", 16384);
		mapm.put("0011110111", 16384);
		mapm.put("-1011110111", 16384);
		mapm.put("-111110111", 16384);
		mapm.put("01111011100", 16384);
		mapm.put("0111101110-1", 16384);
		mapm.put("011110111-1", 16384);
		mapm.put("-11111011100", 16384);
		mapm.put("-1111101110-1", 16384);
		mapm.put("-111110111-1", 16384);
		mapm.put("1111011100", 16384);
		mapm.put("11110111-1", 16384);
		mapm.put("111101110-1", 16384);
		mapm.put("001110111100", 16384);
		mapm.put("00111011110-1", 16384);
		mapm.put("-101110111100", 16384);
		mapm.put("0011101111-1", 16384);
		mapm.put("-11110111100", 16384);
		mapm.put("001110111100", 16384);
		mapm.put("-101110111100", 16384);
		mapm.put("00111011110-1", 16384);
		mapm.put("-11110111100", 16384);
		mapm.put("0011101111-1", 16384);
		mapm.put("-10111011110-1", 16384);
		mapm.put("-1011101111-1", 16384);
		mapm.put("-1111011110-1", 16384);
		mapm.put("-111101111-1", 16384);
		mapm.put("00111011110", 16384);
		mapm.put("-10111011110", 16384);
		mapm.put("-1111011110", 16384);
		mapm.put("0011101111-1", 16384);
		mapm.put("-1011101111-1", 16384);
		mapm.put("-111101111-1", 16384);
		mapm.put("0011101111", 16384);
		mapm.put("-1011101111", 16384);
		mapm.put("-111101111", 16384);
		mapm.put("01110111100", 16384);
		mapm.put("0111011110-1", 16384);
		mapm.put("011101111-1", 16384);
		mapm.put("-11110111100", 16384);
		mapm.put("-1111011110-1", 16384);
		mapm.put("-111101111-1", 16384);
		mapm.put("1110111100", 16384);
		mapm.put("111011110-1", 16384);
		mapm.put("11101111-1", 16384);
		mapm.put("001111011100", 16384);
		mapm.put("00111101110-1", 16384);
		mapm.put("-101111011100", 16384);
		mapm.put("0011110111-1", 16384);
		mapm.put("-11111011100", 16384);
		mapm.put("-10111101110-1", 16384);
		mapm.put("-1111101110-1", 16384);
		mapm.put("-1011110111-1", 16384);
		mapm.put("-111110111-1", 16384);
		mapm.put("00111101110", 16384);
		mapm.put("-10111101110", 16384);
		mapm.put("-1111101110", 16384);
		mapm.put("0011110111-1", 16384);
		mapm.put("-1011110111-1", 16384);
		mapm.put("-111110111-1", 16384);
		mapm.put("0011110111", 16384);
		mapm.put("-1011110111", 16384);
		mapm.put("-111110111", 16384);
		mapm.put("01111011100", 16384);
		mapm.put("0111101110-1", 16384);
		mapm.put("011110111-1", 16384);
		mapm.put("-11111011100", 16384);
		mapm.put("-1111101110-1", 16384);
		mapm.put("-111110111-1", 16384);
		mapm.put("1111011100", 16384);
		mapm.put("111101110-1", 16384);
		mapm.put("11110111-1", 16384);
		mapm.put("0011110111100", 16384);
		mapm.put("001111011110-1", 16384);
		mapm.put("-1011110111100", 16384);
		mapm.put("00111101111-1", 16384);
		mapm.put("-111110111100", 16384);
		mapm.put("-101111011110-1", 16384);
		mapm.put("-11111011110-1", 16384);
		mapm.put("-10111101111-1", 16384);
		mapm.put("-1111101111-1", 16384);
		mapm.put("001111011110", 16384);
		mapm.put("-101111011110", 16384);
		mapm.put("-11111011110", 16384);
		mapm.put("00111101111-1", 16384);
		mapm.put("-10111101111-1", 16384);
		mapm.put("-1111101111-1", 16384);
		mapm.put("00111101111", 16384);
		mapm.put("-10111101111", 16384);
		mapm.put("-1111101111", 16384);
		mapm.put("011110111100", 16384);
		mapm.put("01111011110-1", 16384);
		mapm.put("0111101111-1", 16384);
		mapm.put("-111110111100", 16384);
		mapm.put("-11111011110-1", 16384);
		mapm.put("-1111101111-1", 16384);
		mapm.put("11110111100", 16384);
		mapm.put("1111011110-1", 16384);
		mapm.put("111101111-1", 16384);

		mapm.put("0-100", 16);
		mapm.put("00-10", 16);
		mapm.put("0-101", 16);
		mapm.put("10-10", 16);
		mapm.put("0-10", 16);
		mapm.put("0010-100", 16);
		mapm.put("010-100", 16);
		mapm.put("10-100", 16);
		mapm.put("0010-10", 16);
		mapm.put("0010-101", 16);
		mapm.put("010-101", 16);
		mapm.put("10-101", 16);
		mapm.put("-110-100", 16);
		mapm.put("-110-10", 16);
		mapm.put("10-100", 16);
		mapm.put("-110-101", 16);
		mapm.put("-1010-100", 16);
		mapm.put("-1010-10", 16);
		mapm.put("-1010-101", 16);
		mapm.put("00-10100", 16);
		mapm.put("0-10100", 16);
		mapm.put("00-1010", 16);
		mapm.put("00-101", 16);
		mapm.put("10-10100", 16);
		mapm.put("10-1010", 16);
		mapm.put("00-101-1", 16);
		mapm.put("0-101-1", 16);
		mapm.put("10-101-1", 16);
		mapm.put("00-1010-1", 16);
		mapm.put("0-1010-1", 16);
		mapm.put("10-1010-1", 16);
		mapm.put("0-1", 4);
		mapm.put("-10", 4);
		mapm.put("0-11", 4);
		mapm.put("1-10", 4);

		mapm.put("0-1-100", 256);
		mapm.put("0-1-101", 256);
		mapm.put("00-1-10", 256);
		mapm.put("10-1-10", 256);
		mapm.put("0-1-10", 256);
		mapm.put("00-10-100", 256);
		mapm.put("10-10-100", 256);
		mapm.put("00-10-101", 256);
		mapm.put("10-10-101", 256);
		mapm.put("0010-1-100", 256);
		mapm.put("0010-1-101", 256);
		mapm.put("-110-1-100", 256);
		mapm.put("-110-1-101", 256);
		mapm.put("-1010-1-100", 256);
		mapm.put("-1010-1-101", 256);
		mapm.put("0-1-1", 64);
		mapm.put("-1-10", 64);
		mapm.put("00-10-1", 64);
		mapm.put("-10-100", 64);
		mapm.put("0-1-11", 64);
		mapm.put("1-1-10", 64);
		mapm.put("00-10-11", 64);
		mapm.put("1-10-100", 64);

		mapm.put("0-1-1-100", 4096);
		mapm.put("0-1-1-10", 4096);
		mapm.put("0-1-1-101", 4096);
		mapm.put("00-1-1-10", 4096);
		mapm.put("10-1-1-10", 4096);
		mapm.put("0-1-1-100", 4096);
		mapm.put("00-1-10-100", 4096);
		mapm.put("00-1-10-101", 4096);
		mapm.put("10-1-10-100", 4096);
		mapm.put("10-1-10-101", 4096);
		mapm.put("00-1-10-10", 4096);
		mapm.put("10-1-10-10", 4096);
		mapm.put("0-1-10-100", 4096);
		mapm.put("0-1-10-101", 4096);
		mapm.put("00-10-1-100", 4096);
		mapm.put("00-10-1-101", 4096);
		mapm.put("10-10-1-100", 4096);
		mapm.put("10-10-1-101", 4096);
		mapm.put("00-10-1-10", 4096);
		mapm.put("10-10-1-10", 4096);
		mapm.put("0-10-1-100", 4096);
		mapm.put("0-10-1-101", 4096);
		mapm.put("1-1-1-10", 64);
		mapm.put("1-1-1-10", 64);
		mapm.put("1-1-1-10", 64);
		mapm.put("0-1-1-11", 64);
		mapm.put("-1-1-10", 64);
		mapm.put("0-1-1-1", 64);
		mapm.put("00-1-10-11", 64);
		mapm.put("10-1-10-11", 64);
		mapm.put("00-1-10-1", 64);
		mapm.put("10-1-10-1", 64);
		mapm.put("1-1-10-100", 64);
		mapm.put("1-1-10-101", 64);
		mapm.put("-1-10-101", 64);
		mapm.put("-1-10-100", 64);

		mapm.put("00-1-1-1-10", 65536);
		mapm.put("10-1-1-1-10", 65536);
		mapm.put("0-1-1-1-100", 65536);
		mapm.put("0-1-1-1-101", 65536);
		mapm.put("0-1-1-1-10", 65536);
		mapm.put("0-1-1-1-1", 65536);
		mapm.put("-1-1-1-10", 65536);
		mapm.put("00-10-1-1-100", 65536);
		mapm.put("10-10-1-1-100", 65536);
		mapm.put("00-10-1-1-101", 65536);
		mapm.put("1-10-1-1-100", 65536);
		mapm.put("00-10-1-1-11", 65536);
		mapm.put("10-10-1-1-101", 65536);
		mapm.put("1-10-1-1-101", 65536);
		mapm.put("10-10-1-1-11", 65536);
		mapm.put("1-10-1-1-11", 65536);
		mapm.put("00-10-1-1-10", 65536);
		mapm.put("10-10-1-1-10", 65536);
		mapm.put("1-10-1-1-10", 65536);
		mapm.put("00-10-1-1-11", 65536);
		mapm.put("10-10-1-1-11", 65536);
		mapm.put("1-10-1-1-11", 65536);
		mapm.put("00-10-1-1-1", 65536);
		mapm.put("10-10-1-1-1", 65536);
		mapm.put("1-10-1-1-1", 65536);
		mapm.put("0-10-1-1-100", 65536);
		mapm.put("0-10-1-1-101", 65536);
		mapm.put("0-10-1-1-11", 65536);
		mapm.put("1-10-1-1-100", 65536);
		mapm.put("1-10-1-1-101", 65536);
		mapm.put("1-10-1-1-11", 65536);
		mapm.put("-10-1-1-100", 65536);
		mapm.put("-10-1-1-101", 65536);
		mapm.put("-10-1-1-11", 65536);
		mapm.put("00-1-1-10-100", 65536);
		mapm.put("00-1-1-10-101", 65536);
		mapm.put("10-1-1-10-100", 65536);
		mapm.put("00-1-1-10-11", 65536);
		mapm.put("1-1-1-10-100", 65536);
		mapm.put("10-1-1-10-101", 65536);
		mapm.put("10-1-1-10-11", 65536);
		mapm.put("1-1-1-10-101", 65536);
		mapm.put("1-1-1-10-11", 65536);
		mapm.put("00-1-1-10-10", 65536);
		mapm.put("10-1-1-10-10", 65536);
		mapm.put("1-1-1-10-10", 65536);
		mapm.put("00-1-1-10-11", 65536);
		mapm.put("10-1-1-10-11", 65536);
		mapm.put("1-1-1-10-11", 65536);
		mapm.put("00-1-1-10-1", 65536);
		mapm.put("10-1-1-10-1", 65536);
		mapm.put("1-1-1-10-1", 65536);
		mapm.put("0-1-1-10-100", 65536);
		mapm.put("0-1-1-10-101", 65536);
		mapm.put("0-1-1-10-11", 65536);
		mapm.put("1-1-1-10-100", 65536);
		mapm.put("1-1-1-10-101", 65536);
		mapm.put("1-1-1-10-11", 65536);
		mapm.put("-1-1-10-100", 65536);
		mapm.put("-1-1-10-101", 65536);
		mapm.put("-1-1-10-11", 65536);
		mapm.put("00-1-10-1-100", 65536);
		mapm.put("10-1-10-1-100", 65536);
		mapm.put("00-1-10-1-101", 65536);
		mapm.put("1-1-10-1-100", 65536);
		mapm.put("00-1-10-1-11", 65536);
		mapm.put("10-1-10-1-101", 65536);
		mapm.put("1-1-10-1-101", 65536);
		mapm.put("10-1-10-1-11", 65536);
		mapm.put("1-1-10-1-11", 65536);
		mapm.put("00-1-10-1-10", 65536);
		mapm.put("10-1-10-1-10", 65536);
		mapm.put("1-1-10-1-10", 65536);
		mapm.put("00-1-10-1-11", 65536);
		mapm.put("10-1-10-1-11", 65536);
		mapm.put("1-1-10-1-11", 65536);
		mapm.put("00-1-10-1-1", 65536);
		mapm.put("10-1-10-1-1", 65536);
		mapm.put("1-1-10-1-1", 65536);
		mapm.put("0-1-10-1-100", 65536);
		mapm.put("0-1-10-1-101", 65536);
		mapm.put("0-1-10-1-11", 65536);
		mapm.put("1-1-10-1-100", 65536);
		mapm.put("1-1-10-1-101", 65536);
		mapm.put("1-1-10-1-11", 65536);
		mapm.put("-1-10-1-100", 65536);
		mapm.put("-1-10-1-101", 65536);
		mapm.put("-1-10-1-11", 65536);
		mapm.put("0-1-1-1-11", 65536);
		mapm.put("1-1-1-1-10", 65536);
		mapm.put("-1-1-1-10", 65536);
		mapm.put("0-1-1-1-1", 65536);
		mapm.put("-110-1-1-1-11", 65536);
		mapm.put("-1110-1-1-1-11", 65536);
		mapm.put("-11110-1-1-1-11", 65536);
		mapm.put("-111110-1-1-1-11", 65536);
		mapm.put("0010-1-1-1-11", 65536);
		mapm.put("00110-1-1-1-11", 65536);
		mapm.put("001110-1-1-1-11", 65536);
		mapm.put("0011110-1-1-1-11", 65536);
		mapm.put("-1010-1-1-1-11", 65536);
		mapm.put("-10110-1-1-1-11", 65536);
		mapm.put("-101110-1-1-1-11", 65536);
		mapm.put("-1011110-1-1-1-11", 65536);
		mapm.put("-11010-1-1-1-11", 65536);
		mapm.put("-110110-1-1-1-11", 65536);
		mapm.put("-1101110-1-1-1-11", 65536);
		mapm.put("-11011110-1-1-1-11", 65536);
		mapm.put("-111010-1-1-1-11", 65536);
		mapm.put("-1110110-1-1-1-11", 65536);
		mapm.put("-11101110-1-1-1-11", 65536);
		mapm.put("-111011110-1-1-1-11", 65536);
		mapm.put("-1111010-1-1-1-11", 65536);
		mapm.put("-11110110-1-1-1-11", 65536);
		mapm.put("-111101110-1-1-1-11", 65536);
		mapm.put("-1111011110-1-1-1-11", 65536);
		mapm.put("-11111010-1-1-1-11", 65536);
		mapm.put("-111110110-1-1-1-11", 65536);
		mapm.put("-1111101110-1-1-1-11", 65536);
		mapm.put("-11111011110-1-1-1-11", 65536);
		mapm.put("-110-1-1-1-100", 65536);
		mapm.put("-1110-1-1-1-100", 65536);
		mapm.put("-11110-1-1-1-100", 65536);
		mapm.put("-111110-1-1-1-100", 65536);
		mapm.put("0010-1-1-1-100", 65536);
		mapm.put("00110-1-1-1-100", 65536);
		mapm.put("001110-1-1-1-100", 65536);
		mapm.put("0011110-1-1-1-100", 65536);
		mapm.put("-1010-1-1-1-100", 65536);
		mapm.put("-10110-1-1-1-100", 65536);
		mapm.put("-101110-1-1-1-100", 65536);
		mapm.put("-1011110-1-1-1-100", 65536);
		mapm.put("-11010-1-1-1-100", 65536);
		mapm.put("-110110-1-1-1-100", 65536);
		mapm.put("-1101110-1-1-1-100", 65536);
		mapm.put("-11011110-1-1-1-100", 65536);
		mapm.put("-111010-1-1-1-100", 65536);
		mapm.put("-1110110-1-1-1-100", 65536);
		mapm.put("-11101110-1-1-1-100", 65536);
		mapm.put("-111011110-1-1-1-100", 65536);
		mapm.put("-1111010-1-1-1-100", 65536);
		mapm.put("-11110110-1-1-1-100", 65536);
		mapm.put("-111101110-1-1-1-100", 65536);
		mapm.put("-1111011110-1-1-1-100", 65536);
		mapm.put("-11111010-1-1-1-100", 65536);
		mapm.put("-111110110-1-1-1-100", 65536);
		mapm.put("-1111101110-1-1-1-100", 65536);
		mapm.put("-11111011110-1-1-1-100", 65536);
		mapm.put("-110-1-1-1-101", 65536);
		mapm.put("-1110-1-1-1-101", 65536);
		mapm.put("-11110-1-1-1-101", 65536);
		mapm.put("-111110-1-1-1-101", 65536);
		mapm.put("0010-1-1-1-101", 65536);
		mapm.put("00110-1-1-1-101", 65536);
		mapm.put("001110-1-1-1-101", 65536);
		mapm.put("0011110-1-1-1-101", 65536);
		mapm.put("-1010-1-1-1-101", 65536);
		mapm.put("-10110-1-1-1-101", 65536);
		mapm.put("-101110-1-1-1-101", 65536);
		mapm.put("-1011110-1-1-1-101", 65536);
		mapm.put("-11010-1-1-1-101", 65536);
		mapm.put("-110110-1-1-1-101", 65536);
		mapm.put("-1101110-1-1-1-101", 65536);
		mapm.put("-11011110-1-1-1-101", 65536);
		mapm.put("-111010-1-1-1-101", 65536);
		mapm.put("-1110110-1-1-1-101", 65536);
		mapm.put("-11101110-1-1-1-101", 65536);
		mapm.put("-111011110-1-1-1-101", 65536);
		mapm.put("-1111010-1-1-1-101", 65536);
		mapm.put("-11110110-1-1-1-101", 65536);
		mapm.put("-111101110-1-1-1-101", 65536);
		mapm.put("-1111011110-1-1-1-101", 65536);
		mapm.put("-11111010-1-1-1-101", 65536);
		mapm.put("-111110110-1-1-1-101", 65536);
		mapm.put("-1111101110-1-1-1-101", 65536);
		mapm.put("-11111011110-1-1-1-101", 65536);
		mapm.put("00-10-1-1-1-11", 65536);
		mapm.put("10-10-1-1-1-11", 65536);
		mapm.put("1-10-1-1-1-11", 65536);
		mapm.put("00-1-10-1-1-1-11", 65536);
		mapm.put("10-1-10-1-1-1-11", 65536);
		mapm.put("1-1-10-1-1-1-11", 65536);
		mapm.put("00-1-1-10-1-1-1-11", 65536);
		mapm.put("10-1-1-10-1-1-1-11", 65536);
		mapm.put("1-1-1-10-1-1-1-11", 65536);
		mapm.put("00-1-1-1-10-1-1-1-11", 65536);
		mapm.put("10-1-1-1-10-1-1-1-11", 65536);
		mapm.put("1-1-1-1-10-1-1-1-11", 65536);
		mapm.put("00-10-1-1-1-100", 65536);
		mapm.put("10-10-1-1-1-100", 65536);
		mapm.put("1-10-1-1-1-100", 65536);
		mapm.put("00-1-10-1-1-1-100", 65536);
		mapm.put("10-1-10-1-1-1-100", 65536);
		mapm.put("1-1-10-1-1-1-100", 65536);
		mapm.put("00-1-1-10-1-1-1-100", 65536);
		mapm.put("10-1-1-10-1-1-1-100", 65536);
		mapm.put("1-1-1-10-1-1-1-100", 65536);
		mapm.put("00-1-1-1-10-1-1-1-100", 65536);
		mapm.put("10-1-1-1-10-1-1-1-100", 65536);
		mapm.put("1-1-1-1-10-1-1-1-100", 65536);
		mapm.put("00-10-1-1-1-101", 65536);
		mapm.put("10-10-1-1-1-101", 65536);
		mapm.put("1-10-1-1-1-101", 65536);
		mapm.put("00-1-10-1-1-1-101", 65536);
		mapm.put("10-1-10-1-1-1-101", 65536);
		mapm.put("1-1-10-1-1-1-101", 65536);
		mapm.put("00-1-1-10-1-1-1-101", 65536);
		mapm.put("10-1-1-10-1-1-1-101", 65536);
		mapm.put("1-1-1-10-1-1-1-101", 65536);
		mapm.put("00-1-1-1-10-1-1-1-101", 65536);
		mapm.put("10-1-1-1-10-1-1-1-101", 65536);
		mapm.put("1-1-1-1-10-1-1-1-101", 65536);

		for (r = 0; r < array.length; r++) {
			for (c = 0; c < array[r].length; c++) {
				if (array[r][c] == 0) {
					String code = countH(r, c);
					Integer value = mapm.get(code);
					if (value != null) {
						weightArray[r][c] += value;
					}
					code = countS(r, c);
					value = mapm.get(code);
					if (value != null) {
						weightArray[r][c] += value;
					}
					code = countYX(r, c);
					value = mapm.get(code);
					if (value != null) {
						weightArray[r][c] += value;
					}
					code = countZX(r, c);
					value = mapm.get(code);
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

	public String countH(int r, int c) { // 水平方向，原点无子
		String code = "0";
		int chess = 0;
		int space = 0;

		for (int c1 = c - 1; c1 >= 0; c1--) { // 向左
			if (array[r][c1] == 0) {
				if (c1 == c - 1) { // 相邻无子
					break;
				} else if (space == 0) {
					code = array[r][c1] + code;
					space = 1;
				} else if (space == 1) {
					code = array[r][c1] + code;
					space = 2;
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
		chess = space = 0;
		for (int c1 = c + 1; c1 < array[r].length; c1++) { // 向右
			if (array[r][c1] == 0) {
				if (c1 == c + 1) { // 相邻无子
					break;
				} else if (space == 0) {
					code = code + array[r][c1];
					space = 1;
				} else if (space == 1) {
					code = code + array[r][c1];
					space = 2;
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

	public String countS(int r, int c) { // 竖直方向，原点无子
		String code = "0";
		int chess = 0;
		int space = 0;
		for (int r1 = r - 1; r1 >= 0; r1--) { // 向上
			if (array[r1][c] == 0) {
				if (r1 == r - 1) { // 相邻无子
					break;
				} else if (space == 0) {
					code = array[r1][c] + code;
					space = 1;
				} else if (space == 1) {
					code = array[r1][c] + code;
					space = 2;
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
		chess = space = 0;
		for (int r1 = r + 1; r1 < array.length; r1++) { // 向下
			if (array[r1][c] == 0) {
				if (r1 == r + 1) { // 相邻无子
					break;
				} else if (space == 0) {
					code = code + array[r1][c];
					space = 1;
				} else if (space == 1) {
					code = code + array[r1][c];
					space = 2;
					break;
				}
			} else { // 有子
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

	public String countYX(int r, int c) { // 右斜方向，原点无子
		String code = "0";
		int chess = 0;
		int space = 0;
		for (int r1 = r - 1, c1 = c - 1; r1 >= 0 && c1 >= 0; r1--, c1--) { // 向左上
			if (array[r1][c1] == 0) {
				if (r1 == r - 1 && c1 == c - 1) { // 相邻无子
					break;
				} else if (space == 0) {
					code = array[r1][c1] + code;
					space = 1;
				} else if (space == 1) {
					code = array[r1][c1] + code;
					space = 2;
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
		chess = space = 0;
		for (int r1 = r + 1, c1 = c + 1; r1 < array.length // 向右下
				&& c1 < array[r].length; r1++, c1++) {
			if (array[r1][c1] == 0) {
				if (r1 == r + 1 && c1 == c + 1) { // 相邻无子
					break;
				} else if (space == 0) {
					code = code + array[r1][c1];
					space = 1;
				} else if (space == 1) {
					code = code + array[r1][c1];
					space = 2;
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

	public String countZX(int r, int c) { // 左斜方向，原点无子
		String code = "0";
		int chess = 0;
		int space = 0;
		for (int r1 = r + 1, c1 = c - 1; r1 < array.length && c1 >= 0; r1++, c1--) { // 左下
			if (array[r1][c1] == 0) {
				if (r1 == r + 1 && c1 == c - 1) { // 相邻无子
					break;
				} else if (space == 0) {
					code = array[r1][c1] + code;
					space = 1;
				} else if (space == 1) {
					code = array[r1][c1] + code;
					space = 2;
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
		chess = space = 0;
		for (int r1 = r - 1, c1 = c + 1; r1 >= 0 && c1 < array[r].length; r1--, c1++) { // 右上
			if (array[r1][c1] == 0) {
				if (r1 == r - 1 && c1 == c + 1) { // 相邻无子
					break;
				} else if (space == 0) {
					code = code + array[r1][c1];
					space = 1;
				} else if (space == 1) {
					code = code + array[r1][c1];
					space = 2;
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
