package Leetcode;

public class Largest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/largest-number/
	}

	public static String form_biggest(int[] arr) {
		String sij = "";
		String sji = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				sij = String.valueOf(arr[i]) + String.valueOf(arr[j]);
				sji = String.valueOf(arr[j]) + String.valueOf(arr[i]);
				if (Long.parseLong(sij) > Long.parseLong(sji)) {

				} else {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		String ans = "";
		for (int i = 0; i < arr.length; i++) {
			ans += String.valueOf(arr[i]);

		}
		if (Integer.parseInt(ans.charAt(0) + "") == 0) {
			return "0";
		} else {
			return ans;
		}

	}

	public String largestNumber(int[] arr) {
		return form_biggest(arr);
	}
}