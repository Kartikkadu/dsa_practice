package tree_leetcode;

import tree_leetcode.Q236Lowest_Common_Ancestor_of_a_Binary_Tree.TreeNode;

public class Q534diameter_of_binarytree {
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
	    public int diameterOfBinaryTree(TreeNode root) {
	        return max(root );
	    }
	    private int max(TreeNode root) {
			if (root==null) {
				return 0;
			}
			
			int left=max(root.left);
			int right=max(root.right);
			int h=hieght(root.left)+hieght(root.right)+2;
			return Math.max(h, Math.max(right, left));
			
	    }
		public int hieght(TreeNode root) {
	    	if (root==null) {
				return 0;
			}
	    	int left=hieght(root.left);
	    	int right=hieght(root.right);
	    	return Math.max(left, right)+1;
	    }
	}

}
