package com.Edward.TraversalBTree;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversalBTree {
	public static List<Integer> postorderTraversalRecursion(TreeNode root){
		
		//recursion method
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> listLeft,listRight;
		
		if(root==null)
			return new ArrayList<Integer>();
		
		
		if(root.left!=null){
			listLeft=postorderTraversalRecursion(root.left);
			list.addAll(listLeft);
		}
		if(root.right!=null){
			listRight=postorderTraversalRecursion(root.right);
			list.addAll(listRight);
		}
		list.add(Integer.valueOf(root.val));
		
		return list;
	}
	
	public static List<Integer> postorderTraversalMorris(TreeNode root){
		//Morris Method
		List<Integer> list = new ArrayList<Integer>();
		TreeNode p,temp;
		TreeNode dump=new TreeNode(0);
		dump.left=root;
		p=dump;
		
		while(p!=null){
			if(p.left==null){
				p=p.right;
			}else{
				temp=p.left;
				while(temp.right!=null&&temp.right!=p)
					temp=temp.right;
				if(temp.right==null){
					temp.right=p;
					p=p.left;
				}else{
					//temp.right==p
					temp.right=null;
					reverseTraversal(list, p.left, temp);
					p=p.right;
				}
			}
		}
		return list;
	}
	
	public static void reverseTraversal(List<Integer> list,TreeNode from,TreeNode to){
		if(from!=null&&to!=null&&list!=null){
			TreeNode temp;
			temp=from;
			if(from!=to){
				from=from.right;
				reverseTraversal(list, from, to);
			}
			list.add(Integer.valueOf(temp.val));
		}
	}
}
