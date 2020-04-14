package com.ThirtyDayLeetChallenge.letsdotit;

public class Day14 {

	public String stringShift(String s, int[][] shift) {
	       int[] index = new int[2];
	        for(int[]x:shift){
	            if(x[0] ==0)index[0]+=x[1];
	                else
	                    index[1]+=x[1];
	        }
	        
	        if(index.length == 2){
	            if(index[0] >index[1]){
	                return leftRotate(s,index[0]-index[1]);
	                
	            }else if(index[0] < index[1]){
	                return rightRotate(s,index[1]-index[0]);
	            }
	            return s;
	        }
	        return leftRotate(s,index[0]);
	        
	        
	    }
	    
	    public String leftRotate(String s, int times){
	        char[] arr = s.toCharArray();
	        for( int i=0;i<times;i++){
	            char temp = arr[0];
	            for(int j=0;j<arr.length-1;j++){
	                arr[j] = arr[j+1];
	            }
	            arr[arr.length-1]= temp;
	        }
	       return new String(arr);
	    }
	    
	    public String rightRotate(String s, int times){
	         char[] arr = s.toCharArray();
	        for(int j=0;j<times;j++){
	            char temp = arr[arr.length-1];
	        for(int i=arr.length-1;i>0;i--){
	           arr[i]= arr[i-1]; 
	        }
	            arr[0] = temp;
	        }
	        return new String(arr);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
