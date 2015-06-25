package com.Edward.mergeKSortedList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKListsPriorityQueue {
	public static ListNode mergeKLists(ListNode[] lists){
		ListNode head;
		if(lists.length==0){
			return null;
		}
		head=new ListNode();
		PriorityQueue<ListNode> queue=new PriorityQueue<ListNode>(lists.length,new Comparator<ListNode>() {
			public int compare(ListNode a,ListNode b){
				if(a.val<b.val){
					return -1;
				}else if(a.val>b.val){
					return 1;
				}else if(a.val==b.val){
					return 0;
				}else{
					System.out.println("Error with Node comparing!");
					return Integer.MAX_VALUE;
				}
			}
		});
		for(int i=0;i<lists.length;i++){
			if(lists[i]!=null)
				queue.add(lists[i]);
		}
		ListNode p=head;
		
		while(queue.size()>0){
			ListNode tmp= queue.poll();
			p.next=tmp;
			if(tmp.next!=null)
				queue.add(tmp.next);
			p=p.next;
		}
		
		return head.next;
	}
}
