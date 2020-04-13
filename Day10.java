package com.ThirtyDayLeetChallenge.letsdotit;

import java.util.ArrayList;

public class Day10 {
	
	public int min = Integer.MAX_VALUE;
    public int len =0;
     ArrayList<Node> arr;
    
    
    public static class Node{
        int data;
        int minSoFar;
        
        public Node(int x){
            this.data =x;
        }
        
        
    }
    /** initialize your data structure here. */
    public Day10() {
        
        arr = new ArrayList<>();
       
    }
    
    public void push(int x) {
        min = Math.min(min, x);
        Node node = new Node(x);
        node.minSoFar = min;
        
        arr.add(node);
        len++;       
    }
    
    public void pop() {
        if(len != 0){
            arr.remove(len-1);
            len = len-1;
        }
        if(len!= 0){
            min = arr.get(len-1).minSoFar;
        }else{
            min = Integer.MAX_VALUE;
        }
        
    }
    
    public int top() {

		if(len!=0) {
			return arr.get(len-1).data;
		}else
			return -1;
        
    }
    
    public int getMin() {
    	if(len!=0)
        return arr.get(len-1).minSoFar;
    	else 
    		return -1;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
