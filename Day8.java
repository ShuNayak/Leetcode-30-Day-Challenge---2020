package com.ThirtyDayLeetChallenge.letsdotit;

public class Day8 {
	public static class ListNode{
		ListNode next;
		int data;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	
public static ListNode middleNode(ListNode head) {
        
        if( null == head) return null;
        int len =0;
        int count =0;
        ListNode temp = head;
        
        while( temp != null){
            temp = temp.next;
            len++;
        }
        
        if(len%2 == 0){
            while(count!= (len/2)){
                head = head.next;
                count++;
            }
            return head;
        }else{
            while(count!= Math.ceil(len/2)-1){
                head= head.next;
                count++;
            }
            return head;
        }
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode root = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		ListNode six = new ListNode(6);
		
		root.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		
		
		ListNode node= middleNode(root);
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}

	}

}
