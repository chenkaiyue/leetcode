public class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int x){
		val = x;
	}
}

// public class Solution{
// 	public TreeNode mergeTrees(TreeNode t1,TreeNode t2){
// 		if (t1==null && t2 == null)
// 			return null;

// 		int val = (t1==null?0:t1.val)+(t2==null?0:t2.val);
// 		TreeNode newNode = new TreeNode(val)
// 		newNode.left = mergeTrees(t1==null?null:t1.left,t2==null?null:t2.left);
// 		newNode.right = mergeTrees(t1=null?null:t1.right,t2==null?null:t2.right);

// 		return newNode; 

// 		if (t2 == null)
// 			return t2
// 		if (t2 == null)
// 			return t1
// 		TreeNode newTree = new TreeNode(t1.val+t2.val)
// 		newTree.left = mergeTrees(t1.left,t2.left)
// 		newTree.right = mergeTrees


// 	}
// }

public class Solution{
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        TreeNode newt = new TreeNode(t1.val += t2.val);
        newt.left = mergeTrees(t1.left, t2.left);
        newt.right = mergeTrees(t1.right, t2.right);
        return newt;
    }
}

