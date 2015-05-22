package com.Edward.TwoSum;

public class TwoSum {

	public static int[] twoSum(int[] nums,int target){
		int[] indices={0,0};
		int toFind;
		int i=0,j=0;
		//to find the target indices
		for(i=0;i<nums.length-1;i++){
			//the number to find
			toFind=target-nums[i];
			
			for(j=nums.length-1;j>i&&nums[j]!=toFind;j--){}
			if(j>i){
				//if it is find
				break;
			}
		}
		if(i<j){
			i++;
			j++;
		}
		indices[0]=i;
		indices[1]=j;
		return indices;
	} 
}
