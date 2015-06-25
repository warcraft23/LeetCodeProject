package com.Edward.InorderTraversalBTree;

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
		
		//list=(ArrayList<Integer>)InorderTraversalBTree.inorderTraversal(nullNode);
		list=(ArrayList<Integer>)InorderTraversalBTree.inorderTraversalMorris(node1);
		
		for(Integer e:list){
			System.out.print(""+e.toString()+" ");
		}
		
		System.out.println();
		
	}

}
