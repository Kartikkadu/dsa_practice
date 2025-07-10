package tree_leetcode;

import tree_leetcode.Q71validate_BST.TreeNode;

public class Q938Range_of_sum {
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
		public int rangeSumBST(TreeNode root, int low, int high) {
	        return path(root,low,high);
	    }
		public int path(TreeNode root,int low,int high) {
			if (root==null) {
				return 0;
			}
           
			
			int left=path(root.left, low, high);
			int right=path(root.right, low, high);
             if (root.val>=low&&root.val<=high) {
				return root.val+(right+left);
			}else{
			return left+right;
            }
		}}
}
