package com.Edward.mergeKSortedList;

public class MergeKLists {
	public static ListNode mergeKLists(ListNode[] lists){
		//Declaration
		ListNode result;
		//Initialization
		if(lists.length==0){
		    return null;
		}
		result=lists[0];
		//Core Function
		for(int i=1;i<lists.length;i++){
			result=merge2Lists(result,lists[i]);
		}
		//End
		return result;
	}
	public static ListNode merge2Lists(ListNode l1,ListNode l2){
		if(l1==null&&l2==null){
			return null;
		}else if(l2==null){
			return l1;
		}else if(l1==null){
			return l2;
		}else{
			ListNode result=new ListNode(0);
			ListNode index1,index2,index;
			index1=l1;
			index2=l2;
			index=result;
			while(index1!=null&&index2!=null){
				if(index1.val<index2.val){
					index.next=index1;
					index=index.next;
					index1=index1.next;
				}else{
					index.next=index2;
					index=index.next;
					index2=index2.next;
				}
			}
			if(index1==null||index2==null){
				if(index2==null){
					index.next=index1;
				}else{
					index.next=index2;
				}
			}
			return result.next;
		}
	}
}
