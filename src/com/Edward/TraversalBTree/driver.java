package com.Edward.TraversalBTree;

import java.util.ArrayList;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=null;
		
		//TreeNode nullNode=new TreeNode();
		
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(3);
		
		node2.left=node3;
		node1.right=node2;
		
		System.out.print("Inorder Traversal:");
		//list=(ArrayList<Integer>)InorderTraversalBTree.inorderTraversal(nullNode);
		list=(ArrayList<Integer>)InorderTraversalBTree.inorderTraversalMorris(node1);
		
		for(Integer e:list){
			System.out.print(""+e.toString()+" ");
		}
		
		System.out.println();
		System.out.print("Preorder Traversal:");

		list=(ArrayList<Integer>)PreorderTraversalBTree.preorderTraversalMorris(node1);
		//list=(ArrayList<Integer>)PreorderTraversalBTree.preorderTraversalRecursion(node1);
		for(Integer e:list){
			System.out.print(""+e.toString()+" ");
		}
		
		System.out.println();
		
		System.out.print("Postorder Traversal:");

		list=(ArrayList<Integer>)PostorderTraversalBTree.postorderTraversalMorris(node1);
		//list=(ArrayList<Integer>)PreorderTraversalBTree.preorderTraversalRecursion(node1);
		for(Integer e:list){
			System.out.print(""+e.toString()+" ");
		}
		
		System.out.println();
	}

}
