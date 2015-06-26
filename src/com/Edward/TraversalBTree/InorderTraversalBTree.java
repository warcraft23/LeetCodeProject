package com.Edward.TraversalBTree;

import java.util.List;
import java.util.ArrayList;

public class InorderTraversalBTree {
	public static List<Integer> inorderTraversalRecursion(TreeNode root){
		
		//recursion method
		
		if(root==null){
			return new ArrayList<Integer>();
		}
		// Initialization
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> leftList=null;
		List<Integer> rightList=null;
		Integer mid=null;
		
		
		//Recursion
		if(root.left!=null)
		{
			leftList=inorderTraversalRecursion(root.left);
			list.addAll(leftList);
		}
		mid=Integer.valueOf(root.val);
		list.add(mid);
		if(root.right!=null)
		{
			rightList=inorderTraversalRecursion(root.right);
			list.addAll(rightList);
		}
		
		return list;
	}
	
	public static  List<Integer> inorderTraversalMorris(TreeNode root){
		//Morris method
		if(root==null){
			return new ArrayList<Integer>();
		}
		// Initialization
		List<Integer> list = new ArrayList<Integer>();
		
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
					//若此时左子树的最右节点的右指针未指向最右节点的后继
					//则此时p处于最右节点的父节点或祖父节点位置上
					temp.right=p;
					p=p.left;
				}else{
					//若此时左子树的最右节点的右指针已指向最右节点的后继
					//则已来到左子树的最右节点
					list.add(Integer.valueOf(p.val));
					temp.right=null;
					p=p.right;
				}
			}
		}
		return list;
	}
	
}
