package Challenge2;

import java.util.*;

import Challenge2.BuildTree.TreeNode;

public class LCA {
	public int leastCommonAncestor (TreeNode root, TreeNode node1, TreeNode node2) {
		if (root == null || node1 == null || node2 == null) {
			return -256;
		}
		
		 Queue<TreeNode> que = new LinkedList<TreeNode>();
	     que.offer(root);
	     TreeNode node = root;
	     while (!que.isEmpty()) {
	        int size = que.size();
	        for (int i = 0; i < size; i++) {
	        	node = que.poll();
	        	if (node.left != null && node.right != null) {
	        		if ((helper(node.left, node1) && helper(node.right, node2))
	        				|| (helper(node.left, node2) && helper(node.right, node1))) {
	        			return node.val;
	        		}
	        	} 
		        if (node.left != null) {
		        	que.offer(node.left);
		        }
		        if (node.right != null) {
		        	que.offer(node.right);
		        }
   	
	        }
	     }
	     return -256;
	}
	
	public boolean helper (TreeNode root, TreeNode node) {
		if (root == null) {
			return false;
		}
		
		if (root == node) {
			return true;
		} else {
			return (helper (root.left, node) || helper(root.right, node));
		} 
	}
	
    public static void main (String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9};
		BuildTree build = new BuildTree();
		TreeNode root = build.buildTree(num);
		TreeNode node1 = root.right.left;
		TreeNode node2 = root.left.left.right;
		
    	LCA lca = new LCA();
    	System.out.println(lca.leastCommonAncestor(root,node1,node2));
    }
}
