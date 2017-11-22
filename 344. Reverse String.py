class Solution(object):
	def reverseString(self,s):
		return s[::-1]


    def reverseString(self, s):
        l = len(s)
        if l < 2:
            return s
        return self.reverseString(s[l/2:]) + self.reverseString(s[:l/2])