package com.Edward.ClimbStairs;

public class ClimbStairs {
	public static int climbStairsRecursion(int n){
		int ways;
		if(n==1)
			ways=1;
		else if(n==2)
			ways=2;
		else
			ways=climbStairsRecursion(n-1)+climbStairsRecursion(n-2);
		
		return ways;
	}
	
	public static int climbStairsIteration(int n){
		int ways;
		ways=1;
		int temp,pre;
		pre=0;
		for(int i=1;i<n+1;i++){
			temp=ways;
			ways+=pre;
			pre=temp;
		}
		return ways;
	}
	
	public static int climbStairs(int n){
		double s=Math.sqrt(5.0);
		int ways;
		ways=(int)Math.floor(
				(
						Math.pow( (1.0+s)/2,n+1 )+Math.pow( (1.0-s)/2,n+1 )
						)/s+0.5);
		return ways;
		
	}
}
