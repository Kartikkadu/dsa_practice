package tree_leetcode;

import tree_leetcode.Q226_nvertTree.TreeNode;

public class Q112_pathsum {
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
public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) {
        	return false;
        }
        if (root.left==null&&root.right==null) {
			targetSum=targetSum-root.val;
			if (targetSum==0) {
				return true;
			}
		}
        boolean left=hasPathSum(root.left, targetSum-root.val);
        boolean right=hasPathSum(root.right, targetSum-root.val);
        return left||right;
    }

}
