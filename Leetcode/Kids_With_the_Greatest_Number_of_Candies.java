package Leetcode;

import java.util.*;

public class Kids_With_the_Greatest_Number_of_Candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
	}

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> result = new ArrayList<>();
		int greatest = 0;

		for (int i = 0; i < candies.length; i++) {
			if (greatest < candies[i]) {
				greatest = candies[i];
			}
		}
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies < greatest) {
				result.add(false);
			} else {
				result.add(true);
			}
		}
		return result;
	}

}
