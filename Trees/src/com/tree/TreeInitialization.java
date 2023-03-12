package com.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeInitialization {

	public static void main(String[] args) {
		TreeNode<Integer> root = takeinput(true, 0, true);
		// System.out.println(root.data+" "+root.left+" "+root.right);
//        TreeNode<Integer> node1=new TreeNode(6);
//        TreeNode<Integer> node2=new TreeNode(7);
//        TreeNode<Integer> node3=new TreeNode(8);
//        root.left=node1;
//        root.right=node2;
//        node1.right=node3;
		
		print(root);
		//System.out.println("NumOfNodes:"+NumOfNodes(root));
		//preOrder(root);
		//System.out.println();
	//	postOrder(root);
	//	System.out.println();
		//InOrder(root);
	//	System.out.println(heightNode(root));
	//	System.out.println(LeafNode(root));
	//	printKdepth(root,2);
	//	System.out.println(diameter(root));
		//System.out.println(diameterTimeLess(root).diameter);
	//	LevelOrder(root);
		System.out.println();
		mirrortree(root);
		System.out.println();
		print(root);
	}

	private static void mirrortree(TreeNode<Integer> root) {
		if(root==null)
			return;
		TreeNode<Integer> temp=root.left;
		root.left=root.right;
		root.right=temp;
		mirrortree(root.left);
		mirrortree(root.right);	
		
	}

	public static void print(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L " + root.left.data + ",");
		}
		if (root.right != null) {
			System.out.print("R " + root.right.data);
		}
		System.out.println();
		print(root.left);
		print(root.right);
	}

	public static TreeNode<Integer> takeinput(boolean isRoot, int rootdata, boolean isleft) {
		Scanner sc = new Scanner(System.in);
		if (isRoot) {
			System.out.print("Enter the root ");
		} else {
			if (isleft)
				System.out.print("Enter the left node of "+rootdata+" ");
			else
				System.out.print("Enter the right node of "+rootdata+" ");
		}

		int x = sc.nextInt();
		if (x == -1) {
			return null; // returning node so return type null is also null
		}
		TreeNode<Integer> root = new TreeNode<>(x);
		TreeNode<Integer> left = takeinput(false, root.data, true);
		TreeNode<Integer> right = takeinput(false, root.data, false);
		root.left = left;
		root.right = right;
		return root;
	}
	
	public static int NumOfNodes(TreeNode<Integer> root) {
		if(root==null)
			return 0;
		int leftnodes=NumOfNodes(root.left);
		int rightnodes=NumOfNodes(root.right);
		int ans=1+leftnodes+rightnodes;
		return ans;
	}
	
	public static void preOrder(TreeNode<Integer> root) {
		if(root==null)
			return ;
		
		System.out.println(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void postOrder(TreeNode<Integer> root) {
		if(root==null)
			return ;
	
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data+" ");
	}
	
	public static void InOrder(TreeNode<Integer> root) {
		if(root==null)
			return ;
		
		InOrder(root.left);
		System.out.print(root.data+" ");
		InOrder(root.right);
	}
	
	public static int largestNode(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int largestleft=largestNode(root.left);
		int largestright=largestNode(root.right);
		int largest=Math.max(root.data,Math.max(largestleft, largestright));
		return largest;
	}
	
	public static int heightNode(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int largestleft=heightNode(root.left);
		int largestright=heightNode(root.right);
		int largest=1+Math.max(largestleft, largestright);
		return largest;
	}
	
	public static int LeafNode(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null&& root.right==null) {
			return 1;
		}
		int leafleft=LeafNode(root.left);
		int leafright=LeafNode(root.right);
		int ans=leafleft+leafright;
		return ans;
	}
	
	public static void printKdepth(TreeNode<Integer> root,int k) {
		if(root==null) {
			return ;
		}
		if(k==0) {
			System.out.println(root.data);
		}
		printKdepth(root.left,k-1);
		printKdepth(root.right,k-1);

	}
	
	public static int diameter(TreeNode<Integer> root) {
		if(root==null)
			return 0;
		int lheight=heightNode(root.left);
		int rheight=heightNode(root.right);
		int diameter=1+lheight+rheight;
		int ldiameter=diameter(root.left);
		int rdiameter=diameter(root.right);
		int ans=Math.max(diameter,Math.max(ldiameter, rdiameter));
		return ans;
	}
	
	public static TreeHeigDiam diameterTimeLess(TreeNode<Integer> root) {
		if(root==null) {	
			TreeHeigDiam ans=new TreeHeigDiam(0,0);
			return ans;			
		}
		TreeHeigDiam lTree=diameterTimeLess(root.left);
		TreeHeigDiam rTree=diameterTimeLess(root.right);
		int lheight=lTree.height;
		int ldiameter=lTree.diameter;
		int rheight=rTree.height;
		int rdiameter=rTree.diameter;
		int height=1+Math.max(lheight, rheight);
		int rootDiameter=1+lheight+rheight;
		int mainDiameter=Math.max(rootDiameter, Math.max(rdiameter,ldiameter));
		TreeHeigDiam ans=new TreeHeigDiam(height,mainDiameter);
		return ans;
	}
	
	public static void LevelOrder(TreeNode<Integer> root)
	{
		Queue<TreeNode<Integer>> q=new LinkedList<>();
		q.add(root);
		 while(!q.isEmpty()) {
			 root=q.remove();
			 System.out.print(root.data);
		
		 if(root.left!=null) {
			 q.add(root.left);
		 }
		 
		 if(root.right!=null) {
			 q.add(root.right);
		 }
		}
	}
	
	
}
