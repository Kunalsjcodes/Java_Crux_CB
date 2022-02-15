package Leetcode;

public class Add_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/add-binary/
	}

	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int i = a.length() - 1; // i is the pointer of "a" string
		int j = b.length() - 1; // j is the pointer of "b" string

		int carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0) {
				sum += a.charAt(i) - '0';
			}
			if (j >= 0) {
				sum += b.charAt(j) - '0';
			}
			// to get the value like 1 - 0 = 1 & 0 - 0 = 0

			sb.append(sum % 2);
			carry = sum / 2;

			i--;
			j--;

		}

		if (carry != 0)
			sb.append(carry);
		return sb.reverse().toString();
	}

}
