package tree_leetcode;

import java.util.ArrayList;
import java.util.List;

import tree_leetcode.Q129Sum_Root_to_Leaf_Numbers.TreeNode;

public class Q199Binary_Tree_Right_Side_View {

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
	    public List<Integer> rightSideView(TreeNode root) {
	    	List<Integer> ll = new ArrayList<>();
			rightside(root, 1, ll);
			return ll;
	    }
	    int max=0;
	    public void rightside(TreeNode root,int cl,List<Integer> ll){
	    	if (root==null) {
				return;
			}
	    	if (max<cl) {
				ll.add(root.val);
				max=cl;
			}
	    	rightside(root.left, cl+1, ll);
	    	rightside(root.right, cl+1, ll);
	    	
	    }
	}

}
