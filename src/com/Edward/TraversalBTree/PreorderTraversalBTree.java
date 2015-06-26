package com.Edward.TraversalBTree;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversalBTree {
	public static List<Integer> preorderTraversalMorris(TreeNode root){
		//Morris Method
		if(root==null)
			return new ArrayList<Integer>();
		List<Integer> list=new ArrayList<Integer>();
		TreeNode p=root,temp;
		while(p!=null){
			if(p.left==null){
				list.add(Integer.valueOf(p.val));
				p=p.right;
			}else{
				temp=p.left;
				while(temp.right!=null&&temp.right!=p)
					temp=temp.right;
				if(temp.right==null){
					temp.right=p;
					list.add(Integer.valueOf(p.val));
					p=p.left;
				}else{
					//temp.right==p
					temp.right=null;
					p=p.right;
				}
			}
		}
		return list;
	}
	
	public static List<Integer> preorderTraversalRecursion(TreeNode root){
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> listLeft,listRight;
		
		if(root==null)
			return new ArrayList<Integer>();
		
		list.add(Integer.valueOf(root.val));
		if(root.left!=null){
			listLeft=preorderTraversalRecursion(root.left);
			list.addAll(listLeft);
		}
		if(root.right!=null){
			listRight=preorderTraversalRecursion(root.right);
			list.addAll(listRight);
		}
		
		return list;
	}
}
