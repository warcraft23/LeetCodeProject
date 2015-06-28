package com.Edward.Sqrt;



import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int result;
		System.out.println("Please Enter the number!");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		result=Sqrt.mySqrt(n);
		System.out.println("The sqrt value is "+result+".");
	}

}

