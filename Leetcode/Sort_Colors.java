package Leetcode;

public class Sort_Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/sort-colors/
	}

	public void sortColors(int[] nums) {
		int red = 0, blu = nums.length - 1;
		int i = 0;
		while (i < blu + 1) {
			if (nums[i] == 0) {
				int tmp = nums[i];
				nums[i] = nums[red];
				nums[red] = tmp;
				red++;
				i++;
				continue;
			}
			if (nums[i] == 2) {
				int tmp = nums[i];
				nums[i] = nums[blu];
				nums[blu] = tmp;
				blu--;
				continue;
			}
			i++;
		}
	}
}
