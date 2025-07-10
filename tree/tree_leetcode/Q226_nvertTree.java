package tree_leetcode;

import tree_leetcode.Q101_symetric_tree.TreeNode;

public class Q226_nvertTree {

	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	public TreeNode solution() {
		TreeNode root=new TreeNode();
		return inverse(root);
	}
	private TreeNode inverse(TreeNode root) {
		// TODO Auto-generated method stub
		if (root==null) {
			return null;
		}
		TreeNode left=inverse(root.left);
		TreeNode right=inverse(root.right);
		root.left=right;
		root.right=left;
		return root;
	}

}
