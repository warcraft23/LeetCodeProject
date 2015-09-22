package com.Edward.PushPopValid;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	static boolean isValid(int[] in,int[] out){
		if(in.length==out.length){
			Stack<String> s=new Stack();
			for(int i=0,j=0;j<out.length;j++){
				while(s.isEmpty()||!s.peek().equals(String.valueOf(out[j]))){
					if(i>=in.length) return false;
					s.push(String.valueOf(in[i++]));
				}
				s.pop();
			}
			return true;
		}
		else
			return false;	
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int len=0;
		System.out.print("In Length:");
		len=scan.nextInt();
		int[] in=new int[len];
		for(int i=0;i<len;i++){
			in[i]=scan.nextInt();
		}
		System.out.print("Out Length:");
		len=scan.nextInt();
		int[] out=new int[len];
		for(int i=0;i<len;i++){
			out[i]=scan.nextInt();
		}
		if(isValid(in,out)){
			System.out.println("Yep");
		}else{
			System.out.println("Oops");
		}
		
		
	}
}
