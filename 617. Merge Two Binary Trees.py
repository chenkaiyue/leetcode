class TreeNode(object):
	def __init__(self,x):
		self.val = x
		self.left = None
		self.right = None

class Solution(object):
	def mergeTrees(self,t1,t2):
		if not t1 and not t2:
			return None
		newNode = TreeNode((t1.val if t1 else 0)+(t2.val if t2 else 0))
		newNode.left = self.mergeTrees(t1 and t1.left,t2 and t2.left)
		newNode.right = self.mergeTrees(t1 and t1.right,t2 and t2.right)
		return newNode