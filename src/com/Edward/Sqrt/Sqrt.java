package com.Edward.Sqrt;

public class Sqrt {
	public static int mySqrt(int x){
		int lower=1;
		int upper=x;
		int mid,last_mid=0;
		if(x<2)
			return x;
		while(lower<=upper){
			mid=lower+(upper-lower)/2;
			if(x/mid>mid){
				lower=mid+1;
				last_mid=mid;
			}else if(x/mid<mid){
				upper=mid-1;
			}else{
				return mid;
			}
			System.out.println("Lower:"+lower+" Upper:"+upper);
		}
		
		return last_mid;
	}
}
