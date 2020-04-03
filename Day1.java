package com.ThirtyDayLeetChallenge.letsdotit;

import java.util.HashMap;
import java.util.Map;

public class Day1 {

	 public static int singleNumber(int[] nums) {
	        Map<Integer, Integer> map = new HashMap<>();
	        for(int x:nums){
	            map.put(x,map.getOrDefault(x,0)+1);
	        }
	        
	        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
	            if(entry.getValue()==1){
	                return entry.getKey();
	            }
	        }
	        return -1;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
