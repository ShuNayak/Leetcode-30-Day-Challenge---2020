package com.ThirtyDayLeetChallenge.letsdotit;

public class Day4 {

	public void moveZeroes(int[] nums) {
	      
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[count++]=nums[i];
            }
        }
        while(count<nums.length)
            nums[count++]=0;
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
