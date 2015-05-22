package com.Edward.LongestSubstringWithoutRepeatingChar;

public class lsWRC {
	//class longest substring without repeating char
	public static int lengthOfLongestSubstring(String s){
		int max=0;
		int[] index=new int[256];
		int length=s.length();
		int stringStart=-1;
		//initialize the array of index
		for(int i=0;i<256;i++){
			index[i]=-1;
		}
		for(int i = 0; i < length; i++){
			if(stringStart < index[s.charAt(i)]){
				//there is a repeating char.
				//change the start point of substring to the index of the char which last appear
				stringStart= index[s.charAt(i)];
			}
			//if the length of substring is longer than max value,change it
			if(i-stringStart>max)
				max=i-stringStart;
			//set the index the char last appear
			index[s.charAt(i)]=i;
		}
		return max;
	}


}
