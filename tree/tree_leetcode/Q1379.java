package tree_leetcode;

import tree_leetcode.Q71validate_BST.TreeNode;

public class Q1379 {
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
	    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
	        return ans(original,cloned,target);
	    }

		private TreeNode ans(TreeNode root, TreeNode rootc, TreeNode target) {
			if (rootc==null) {
				return null;
				
			}
			if (root==target) {
				return rootc;
			}
			TreeNode left=ans(root.left, rootc.left, target);
			TreeNode right=ans(root.right, rootc.right, target);
			if (left != null) return left;
			return right;
		}
	    
	}

}
