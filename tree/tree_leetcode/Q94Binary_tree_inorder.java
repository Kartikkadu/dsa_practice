package tree_leetcode;

import java.util.*;

import tree_leetcode.Q71validate_BST.TreeNode;

public class Q94Binary_tree_inorder {
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
	    public List<Integer> inorderTraversal(TreeNode root) {
	        List<Integer> result = new ArrayList<>();
	        inorder(root, result);
	        return result;
	    }

	    private void inorder(TreeNode node, List<Integer> result) {
	        if (node == null) return;

	        inorder(node.left, result);
	        result.add(node.val);
	        inorder(node.right, result);
	    }
	}
}
