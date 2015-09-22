/*
 * 查找局部极大值
 * 假设nums[-1]=nums[n]=-MIN_VALUE
 * 结论是若在nums[i...j]中 nums[i]>nums[i-1]，且nums[j]>nums[j+1]，则nums[i...j]存在局部极大值
 * 采用二分的方法，mid=(i+j)/2，若nums[mid]>nums[mid+1],则局部极大值存在于mid左侧，反之局部极大值存在于其右侧
 */
package com.Edward.FindPeakElement;
import java.util.Scanner;

public class Solution {
	public static int findPeakElement(int[] nums){
		
		int mid=0;
		int start=0,end=nums.length-1;
		while(start<=end){
			if(start==end)
				return start;
			mid=(start+end)/2;
			if(nums[mid]>nums[mid+1])
				end=mid;
			else
				start=mid+1;
		}
		return 0;
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int cnt=0,i=0;
		int resIndex=0;
		cnt=scan.nextInt();
		int nums[]=new int[cnt];
		for(;i<cnt;i++){
			nums[i]=scan.nextInt();
		}
		resIndex=Solution.findPeakElement(nums);
		System.out.println("Peak Index:"+resIndex);
		
		
	}
}
