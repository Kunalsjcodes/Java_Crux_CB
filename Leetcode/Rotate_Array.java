package Leetcode;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/rotate-array/
	}
	
	   public void rotate(int[] nums, int k) {
	       	int n = nums.length;
			k = k % n;
			reverse(nums, 0, n - k - 1);
			reverse(nums, n - k, n - 1);
			reverse(nums, 0, n - 1);

		}

		public static void reverse(int[] nums, int i, int j) {

			while (i < j) {
				// Swaping
				int t = nums[i];
				nums[i] = nums[j];
				nums[j] = t;

				i++;
				j--;
			} 
	    }
}
