package com.ThirtyDayLeetChallenge.letsdotit;

import java.util.Collections;
import java.util.PriorityQueue;

public class Day12 {

	 public int lastStoneWeight(int[] stones) {
	        // problem statement says - at most one stone is left
	        // this means, all of them are going to be destroyed in some way
	        // Therefore, there is no need to preserve the index for elements
	        // This is why the heap could be used here
	        
	        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	        
	        for (Integer st: stones) {
	            maxHeap.add(st);
	        }
	        
	        
	        while (maxHeap.size() > 1) {
	            int x = maxHeap.poll();
	            int y = maxHeap.poll();
	            if (x == y) {
	                continue;
	            }
	            maxHeap.add(Math.abs(x-y));
	        } // end while
	        
	        if (maxHeap.size() == 0) {
	            return 0;
	        } else {
	            return maxHeap.peek();
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
