package com.Edward.mergeKSortedList;

public class mergeKSortedList {
	public static ListNode mergeKLists(ListNode[] lists){
		//Declaration
		
		ListNode result=new ListNode(0);
		ListNode p=result;
		int length=0;
		int i=0;
		int minValue=Integer.MAX_VALUE;
		int minIndex=0;
		boolean flag=false;
		//int count=1;
		
		
		//Initialization
		length=lists.length;
		ListNode index[]=new ListNode[length];
		for(i=0;i<length;i++){
			index[i]=lists[i];
		}
		
		//core algorithm
		while(true){
			//end condition
			for(i=0;i<length;i++){
				flag=flag||(index[i]!=null);
			}
			if(!flag)
				break;
			flag=false;
			
			//one turn
			for(i=0;i<length;i++){
				if(index[i]==null){
					continue;
				}
				if(index[i].val<minValue){
					minIndex=i;
					minValue=index[i].val;
				}
			}
			//System.out.println("Round "+count+" : MinIndex is "+minIndex+" MinValue is "+minValue);
			p.next=index[minIndex];
			p=p.next;
			index[minIndex]=index[minIndex].next;
			minValue=Integer.MAX_VALUE;
			
			
//			count++;
		}
		
		result=result.next;
		
		return result;
	}
}
