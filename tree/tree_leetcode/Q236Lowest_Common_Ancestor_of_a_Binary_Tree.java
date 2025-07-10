package tree_leetcode;

import tree_leetcode.Q404Sum_of_Left_Leaves.TreeNode;

public class Q236Lowest_Common_Ancestor_of_a_Binary_Tree {
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
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        return ans(root,p,q);
	    }

		private TreeNode ans(TreeNode root, TreeNode p, TreeNode q) {
			if (root==null) {
				return null;
			}
			if (p==root||q==root) {
				return root;
			}
			TreeNode left=lowestCommonAncestor(root.left, p, q);
			TreeNode right=lowestCommonAncestor(root.right, p, q);
			if (left!=null&&right!=null) {
				return root;
			}else if(left==null) {
				return right;
			}else {
				return left;
			}
			
			
		}
	}
	
}
