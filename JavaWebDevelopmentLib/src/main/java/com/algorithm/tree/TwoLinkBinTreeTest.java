package com.algorithm.tree;

import org.junit.Test;

public class TwoLinkBinTreeTest {

  @Test
  public void test() {
    TwoLinkBinTree<String> binTree = new TwoLinkBinTree<String>("根");
    
    TwoLinkBinTree.TreeNode node1 = binTree.addNode(binTree.getRoot(), "1根左", true);
    TwoLinkBinTree.TreeNode node2 = binTree.addNode(binTree.getRoot(), "1根右", false);
    TwoLinkBinTree.TreeNode node3 = binTree.addNode(node2, "2根右左", true);
    TwoLinkBinTree.TreeNode node4 = binTree.addNode(node2, "2根右右", false);
    TwoLinkBinTree.TreeNode node5 = binTree.addNode(node4, "22根右右左", true);
    TwoLinkBinTree.TreeNode node6 = binTree.addNode(node3, "21根右左右", false);
    TwoLinkBinTree.TreeNode node7 = binTree.addNode(node6, "根右左右右", false);
    
    System.out.println("node2的左子节点：" + binTree.getLeft(node2).data);
    System.out.println("node2的右子节点：" + binTree.getRight(node2).data);
   
    System.out.println("node2的左子节点：" +  binTree.getLeft(node4).data);

    
    System.out.println("树的深度：" + binTree.getTreeDeep());
    
  }

}

