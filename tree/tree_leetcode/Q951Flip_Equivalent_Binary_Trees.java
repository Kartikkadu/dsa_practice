package tree_leetcode;

import tree_leetcode.Q226_nvertTree.TreeNode;

public class Q951Flip_Equivalent_Binary_Trees {
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
	class Solution{
	 public boolean flipEquiv(TreeNode nn, TreeNode mm) {
		 if (nn==null&&mm==null) {
				return true;
			}
			 if(nn==null&&mm==null) {
				 return false;
			 }
			 if (nn.val!=mm.val) {
				return false;
			}
			 Boolean flip=flipEquiv(nn.left, mm.right)&&flipEquiv(nn.right, mm.left);
			 Boolean noflip=flipEquiv(nn.left, mm.left)&&flipEquiv(nn.right, mm.right);
			 return flip||noflip;
	    }
	}
}
