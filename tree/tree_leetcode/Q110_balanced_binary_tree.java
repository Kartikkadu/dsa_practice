package tree_leetcode;

import tree_leetcode.Q534diameter_of_binarytree.TreeNode;

public class Q110_balanced_binary_tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public boolean isBalanced(TreeNode root) {
			return isBalance(root).isbal;
	}
		public BalancePair isBalance(TreeNode root) {
			if (root == null) {
				return new BalancePair();
			}
			BalancePair l=isBalance(root.left);
			BalancePair r=isBalance(root.right);
			BalancePair h=new BalancePair();
			h.ht=Math.max(l.ht, r.ht)+1;
			boolean bal=Math.abs(l.ht-r.ht)<=1;
			h.isbal= l.isbal&&r.isbal&&bal;
			return h;

			
		}
		class BalancePair {
			boolean isbal = true;
			int ht = -1;
		}
}
}
