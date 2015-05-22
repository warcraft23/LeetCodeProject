package com.Edward.TwoSum;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,7,11,15};
		int target=8;
		int[] indices;
		indices=TwoSum.twoSum(nums, target);
		System.out.println("The first index is "+indices[0]+" and the second index is "+indices[1]+".");
				
	}

}
