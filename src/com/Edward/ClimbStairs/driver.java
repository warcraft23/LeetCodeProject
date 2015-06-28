package com.Edward.ClimbStairs;

import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int ways;
		System.out.println("Please Enter the number of stairs!");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		ways=ClimbStairs.climbStairs(n);
		System.out.println("There are "+ways+" ways.");
	}

}
