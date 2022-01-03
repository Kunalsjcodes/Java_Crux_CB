package Leetcode;
import java.util.*;
public class Contains_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/contains-duplicate/
	}

	public boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length == 0) {
			return false;
		}
		Arrays.sort(nums);
		int l = nums.length;
		for (int i = 1; i < l; i++) {
			if (nums[i - 1] == nums[i]) {
				return true;
			}
		}
		return false;
	}

}
