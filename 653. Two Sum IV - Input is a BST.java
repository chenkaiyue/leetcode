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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return dfs(root,set,k);
    }
    
    public boolean dfs(TreeNode root, HashSet<Integer> set, int k)
    {
        if (root == null){
            return false;
        }
        if (set.contains(k-root.val)){
            return true;
        }
        set.add(root.val);
        return dfs(root.left, set, k) || dfs(root.right, set, k);
    }
}


----------------------
public  boolean findTarget(TreeNode root, int k){
    List<Integer> list = new ArrayList<>();
    inorder(list,root);
    for (int i=0,j=list.length()-1;i<j;){
        if (list.get(i) + list.get(j) == k)
            return true;
        if (list.get(i) + list.get(j) < k)
            i++;
        else
            j--;
    }
    return false;
}

public void inorder(List<Integer> list,TreeNode root){
    if (root == null){
        return;
    }
    inorder(root.left);
    list.add(root.val);
    inorder(root.right);
}