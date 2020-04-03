package com.ThirtyDayLeetChallenge.letsdotit;

public class Day3 {

public static int maxSubArray(int[] nums) {
        
        //using Kadenes Algorithm, max_end_here and max_sum_so_far
        int max_end_here=0, max_so_far=Integer.MIN_VALUE;
        for(int x:nums){
            max_end_here +=x;
            max_so_far= Math.max(max_so_far, max_end_here);
            if(max_end_here<0) max_end_here =0;
            
        }
        return max_so_far;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxSubArray(new int[] {-1}));
	}

}
