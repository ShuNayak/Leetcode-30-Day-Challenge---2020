package com.ThirtyDayLeetChallenge.letsdotit;

public class Day11 {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }

	 public int diameterOfBinaryTree(TreeNode root) {
	        if(root == null ) return 0;
	        int left = height(root.left);
	        int right = height(root.right);
	        int h = left+right;
	        int leftD = diameterOfBinaryTree(root.left);
	        int rightD = diameterOfBinaryTree(root.right);
	        return Math.max(h,Math.max(leftD,rightD));
	    }
	    
	    public int height(TreeNode root){
	        if(root ==null) return 0;
	        int left = height(root.left);
	        int right = height(root.right);
	        return Math.max(left,right)+1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
