package com.Edward.Sort.DirectInsertSort;

public class Solution {
	static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	static void directInsertSort(int[] nums) {
		int temp = 0;
		int j = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] > nums[i]) {
				j = i - 1;
				temp = nums[i];
				nums[i] = nums[i - 1];
				while (j >= 0 && nums[j] > temp) {
					nums[j + 1] = nums[j];
					j--;

				}
				nums[j + 1] = temp;
				printArray(nums);
			}
		}
	}

	static void shellInsertSort(int[] nums, int dk) {
		int temp = 0;
		int j = 0;
		for (int i = dk; i < nums.length; i++) {
			if (nums[i - dk] > nums[i]) {
				j = i - dk;
				temp = nums[i];
				nums[i] = nums[i - dk];
				while (j >= 0 && nums[j] > temp) {
					nums[j + dk] = nums[j];
					j -= dk;
				}
				nums[j + dk] = temp;
				printArray(nums);
			}
		}
	}

	static void shellSort(int[] nums) {
		int dk = nums.length / 2;
		while (dk >= 1) {
			shellInsertSort(nums, dk);
			dk /= 2;
		}
	}
	
	static void swap(int[] nums,int index1,int index2){
		int temp=0;
		temp=nums[index1];
		nums[index1]=nums[index2];
		nums[index2]=temp;
	}
	
	static void simpleSelectSort(int[] nums){
		int index=0;
		int max=0;
		int j=0;
		for(int i=nums.length-1;i>=0;i--){
			max=nums[i];
			index=i;
			j=i-1;
			while(j>=0){
				if(nums[j]>max){
					max=nums[j];
					index=j;
				}
				j--;
			}
			if(i!=index) swap(nums,i,index);
			printArray(nums);
		}
	}
	static void binaryElementSelectSort(int[] nums){
		int indexMax=0,indexMin=0;
//		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		for(int i=1;i<=nums.length/2;i++){
			indexMin=i; indexMax=i;
			for(int j=i+1;j<=nums.length-i;j++){
				if(nums[j]>nums[indexMax]){
					indexMax=j;
					continue;
				}
				if(nums[j]<nums[indexMin]){
					indexMin=j;
				}
			}
			swap(nums,i-1,indexMin);
			swap(nums,nums.length-i,indexMax);
			printArray(nums);
		}
	}

	public static void main(String[] args) {
		int[] nums = { 3, 1, 5, 7, 2, 4, 9, 6 ,8};
//		directInsertSort(nums);
//		shellSort(nums);
//		simpleSelectSort(nums);
		binaryElementSelectSort(nums);
	}

}
