package com.Edward.Mogujie.Exam2;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int r=0,x=0,y=0,x1=0,y1=0;
		r=scan.nextInt();
		x=scan.nextInt();
		y=scan.nextInt();
		x1=scan.nextInt();
		y1=scan.nextInt();
		
		double d=0.0;
		d=Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
		if(d<=2*r)
			System.out.println(1);
		else{
			int block=(int)d/(2*r);
			double left=d-2*r*block;
			if(left!=0.0){
				block+=1;
				System.out.println(block);
			}else{
				System.out.println(block);
			}
			
		}
	}
}
