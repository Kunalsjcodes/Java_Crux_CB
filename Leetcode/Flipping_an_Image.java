package Leetcode;

public class Flipping_an_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/flipping-an-image/
	}

	public int[][] flipAndInvertImage(int[][] A) {
		for (int[] row : A) {
			row = invert(flip(row));
		}
		return A;
	}

	private int[] flip(int[] array) {
		int length = array.length;
		for (int i = 0; i < length / 2; i++) {
			int temp = array[i];
			array[i] = array[length - i - 1];
			array[length - i - 1] = temp;
		}
		return array;
	}

	private int[] invert(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] ^= 1;
		}
		return array;
	}

}
