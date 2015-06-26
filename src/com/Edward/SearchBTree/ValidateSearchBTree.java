package com.Edward.SearchBTree;

public class ValidateSearchBTree {
	static TreeNode pre;
	public static boolean isValidBST(TreeNode root){
		return isValidBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);		
	}
	
	public static boolean isValidBST(TreeNode root,int lower,int upper){
		if(root==null)
			return true;
		if(root.val==Integer.MIN_VALUE){
			if(root.right!=null)
				return root.left==null&&
						root.val<root.right.val&&
						isValidBST(root.right, root.val, upper);
			else
				return root.left==null&&
				isValidBST(root.right, root.val, upper);
		}else if(root.val==Integer.MAX_VALUE){
			if(root.left!=null)
				return root.right==null&&
						root.left.val<root.val&&
						isValidBST(root.left, lower, root.val);
			else
				return root.right==null&&
				isValidBST(root.left, lower, root.val);
		}else{
			return lower<root.val&&
					root.val<upper&&
					isValidBST(root.left,lower,root.val)&&
					isValidBST(root.right,root.val,upper);
		}	
	}
	public static boolean isValidBSTInorder(TreeNode root){
		if(root!=null){
			//Left sub-tree is not BST ,then return false
			if(!isValidBSTInorder(root.left)) return false;
			
			//pre.val must be smaller than current
			if(pre!=null&&root.val<=pre.val) return false;
			
			//update the pre
			pre=root;
			
			//check the right sub-tree
			return isValidBSTInorder(root.right);
		}
		return true;
	}
}
