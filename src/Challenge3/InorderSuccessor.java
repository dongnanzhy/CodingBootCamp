package Challenge3;

import Challenge2.BuildTree.TreeNode;


public class InorderSuccessor {
	public TreeNode inorderSucc(TreeNode node) {
		if (node == null) return null;
		if (node.right != null) {
			return leftMostChild(node.right);
		} else {
			TreeNode q = node;
			TreeNode x = node.parent;
			while(x != null && x.left != q) {
				q = x;
				x = x.parent;
			}
			return x;
		}
	}
	public TreeNode leftMostChild(TreeNode node) {
		if (node == null) return null;
		while (node.left != null) {
			node = node.left;
		}
		return node;
	}
}
