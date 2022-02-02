package Leetcode;

import java.util.*;

public class Find_Target_Indices_After_Sorting_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/find-target-indices-after-sorting-array/
	}

	public List<Integer> targetIndices(int[] nums, int target) {
		List<Integer> list = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				list.add(i);
			}
		}
		return list;
	}

}
