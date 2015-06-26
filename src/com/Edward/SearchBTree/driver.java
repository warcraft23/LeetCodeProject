package com.Edward.SearchBTree;


public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//TreeNode nullNode=new TreeNode();
		
		TreeNode node1=new TreeNode(0);
		TreeNode node2=new TreeNode(-1);
		TreeNode node3=new TreeNode(3);
		
		node1.left=node2;
		//node2.right=node3;
		
		if(ValidateSearchBTree.isValidBSTInorder(node2)){
			System.out.println("BST!");
		}else{
			System.out.println("Not BST!");
		}
	}

}
