package com.Edward.Baidu.test1;

public class Solution {
	static int maxRes(int[][] nums,int x,int y){
		
		int res=0;
		if(nums.length==0){
			return -1;
		}
		if(nums[0].length==0)
			return -1;
		if(x==(nums.length-1))
			return nums[x][y];
		res=Integer.max(maxRes(nums,x+1,y),maxRes(nums,x+1,y+1))+nums[x][y];
		return res;
	}
	public static void main(String args[]){
		int[][] temp={
				{7,0,0,0,0},
				{3,8,0,0,0},
				{8,1,0,0,0},
				{2,7,4,4,0},
				{4,5,2,6,5}
				};
		int res=maxRes(temp,0,0);
		System.out.println(res);
	}
}


