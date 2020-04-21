package com.ThirtyDayLeetChallenge.letsdotit;

public class Day20 {
	
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			this.val =x;
		}
	}
	static int index =0;
    static int min = Integer.MIN_VALUE;
    static int max = Integer.MAX_VALUE;
    public static TreeNode bstFromPreorder(int[] preorder) {
        if (null == preorder || preorder.length ==0) return null;
        
        return bstUtils(preorder, index , preorder[0], min, max);
        
    }
    
    public static TreeNode bstUtils(int[] pre, int index , int key, int min, int max){
        
        if(index >= pre.length) return null;
        TreeNode root = null;
        if(key>min && key< max){
            root = new TreeNode(key);
            index = index+1;
            if(index<pre.length){
                root.left = bstUtils(pre, index ,pre[index], min, key);
                 root.right = bstUtils(pre, index ,pre[index], key, max);
                
            }
        }
        return root;
    }
    
     static void  printInorder(TreeNode node) { 
        if (node == null) { 
            return; 
        } 
        printInorder(node.left); 
        System.out.print(node.val + " "); 
        printInorder(node.right); 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int pre[] = new int[]{8,5,1,7,10,12}; 
	        TreeNode root = bstFromPreorder(pre); 
	        printInorder(root);
	}

}
