package tree_leetcode;

import tree_leetcode.Q112_pathsum.TreeNode;

public class Q129Sum_Root_to_Leaf_Numbers {
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

	public int sumNumbers(TreeNode root) {
		return sum(root,false);

	}
	public int sum(TreeNode root, Boolean isleft) {
		if (root == null) {
			return 0;
		}
        if(root.left==null&&root.right==null){
            if(isleft){
            return root.val;
            }
        }
		int left = sum(root.left, true);
		int right=sum(root.right, false);
        
        
		return  left+right;
	}

}
