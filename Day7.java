package com.ThirtyDayLeetChallenge.letsdotit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day7 {
	
	public static int countElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i] + 1)) {
                count += 1;
            }
        }
        
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countElements(new int[] {1,1,2}));

	}

}
