package tree_leetcode;

import tree_leetcode.Q199Binary_Tree_Right_Side_View.TreeNode;

public class Q404Sum_of_Left_Leaves {
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
		public int sumOfLeftLeaves(TreeNode root) {

			return sum(root, 0);
		}

		public int sum(TreeNode root, int add) {
			if (root == null) {
				return 0;
			}
			int left = sum(root.left, add);
			int right = sum(root.right, add);
			return add = add + root.left.val;
		}
	}

}
