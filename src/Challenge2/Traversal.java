package Challenge2;
import java.util.*;

import Challenge2.BuildTree.TreeNode;

public class Traversal {
/*	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {x = val;}
	}
*/
    
	public void Inorder_traversal (BuildTree.TreeNode root, ArrayList<Integer> result) {
		if (root == null) {
			return;
		}
		Inorder_traversal(root.left, result);
		result.add(root.val);
		Inorder_traversal(root.right, result);
		return;
	}
	
    public ArrayList<Integer> inorderTraversal(BuildTree.TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null) {
        	return list;
        }
        Stack<BuildTree.TreeNode> stack = new Stack<BuildTree.TreeNode>();
        BuildTree.TreeNode node = root;
        stack.push(root);
        boolean check = true;
        while (!stack.isEmpty() || node.right != null) {
        	if(check && node.left != null) {
        		stack.push(node.left);
        		node = node.left;
        	} else {
        		if (node.right != null) {
               		if (check) {
               			node = stack.pop();
               			list.add(node.val);
               		}
        			stack.push(node.right);
        			node = node.right;
        			check = true;
        		} else {
                		node = stack.pop();
                		list.add(node.val);
                		check = false;
        		}
        	}
        }
        return list;
    }
    
    public ArrayList<Integer> inorderTraversal2(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null) {
        	return list;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        //stack.push(root);
        //boolean check = true;
        while (!stack.isEmpty() || node != null) {
        	if( node != null) {
            	stack.push(node);
        		node = node.left;
        	} else {
        		node = stack.pop();
        		list.add(node.val);
        		node = node.right;
        	}
        }
        return list;
    }
	public static void main (String[] args) {
		int[] num = {1,2,'#',4,5,6};
		BuildTree build = new BuildTree();
		BuildTree.TreeNode root = build.buildTree(num);
		
		Traversal travel = new Traversal();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		result = travel.inorderTraversal2(root);
		
		System.out.println(result);
	}
}
    
    

