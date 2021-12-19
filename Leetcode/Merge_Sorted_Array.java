package Leetcode;
import java.util.*;
public class Merge_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/merge-sorted-array/
	}

	public void merge(int[] nums1, int first, int[] nums2, int second) {
		if (nums2.length >= 1 && nums1.length >= 1) {

			int index = 0;
			for (int i = first; i < nums1.length; i++) {
				nums1[i] = nums2[index];
				index++;
			}

			// Sort array1
			Arrays.sort(nums1);
		} else if (first == 0) {
			for (int i = 0; i < nums2.length; i++) {
				nums1[i] = nums2[i];
			}
		}
	}
}
