package Leetcode;

public class Check_If_N_and_Its_Double_Exist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/check-if-n-and-its-double-exist/
	}

	public boolean checkIfExist(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] * 2 == arr[i] || arr[i] * 2 == arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
}
