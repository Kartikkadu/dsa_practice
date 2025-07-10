package binarytree;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {
	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public BinaryTree() {
		root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		Boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = CreateTree();
		}
		Boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CreateTree();
		}
		return nn;
	}

	public void Display() {
		Display(root);
	}

	public void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String s = "<--" + nn.val + "-->";
		if (nn.left != null) {
			s = nn.left.val + s;

		} else {
			s = "." + s;

		}
		if (nn.right != null) {
			s = s + nn.right.val;

		} else {
			s = s + ".";

		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}
	public int max() {
		return max(root);
		
	}

	private int max(Node nn) {
		// TODO Auto-generated method stub
		if (nn==null) {
			return Integer.MIN_VALUE;
		}
		
		int lmax=max(nn.left);
		int rmax=max(nn.right);
		return Math.max(nn.val,Math.max(lmax, rmax));
		
	}
	public Boolean find(int item) {
		return find(this.root,item);
	}
	public Boolean find(Node nn,int item) {
		if (nn==null) {
			return false;
		}
		if (nn.val==item) {
			return true;
		}
		Boolean l=find(nn.left, item);
		Boolean r=find(nn.right, item);
		return l||r;
	}
	public int hieght() {
		return hieght(root);
	}

	private int hieght(Node nn) {
		if (nn==null) {
			return -1;
		}
		// TODO Auto-generated method stub
		int lh=hieght(nn.left);
		int rh=hieght(nn.right);
		return Math.max(lh, rh)+1;
	}
	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.val + " ");
		PreOrder(node.left);
		PreOrder(node.right);
	}

	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}

	private void INOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		INOrder(node.left);
		System.out.print(node.val + " ");
		INOrder(node.right);
	}

	public void POStOrder() {
		POStOrder(this.root);
		System.out.println();
	}

	private void POStOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		POStOrder(node.left);
		POStOrder(node.right);
		System.out.print(node.val + " ");
	}

	public void levelOrder() {
//		LinkedList<Node> q = new LinkedList<>();
		LinkedList<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node rv = q.remove();// remove fisrt
			System.out.print(rv.val + " ");
			if (rv.left != null) {
				q.add(rv.left);
			}
			if (rv.right != null) {
				q.add(rv.right);
			}

		}
		System.out.println();

	}
		
	
}
