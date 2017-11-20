class Solution(object):
	def hamming(self,x,y):
		return bin(x^y).count('1')