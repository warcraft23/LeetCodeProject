package com.Edward.MediumTwoSortedArray;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1={1,2,3,4,5};
		int[] nums2={6,7,8,9,10};
		
		int medium=0;
		medium=mediumTwoSortedArray.findMedium(nums1, nums2);
		System.out.println("The medium of Nums1 and Nums2 is "+medium);
	}

}
