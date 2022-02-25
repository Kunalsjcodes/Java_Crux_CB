package Leetcode;

public class XOR_Operation_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/xor-operation-in-an-array/
	}

	public int xorOperation(int n, int start) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum ^= start + 2 * i;
		}
		return sum;
	}
}
