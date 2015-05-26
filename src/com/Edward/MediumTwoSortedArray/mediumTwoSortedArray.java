package com.Edward.MediumTwoSortedArray;

public class mediumTwoSortedArray {

		public static int findMedium(int[] nums1,int[] nums2){
			int medium=0;
			int m=(nums1.length+nums2.length)/2;
			medium=findKth(nums1,0,nums1.length-1,nums2,0,nums2.length-1,m);
			return medium;
		}
		
		private static int findKth(int[] nums1,int start1,int end1,int[] nums2,int start2,int end2,int k){
			
			int length1=end1-start1+1;
			int length2=end2-start2+2;

			//assume nums1.length is always less or equal to nums2.length
			if(length1>length2){
				findKth(nums2,start2,end2,nums1,start1,end1,k);
			}
			if(length1==0){
				if(k==0){
					return nums2[k];
				}
				return nums2[k-1];
			}
			if(k==1){
				return nums1[start1]<nums2[start2]?nums1[start1]:nums2[start1];
			}
			int pNums1=Math.min(length1, k/2);
			int pNums2=pNums1;
			
			if(nums1[start1+pNums1-1]<nums2[start2+pNums2-1]){
				return findKth(nums1,start1+pNums1,end1,nums2,start2,end2,k-pNums1);
			}
			else if(nums1[start1+pNums1]>nums2[start2+pNums2]){
				return findKth(nums1,start1,end1,nums2,start2+pNums2,end2,k-pNums2);
			}
			else{
				return nums1[start1+pNums1-1];
			}
		}
}
