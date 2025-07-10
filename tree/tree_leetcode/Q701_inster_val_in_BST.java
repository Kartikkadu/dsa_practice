package tree_leetcode;

import tree_leetcode.Q404Sum_of_Left_Leaves.TreeNode;

public class Q701_inster_val_in_BST {
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
	    public TreeNode insertIntoBST(TreeNode root, int val) {
	        return insert(root,val);
	    }

		private TreeNode insert(TreeNode root, int val) {
			// TODO Auto-generated method stub
			if (root==null) {
				return new TreeNode(val);
			}
			if (root.val>val) {
				root.left=insert(root.left, val);
			} else {
				root.right=insert(root.right, val);

			}
			return root;
		}
	}

}
