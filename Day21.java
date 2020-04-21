package com.ThirtyDayLeetChallenge.letsdotit;

import java.util.ArrayList;
import java.util.List;

public class Day21 {
	interface BinaryMatrix {
		     public int get(int x, int y);
		      public List<Integer> dimensions();
		  };
		  
	public static class MyObj implements BinaryMatrix{
		int[][] arr;
		
		public MyObj(int row,int col) {
			arr = new int[row][col];
		}

		@Override
		public int get(int x, int y) {
			// TODO Auto-generated method stub
			return arr[x][y];
		}

		@Override
		public List<Integer> dimensions() {
			// TODO Auto-generated method stub
			ArrayList<Integer> dim = new ArrayList<Integer>();
			if(arr == null || arr.length == 0) {
				dim.add(0,0);
				dim.add(1,0);
			}
			dim.add(arr.length);
			dim.add(arr[0].length);
			return dim;
		}
		
	}
	
	public static int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        
	       ArrayList<Integer> dim = (ArrayList<Integer>) binaryMatrix.dimensions();
	        int rows = dim.get(0);
	        int cols = dim.get(1);
	        int finalIndex =Integer.MAX_VALUE;
	        
	        for(int i=0;i<rows;i++){
	            int[] arr = new int[cols];
	            for(int j=0;j<cols;j++){
	               arr[j] = binaryMatrix.get(i,j); 
	            }
	            int index = leftmostindexOf1(arr, 0,cols-1);
	            if(index == -1) continue;
	            else
	            finalIndex = Math.min(finalIndex, index);
	        }
	        
	        return finalIndex==Integer.MAX_VALUE?-1:finalIndex;
	        
	    }
	    
	   public static int leftmostindexOf1(int[]arr, int low, int high) {
			
			if(low<=high) {
				int mid = (low+high)/2;

				if(arr[mid] == 1 && (mid ==0 || arr[mid-1]==0))return mid;
				
				if(arr[mid]==1) return leftmostindexOf1(arr, low, mid-1);
				return leftmostindexOf1(arr, mid+1, high);
			}
			return -1;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyObj obj = new MyObj(2, 2);
		int[][] arr = new int[][] {{0,0},{1,1}};
		obj.arr = arr;
		
		System.out.println(leftMostColumnWithOne(obj));
		
		

	}

}
