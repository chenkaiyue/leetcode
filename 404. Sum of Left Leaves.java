/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int sum =0;    
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;
        sum(root);
        return sum;
    }
    
    public void sum(TreeNode root){
        if (root == null)
            return ;
        if ((root.left != null) && (root.left.left == null) && (root.left.right == null))
            sum += root.left.val;
        sum(root.left);
        sum(root.right);
    }
    
}


class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum =0;  
        LinkedList<TreeNode> list = new LinkedList<>();
        if (root == null)
            return 0;
        list.add(root);
        while (!list.isEmpty()){
            TreeNode current = list.poll();
            if ((current.left != null) && (current.left.left == null) && (current.left.right == null))
                sum += current.left.val;
            if (current.left != null)
                list.add(current.left);
            if (current.right != null)
                list.add(current.right);
        }
        return sum;
    }   
}