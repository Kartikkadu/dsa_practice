package tree_leetcode;

public class Q101_symetric_tree {

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
	 public Boolean Solution(TreeNode nn,TreeNode mm) {
		 if (nn==null&&mm==null) {
			return true;
		}
		 if(nn==null||mm==null) {
			 return false;
		 }
		 if (nn.val!=mm.val) {
			return false;
		}
		 Boolean left=Solution(nn.left, mm.right);
		 Boolean right=Solution(nn.right, mm.left);
		 return left&&right;
	 }

}
