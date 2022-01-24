package Leetcode;

import java.util.*;

public class Intersection_of_Two_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/intersection-of-two-arrays-ii/
	}

	public int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0;
		int j = 0;
		List<Integer> list = new ArrayList<>();
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j]) {
				list.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
			}
		}
		int n = list.size();
		int[] ans = new int[n];
		for (i = 0; i < n; i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}

}
