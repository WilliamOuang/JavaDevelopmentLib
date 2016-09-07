package com.algorithm.tree;

public class TwoLinkBinTree<E> {

	  public static class TreeNode{

	    Object data;
	    TreeNode left;
	    TreeNode right;
	    
	    public TreeNode(){}
	    
	    public TreeNode(Object data){
	      this.data = data;
	    }
	    
	    public TreeNode(Object data, TreeNode left, TreeNode right) {
	      this.data = data;
	      this.left = left;
	      this.right = right;
	    }
	    
	  }
	  
	  private TreeNode root;
	  
	  //以默认的构造器创建
	  public TwoLinkBinTree(){
	    this.root = new TreeNode();
	  }
	  
	  //以指定根元素创建
	  public TwoLinkBinTree(E data){
	    this.root = new TreeNode(data);
	  }
	  
	  /**
	   * 为指定节点添加子节点
	   * @param parent 需要添加节点的父节点的索引
	   * @param data 新添加子节点的数据
	   * @param isLeft 是否是添加左子节点
	   * @return 新增的节点
	   */
	  public TreeNode addNode(TreeNode parent, E data, boolean isLeft){
	    if(parent == null){
	      throw new RuntimeException(parent + "节点为空，不能添加子节点！");
	    }
	    
	    if(isLeft && parent.left != null){
	      throw new RuntimeException(parent + "节点已有左子节点，不能添加左子节点！");
	    }
	    
	    if(!isLeft && parent.right != null){
	      throw new RuntimeException(parent + "节点已有右子节点，不能添加右子节点！");
	    }
	    
	    TreeNode newNode = new TreeNode(data);
	    if(isLeft){
	      parent.left = newNode;
	    }else{
	      parent.right = newNode;
	    }
	    
	    return newNode;
	  }
	  
	  //判断二叉树是否为空
	  public boolean isEmpty(){
	    return root.data == null;
	  }
	  
	  //获取根节点
	  public TreeNode getRoot(){
	    if(isEmpty()){
	      throw new RuntimeException("树为空，无法获取根节点！");
	    }
	    return root;
	  }
	  
	  //获取指定节点的左子节点
	  public TreeNode getLeft(TreeNode parent){
	    if(parent == null){
	      throw new RuntimeException(parent + "节点为空，不能获取子节点！");
	    }
	    
	    return parent.left == null ? null : parent.left;
	  }
	  
	  //获取指定节点的右子节点
	  public TreeNode getRight(TreeNode parent){
	    if(parent == null){
	      throw new RuntimeException(parent + "节点为空，不能获取子节点！");
	    }
	    
	    return parent.right == null ? null : parent.right;
	  }
	  
	  //获取指定节点的深度
	  private int getDeep(TreeNode node){
	    if(node == null){
	      return 0;
	    }
	    
	    if(node.left == null && node.right == null){
	      return 1;
	    }else{
	      int leftDeep = getDeep(node.left);
	      int rightDeep = getDeep(node.right);
	      
	      int max = leftDeep > rightDeep ? leftDeep : rightDeep;
	      return max + 1;
	    }
	  }
	  
	  public int getTreeDeep(){
	    return this.getDeep(root);
	  }
	  
	}
