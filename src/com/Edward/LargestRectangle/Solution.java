package com.Edward.LargestRectangle;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	static int largestRectangleArea(int[] height){
		int area=0;
		Stack<String> s=new Stack();
		for(int i=0;i<height.length;i++){
			while(!s.empty() && height[Integer.parseInt(s.peek())] >= height[i]){
				//出栈，算面积
				int h=height[Integer.parseInt(s.peek())];
				s.pop();
				//i-1为右边界，Integer.parseInt(s.peek())是出栈后栈顶的位置，即该块的左边界
				area=Integer.max(area, h*(i-1-((s.empty())?(-1):Integer.parseInt(s.peek()))));
			}
			//入栈，将块的当前位置入栈，定下当前块的左边界
			s.push(String.valueOf(i));
		}
		while(!s.empty()){
			int h=height[Integer.parseInt(s.peek())];
			s.pop();
			area=Integer.max(area, h*(height.length-1-((s.empty())?(-1):Integer.parseInt(s.peek()))));
		}
		return area;
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int len=0;
		int area=0;
		System.out.print("Length:");
		len=scan.nextInt();
		int[] height=new int[len];
		for(int i=0;i<len;i++){
			height[i]=scan.nextInt();
		}
		area=largestRectangleArea(height);
		System.out.println("Area is "+area);
	}
}
