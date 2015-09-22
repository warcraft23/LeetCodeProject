package com.Edward.Mogujie.Exam1;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		int p,q,l,r;
		Scanner scan=new Scanner(System.in);
		p=scan.nextInt();
		q=scan.nextInt();
		l=scan.nextInt();
		r=scan.nextInt();
		if(r>1000||r<0||r>1000||l<0) return;
		int[] a=new int[p];
		int[] b=new int[p];
		int[] c=new int[q];
		int[] d=new int[q];
		for(int i=0;i<p;i++){
			a[i]=scan.nextInt();
			b[i]=scan.nextInt();
			if(b[i]>1000||b[i]<0||a[i]>1000||a[i]<0) return;
		}
		for(int i=0;i<q;i++){
			c[i]=scan.nextInt();
			d[i]=scan.nextInt();
			if(c[i]>1000||c[i]<0||d[i]>1000||d[i]<0) return;
		}
		for(int i=0;i<p;i++) System.out.println("a["+i+"]:"+a[i]+",b["+i+"]:"+b[i]);
		for(int i=0;i<q;i++) System.out.println("c["+i+"]:"+c[i]+",d["+i+"]:"+d[i]);
		
	}
}
