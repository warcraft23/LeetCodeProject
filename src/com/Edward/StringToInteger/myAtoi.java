package com.Edward.StringToInteger;

public class myAtoi {
	public static int myAtoi(String str){
		int result;
		int sign;
		int i;
		int length;
		
		int max=2147483647;
		int min=-2147483648;
		sign=1;
		result=0;
		i=0;
		length=str.length();
		
		if(length==0){
			return 0;
		}
		while(str.charAt(i)==' '&&i<length){
			i++;
			}
		if(str.charAt(i)=='+'){
			i++;
		}else if(str.charAt(i)=='-'){
			sign=-1;
			i++;
		}
		for(;i<length;i++){
			if(str.charAt(i)<'0'||str.charAt(i)>'9'){
				break;
			}
			if(result>max/10
					||(result==max/10 && ( str.charAt(i)-'0' ) > max%10) ){
				return sign==1?max:min;
			}
			result=result*10+str.charAt(i)-'0';
		}
		result*=sign;
		
		
		
		return result;
	}
}
