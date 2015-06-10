package com.Edward.VersionCompare;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String version1="0.1";
		String version2="1.0";
		int result;
		result=versionCompare.compareVersion(version1, version2);
		System.out.println("Result:"+result);
	}

}
