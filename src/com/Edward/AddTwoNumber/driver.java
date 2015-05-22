package com.Edward.AddTwoNumber;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialization
		ListNode result;
		ListNode l11=new ListNode(2);
		ListNode l12=new ListNode(4);
		ListNode l13=new ListNode(3);
		
		ListNode l21=new ListNode(5);
		ListNode l22=new ListNode(6);
		ListNode l23=new ListNode(4);
		
		l11.next=l12;
		l12.next=l13;
		
		l21.next=l22;
		l22.next=l23;
		
		result=AddTwoNumber.addTwoNumber(l11, l21);
		while(result!=null){
			System.out.print(""+result.value+" ");
			result=result.next;
		}
		
		
	}

}
