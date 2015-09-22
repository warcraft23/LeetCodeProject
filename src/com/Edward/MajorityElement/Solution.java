/*
 * 求众数
 * 输入一串数，得出其中个数绝对大于总数一半的数
 * 由于众数的个数大于总数的一半，那么当输入的两个数不同时，若去掉的数是众数与非众数，
 * 则剩下的部分里众数仍大于剩下部分数字总个数的一半；若去掉的数是两个非众数，则剩下的部
 * 分中众数依旧大于总个数的一半；不存在去掉两个众数的情况。
 */
package com.Edward.MajorityElement;

import java.util.Scanner;

public class Solution {
	public static int majorityElement(int[] nums){
		int major=0,cnt=0;
		int i=0;
		for(;i<nums.length;i++){
			if(cnt==0){
				major=nums[i];
				cnt=1;
			}else if(nums[i]==major){
				cnt++;
			}else
				cnt--;
		}
		cnt=0;
		for(i=0;i<nums.length;i++){
			if(nums[i]==major)
				cnt++;
		}
		if(cnt<=nums.length/2)
			return 0;
		return major;
	}
	public static void main(String args[]){
		int major=0,num=0,i=0;
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		int nums[]=new int[num];
		for(;i<num;i++){
			nums[i]=scan.nextInt();
		}
		major=majorityElement(nums);
		System.out.println(major);
	}

}
