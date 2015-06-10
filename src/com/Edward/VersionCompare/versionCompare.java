package com.Edward.VersionCompare;

public class versionCompare {

	public static int compareVersion(String version1,String version2){
		
		/*
		 * firstLevel：第一层级
		 * secondLevel：第二层级
		 * pos：标点'.'在字符串中的位置
		 * result：返回值
		 */
		int firstLevel1,firstLevel2;
		int secondLevel1,secondLevel2;
		int pos1,pos2;
		int result;
		String secondVersion1;
		String secondVersion2;
		
		/*
		 * Initialization
		 */
		firstLevel1=firstLevel2=0;
		secondLevel1=secondLevel2=0;
		pos1=pos2=0;
		result=0;
		secondVersion1="";
		secondVersion2="";
		
		pos1=version1.indexOf('.');
		pos2=version2.indexOf('.');
		
		//System.out.println("Pos1:"+pos1+";Pos2:"+pos2);
		
		
		if(pos1==-1&&pos2==-1){
			// version1 doesn't have '.' ,neither does version2 
			firstLevel1=Integer.parseInt(version1);
			firstLevel2=Integer.parseInt(version2);
			if(firstLevel1>firstLevel2){
				result=1;
			}
			else if(firstLevel1<firstLevel2){
				result=-1;
			}
			else{
				result=0;
			}
		}else if(pos1==-1){
			//vesion1 just doesn't have '.'
			firstLevel1=Integer.parseInt(version1);
			firstLevel2=Integer.parseInt(version2.substring(0, pos2));
			secondVersion2=version2.substring(pos2+1);
			
			if(firstLevel1>firstLevel2){
				result=1;
			}
			else if(firstLevel1<firstLevel2){
				result=-1;
			}else{
				if(versionCompare.equalsZero(secondVersion2)){
					result=0;
				}else{
					result=-1;
				}	
			}	
		}else if(pos2==-1){
			//vesion2 just doesn't have '.'
			firstLevel2=Integer.parseInt(version2);
			firstLevel1=Integer.parseInt(version1.substring(0, pos1));
			secondVersion1=version1.substring(pos1+1);
			
			if(firstLevel1>firstLevel2){
				result=1;
			}
			else if(firstLevel1<firstLevel2){
				result=-1;
			}else{
				if(versionCompare.equalsZero(secondVersion1)){
					result=0;
				}else{
					result=1;
				}	
			}	
		}else{
			firstLevel1=Integer.parseInt(version1.substring(0, pos1));
			firstLevel2=Integer.parseInt(version2.substring(0, pos2));
			secondVersion1=version1.substring(pos1+1);
			secondVersion2=version2.substring(pos2+1);
			
//			System.out.println("version1: "+firstLevel1+" . "+secondLevel1);
//			System.out.println("version2: "+firstLevel2+" . "+secondLevel2);
			
			if(firstLevel1>firstLevel2){
				result=1;
			}
			else if(firstLevel1<firstLevel2){
				result=-1;
			}else{
				result=versionCompare.compareVersion(secondVersion1, secondVersion2);
			}
		}
		return result;
	}

	
	public static boolean equalsZero(String s){
		
		boolean result=false;
		int pos=0;
		
		pos=s.indexOf('.');
		if(pos==-1){
			if(Integer.parseInt(s)==0){
				result=true;
			}else{
				result=false;
			}
		}else{
			result=equalsZero(s.substring(pos+1));
		}
		return result;
		
	}
}
