package com.ThirtyDayLeetChallenge.letsdotit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Day2 {

	 public static boolean isHappy(int n) {
		    
		 Set<Integer> set = new HashSet<>();
	       while( n!= 1){
	           
	           int temp = n;
	           int sum =0;
	           ArrayList<Integer> arr = new ArrayList<>();
	           while (temp != 0){
	              arr.add(temp%10);
	              temp = temp/10;
	               
	           }
	           
	           //once we have all the digits in the list
	           for(int x:arr){
	               sum+=Math.pow(x,2);
	           }
	           n= sum;
	           if(set.contains(n)) return false;
	           set.add(sum);
	       }
	        return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
