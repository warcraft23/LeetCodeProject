package com.Edward.mergeKSortedList;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l[]=new ListNode[3];
		ListNode index;
		
		//initialization of List1
		l[0]=new ListNode(1);
		index=l[0];
		index.next=new ListNode(2);
		index=index.next;
		index.next=new ListNode(4);
		index=index.next;
		index.next=new ListNode(16);
		
		//initialization of List2
		
		l[1]=new ListNode(3);
		index=l[1];
		index.next=new ListNode(5);
		index=index.next;
		index.next=new ListNode(7);
		
		//initialization of List3
		
		l[2]=new ListNode(6);
		index=l[2];
		index.next=new ListNode(8);
		index=index.next;
		index.next=new ListNode(9);
		index=index.next;
		index.next=new ListNode(10);
		index=index.next;
		index.next=new ListNode(11);
		
		index=l[0];
		System.out.print("L1:");
		while(index!=null){
			System.out.print(""+index.val+" ");
			index=index.next;
		}
		System.out.println();
		
		index=l[1];
		System.out.print("L2:");
		while(index!=null){
			System.out.print(""+index.val+" ");
			index=index.next;
		}
		System.out.println();
		
		index=l[2];
		System.out.print("L3:");
		while(index!=null){
			System.out.print(""+index.val+" ");
			index=index.next;
		}
		System.out.println();
		
		//index=MergeKLists.mergeKLists(l);
		index=MergeKListsPriorityQueue.mergeKLists(l);
		
		System.out.print("Result:");
		while(index!=null){
			System.out.print(""+index.val+" ");
			index=index.next;
		}
	}

}
