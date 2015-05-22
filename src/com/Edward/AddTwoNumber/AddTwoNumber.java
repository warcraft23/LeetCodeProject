package com.Edward.AddTwoNumber;

public class AddTwoNumber {
	public static ListNode addTwoNumber(ListNode l1,ListNode l2){
		if(l1==null&&l2==null)
		{
			System.out.println("Error!List 1 & List 2 is empty!");
			return null;
		}
		else if(l1==null)
			return l2;
		else if(l2==null)
			return l1;
		else{
			ListNode index1,index2,pre,result;
			result=l1;
			pre=index1=l1;
			index2=l2;
			int pass=0;
			while(index1!=null&&index2!=null){
				//same length
				index1.value+=index2.value+pass;
				pass=index1.value/10;
				index1.value%=10;
				pre=index1;
				index1=index1.next;
				index2=index2.next;
			}
			if(index2!=null){
				//l2 is longer
				//link the rest of l2 to l1
				pre.next=index2;
				index1=index2;
				index2=null;		
			}
			if(index1!=null){
				//l1 is longer
				while(index1!=null){
					index1.value+=pass;
					pass=index1.value/10;
					index1.value%=10;
					pre=index1;
					index1=index1.next;
				}
			}
			if(pass==1){
				ListNode passNode=new ListNode(pass);
				pre.next=passNode;
			}
			
			return result;
		}
	}
}
