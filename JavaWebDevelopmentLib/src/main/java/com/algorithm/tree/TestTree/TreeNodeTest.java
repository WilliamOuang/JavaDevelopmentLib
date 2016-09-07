package com.algorithm.tree.TestTree;

import java.util.Stack;

import com.algorithm.tree.BinaryTree;

public class TreeNodeTest {

	public static void main(String[] args) {

		int[] array = {3,2,9};
		  TreeNode root = new TreeNode(array[0]);   //创建二叉树
		  for(int i=1;i<array.length;i++){
		   root.insert(root, array[i]);       //向二叉树中插入数据
		  }
		  preOrder(root);
		  System.out.println();
		  preOrderIterativeTraversal(root);
		  System.out.println();

//		  thePostOrderTraversal_Stack(root);
//		  System.out.println();
//		  theInOrderTraversal_Stack(root);
	}
	
	 public static void preOrder(TreeNode root){  //先根遍历
		  if(root!=null){
			   System.out.print(root.v+" ");

		   preOrder(root.left);

		   preOrder(root.right);

		 
		  }
	}
	 
	 public static void thePostOrderTraversal_Stack(TreeNode root) {   //后序遍历
		    Stack<TreeNode> stack = new Stack<TreeNode>();
		    Stack<TreeNode> output = new Stack<TreeNode>();//构造一个中间栈来存储逆后序遍历的结果
		    TreeNode node = root;
		    while (node != null || stack.size() > 0) {
		      if (node != null) {
		        output.push(node);
		        stack.push(node);				
		        node = node.right;
		      } else {
		        node = stack.pop();				
		        node = node.left;
		      }
		    }
		    while (output.size() > 0) {
		      //System.out.println(output.pop().v);
		      System.out.print(output.pop().v+" ");
		    }
		  }
	 
	 public static void preOrderIterativeTraversal(TreeNode root){  //先根遍历
		  Stack<TreeNode> stack= new Stack();
		  if(root!=null){
			  stack.push(root);
			  while(!stack.isEmpty()){
				  TreeNode noTreeNode=	  stack.pop();
				   System.out.print(noTreeNode.v+" ");
				   if(noTreeNode.right!=null){
					  stack.push(noTreeNode.right);
				   }
				   if(noTreeNode.left!=null){
					   stack.push(noTreeNode.left);
				   }
				  
			  }
			  
		  }
	}
	 
	 
	 public static void theInOrderTraversal_Stack(TreeNode root) {  //中序遍历
		    Stack<TreeNode> stack = new Stack<TreeNode>();
		    TreeNode node = root;
		    while (node != null || stack.size() > 0) {
		      if (node != null) {
		        stack.push(node);   //直接压栈
		        node = node.left;
		      } else {
		        node = stack.pop(); //出栈并访问
		        System.out.print(node.v+" ");
		        node = node.right;
		      }
		    }
		  }

}
