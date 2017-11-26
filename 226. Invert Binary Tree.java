
public TreeNode invertTree(TreeNode root)
{
	if (root == null){
		return null;
	}
	LinkedList<TreeNode> list = new LinkedList<>();
	list.add(root);
	while (!list.isEmpty()){
		TreeNode current = list.poll();
		TreeNode temp = current.left;
		current.left = current.right;
		current.right = temp;

		if(current.left != null){
			list.add(current.left);
		}
		if(current.right != null){
			list.add(current.right);
		}
	}
	return root;
}


public class Solution {
    public TreeNode invertTree(TreeNode root)
    {
        if (root == null){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode current = stack.pop();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;

            if(current.left != null){
                stack.push(current.left);
            }
            if(current.right != null){
                stack.push(current.right);
            }
        }
        return root;
    }
}


/*迭代*/
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        invert(root);
        return root;
    }
    
    public void invert(TreeNode tree){
        if (tree == null)
            return ;
        TreeNode temp = tree.left;
        tree.left = tree.right;
        tree.right = temp;
        invert(tree.left);
        invert(tree.right);
    }
}



TreeNode left = root.left;
TreeNode right = root.right;
root.left = invertTree(right);
root.right = invertTree(left);
return root;