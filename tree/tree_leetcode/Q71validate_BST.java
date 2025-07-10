package tree_leetcode;

import tree_leetcode.Q701_inster_val_in_BST.TreeNode;

public class Q71validate_BST {
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
		public boolean isValidBST(TreeNode root) {
			return check(root).isbt;

		}

		public ispair check(TreeNode root) {
			// TODO Auto-generated method stub
			if (root == null) {
				return new ispair();
			}
			ispair l = check(root.left);
			ispair r = check(root.right);
			ispair m=new ispair();
			m.max=Math.max(l.max, Math.max(r.max, root.val));
			m.min=Math.min(l.min, Math.min(r.min, root.val));
			if (l.isbt==r.isbt&&l.max<root.val&&r.min>root.val) {
				m.isbt=true;
			}
			else {
				m.isbt=false;
			}
			return m;

		}

		class ispair {
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
			boolean isbt = true;
		}
	}

}
