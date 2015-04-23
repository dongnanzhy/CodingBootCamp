package Challenge3;

import java.util.ArrayList;

import Challenge2.BuildTree.TreeNode;

public class SerializeTree {
	public void preorder(TreeNode node, ArrayList<String> rst) {
		if (node == null) {
			rst.add("#");
			return;
		}
		rst.add(String.valueOf(node.val));
		preorder(node.left, rst);
		preorder(node.right, rst);
	}
	public void levelorder(TreeNode node, ArrayList<String> rst) {
		
	}
	
	public void serialize(TreeNode root) {
		ArrayList<String> rst = new ArrayList<String>();
		preorder(root, rst);
	}
}
