/*
 * 算出数组中的n分之一个的众数
 */
package com.Edward.MajorityElement.version2;

import java.util.Scanner;

public class Solution {
	public static void main(String args[]){
		int major=0,num=0,i=0,split=0;
		int res[];
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		int nums[]=new int[num];
		for(;i<num;i++){
			nums[i]=scan.nextInt();
		}
		split=scan.nextInt();
		majorityElement(nums,split);
		
		//System.out.println(major);
	}
	
	static void majorityElement(int[] nums,int split){
		int res[]=new int[split-1];
		int cnt[]=new int[split-1];
		int i=0;
		int index=0;
		int count=0;
		for(;i<split-1;i++)
			res[i]=cnt[i]=0;
		i=0;
		
		for(;i<nums.length;i++){
			if((index=indexOfNum(res, nums[i]))!=-1){
				cnt[index]++;
				//continue;
			}else{
				if((index=indexOfNum(cnt,0))!=-1){
					res[index]=nums[i];
					cnt[index]=1;
				}else{
					for(int j=0;j<split-1;j++){
						cnt[j]--;
					}
				}
			}	
		}
		for(i=0;i<split-1;i++)
			if(cnt[i]>0)
				System.out.print(""+res[i]+" ");
		
		
	}
	static int indexOfNum(int[] nums,int num){		
		for(int i=0;i<nums.length;i++)
			if(num==nums[i])
				return i;
		return -1;
	}
	
	
}
