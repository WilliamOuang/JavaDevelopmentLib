package com.algorithm.tree.TestTree;

public class TreeNode{
	int v;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data)    //实例化二叉树类
	 {
	  this.v = data;
	  left = null;
	  right = null;
	 }
	
	public void insert(TreeNode root,int newnode){
		if(root.v>newnode){
			if(root.right==null){
				root.right= new TreeNode(newnode);
			}else{
				this.insert(root.right, newnode);
			}
		}else{
			if(root.left==null){
				root.left=new TreeNode(newnode);
			}else{
				this.insert(root.left, newnode);
			}
		}
	}
	
}
